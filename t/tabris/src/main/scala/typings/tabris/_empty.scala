package typings.tabris

import typings.tabris.mod.JSXChildren
import typings.tabris.mod.NativeObject
import typings.tabris.mod.Selector
import typings.tabris.mod.Widget
import typings.tabris.mod.WidgetCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("$")
@js.native
object _empty extends js.Object {
  def apply(attributes: Null, children: String): String = js.native
  def apply(attributes: Null, children: js.Array[Null | String | Double | Boolean]): String = js.native
  def apply(attributes: Null, children: Boolean): String = js.native
  def apply(attributes: Null, children: Double): String = js.native
  def apply(attributes: Null, children: JSXChildren[Widget]): WidgetCollection[Widget] = js.native
  /**
    * A JSX stateless functional component that joins any given content in to a single string.
    * @param attributes This parameter needs to be null since <$> does not support any attributes.
    * @param children The content of the resulting string.
    */
  def apply(attributes: Anon0, children: String): String = js.native
  def apply(attributes: Anon0, children: js.Array[Null | String | Double | Boolean]): String = js.native
  def apply(attributes: Anon0, children: Boolean): String = js.native
  def apply(attributes: Anon0, children: Double): String = js.native
  /**
    * A JSX stateless functional component that groups all given widgets in a WidgetCollection
    * @param attributes This parameter needs to be null since <$> does not support any attributes
    * @param children The widgets to be included in the resulting WidgetCollection instance.
    */
  def apply(attributes: AnonChildrenJSXChildren, children: JSXChildren[Widget]): WidgetCollection[Widget] = js.native
  /**
    * Returns the non-disposed `NativeObject` instance (e.g. a widget) associated with the given cid
    * number. The number can be obtained via the [cid](./NativeObject.md#cid) property. Example: If the cid
    * of an object is `'$23'` it can be obtained by `$(23)`. The cid is visible in the log when passing a
    * NativeObject to any log method, e.g. [`console.log(widget)`](./console.md#logvalues), or
    * [`console.dirxml(widget)`](./console.md#dirxmlobject). The native object may then be obtained using
    * the developer console or the interactive console feature for the tabris CLI serve command.
    * This feature is meant for debugging purposes only. **Using it in production code is dangerous since
    * it allows interfering with the internals of the framework or encapsulated components.** Also, the
    * `cid` of a NativeObject is not stable, meaning it can change each time the code is executed.
    * @param cidNumber The cid number is the trailing part of the [cid](./NativeObject.md#cid) property string.
    */
  def apply(cidNumber: Double): NativeObject = js.native
  // $
  /**
    * A shortcut to [`tabris.contentView.find()`](./Composite.md#findselector). Returns a collection
    * containing all descendants of contentView that match the given selector. This does *not* include any
    * widgets in the drawer, a popover, or encapsulated in a custom component.
    * @param selector A selector expression or a predicate function to filter the results.
    */
  def apply[Result /* <: Widget */](): WidgetCollection[Result] = js.native
  def apply[Result /* <: Widget */](selector: Selector[Widget, Result]): WidgetCollection[Result] = js.native
}

