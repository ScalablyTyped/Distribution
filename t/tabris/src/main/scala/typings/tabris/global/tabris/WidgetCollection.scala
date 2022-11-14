package typings.tabris.global.tabris

import typings.tabris.mod.AnyWidget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.WidgetCollection")
@js.native
/**
  * A `WidgetCollection` is an array-like object representing a set of widgets, as returned by the widget
  * methods `children` and `find`. It combines a subset of the JavaScript Array API with a subset of the
  * Tabris.js Widget API. Like an array, the widgets within the collection may be accessed directly using
  * the `[index]` syntax. The number of widgets is stored in the `length` field. Instances of
  * *WidgetCollection* are immutable.
  * Calls to `set` or `animate` change the given properties for all widgets in the collection. Similarly,
  * the `on`, `off` and `once` methods will add/remove the given listener to/from all widgets. When `get`
  * is used, the value of the first widget in the collection is returned.
  * WidgetCollection can also in JSX as a means of creating a group of widgets to append to the same
  * parent. To shorten this common use case the `WidgetCollection` is also available as the alias
  * ["$"](./$.md). This alias still needs to be imported from the tabris module though.
  */
open class WidgetCollection[WidgetType /* <: AnyWidget */] ()
  extends typings.tabris.mod.WidgetCollection[WidgetType] {
  def this(widgets: js.Array[typings.tabris.mod.Widget[Any]]) = this()
}
