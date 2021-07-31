package typings.winjs.WinJS

import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides application-level functionality, for example activation, storage, and application events.
**/
object Application {
  
  //#endregion Functions
  //#region Events
  @js.native
  trait IPromiseEvent
    extends StObject
       with CustomEvent[js.Any] {
    
    /**
      * Informs the application object that asynchronous work is being performed, and that this event handler should not be considered complete until the promise completes. This function can be set inside the handlers for all WinJS.Application events: onactivated oncheckpoint onerror onloaded onready onsettings onunload.
      * @param promise The promise that should complete before processing is complete.
      **/
    def setPromise(promise: IPromise[js.Any]): Unit = js.native
  }
}
