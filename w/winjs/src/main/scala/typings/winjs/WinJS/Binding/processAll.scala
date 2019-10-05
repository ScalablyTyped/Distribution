package typings.winjs.WinJS.Binding

import typings.winjs.Element
import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.Binding.processAll")
@js.native
object processAll extends js.Object {
  /**
    * Binds the values of an object to the values of a DOM element that has the data-win-bind attribute. If multiple DOM elements are to be bound, you must set the attribute on all of them. See the example below for details.
    * @param rootElement Optional. The element at which to start traversing to find elements to bind to. If this parameter is omitted, the entire document is searched.
    * @param dataContext The object that contains the values to which the DOM element should be bound.
    * @param skipRoot If true, specifies that only the children of rootElement should be bound, otherwise rootElement should be bound as well.
    * @param bindingCache The cached binding data.
    * @param defaultInitializer The binding initializer to use in the case that one is not specified in a binding expression. If not provided, the behavior is the same as Binding.defaultBind.
    * @returns A Promise that completes when every item that contains the data-win-bind attribute has been processed and the update has started.
    **/
  def apply(): Promise[Unit] = js.native
  def apply(rootElement: Element): Promise[Unit] = js.native
  def apply(rootElement: Element, dataContext: js.Any): Promise[Unit] = js.native
  def apply(rootElement: Element, dataContext: js.Any, skipRoot: Boolean): Promise[Unit] = js.native
  def apply(rootElement: Element, dataContext: js.Any, skipRoot: Boolean, bindingCache: js.Any): Promise[Unit] = js.native
  def apply(
    rootElement: Element,
    dataContext: js.Any,
    skipRoot: Boolean,
    bindingCache: js.Any,
    defaultInitializer: js.Function
  ): Promise[Unit] = js.native
}

