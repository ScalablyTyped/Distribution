package typings.winjs.WinJS.UI

import typings.winjs.Element
import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.UI.process")
@js.native
object process extends js.Object {
  /**
    * Applies declarative control binding to the specified element.
    * @param element The element to bind.
    * @returns A promise that is fulfilled after the control is activated. The value of the promise is the control that is attached to element.
    **/
  def apply(element: Element): Promise[_] = js.native
}

