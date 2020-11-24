package typings.winjs.global.WinJS.UI

import typings.winjs.Element
import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("WinJS.UI.processAll")
@js.native
object processAll extends js.Object {
  
  /**
    * Applies declarative control binding to all elements, starting at the specified root element.
    * @param rootElement The element at which to start applying the binding. If this parameter is not specified, the binding is applied to the entire document.
    * @param skipRoot If true, the elements to be bound skip the specified root element and include only the children.
    * @returns A promise that is fulfilled when binding has been applied to all the controls.
    **/
  def apply(): Promise[_] = js.native
  def apply(rootElement: js.UndefOr[scala.Nothing], skipRoot: Boolean): Promise[_] = js.native
  def apply(rootElement: Element): Promise[_] = js.native
  def apply(rootElement: Element, skipRoot: Boolean): Promise[_] = js.native
}
