package typings.winjs.WinJS.Utilities

import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.Utilities.ready")
@js.native
object ready extends js.Object {
  /**
    * Ensures that the specified function executes only after the DOMContentLoaded event has fired for the current page. The DOMContentLoaded event occurs after the page has been parsed but before all the resources are loaded.
    * @param callback A function that executes after the DOMContentLoaded event has occurred.
    * @param async If true, the callback should be executed asynchronously.
    * @returns A promise that completes after the DOMContentLoaded event has occurred.
    **/
  def apply(): Promise[_] = js.native
  def apply(callback: js.Function): Promise[_] = js.native
  def apply(callback: js.Function, async: Boolean): Promise[_] = js.native
}

