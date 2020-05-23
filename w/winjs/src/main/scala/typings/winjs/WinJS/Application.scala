package typings.winjs.WinJS

import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides application-level functionality, for example activation, storage, and application events.
**/
@JSGlobal("WinJS.Application")
@js.native
object Application extends js.Object {
  //#endregion Functions
  //#region Events
  @js.native
  trait IPromiseEvent
    extends CustomEvent[js.Any] {
    /**
      * Informs the application object that asynchronous work is being performed, and that this event handler should not be considered complete until the promise completes. This function can be set inside the handlers for all WinJS.Application events: onactivated oncheckpoint onerror onloaded onready onsettings onunload.
      * @param promise The promise that should complete before processing is complete.
      **/
    def setPromise(promise: IPromise[_]): Unit = js.native
  }
  
}

