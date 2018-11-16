package typings
package winjsLib.WinJSNs.ApplicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion Functions
//#region Events
@js.native
trait IPromiseEvent
  extends stdLib.CustomEvent[js.Any] {
  /**
           * Informs the application object that asynchronous work is being performed, and that this event handler should not be considered complete until the promise completes. This function can be set inside the handlers for all WinJS.Application events: onactivated oncheckpoint onerror onloaded onready onsettings onunload.
           * @param promise The promise that should complete before processing is complete.
          **/
  def setPromise(promise: winjsLib.WinJSNs.IPromise[_]): scala.Unit = js.native
}

