package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "WidgetCollection")
@js.native
class WidgetCollection[T /* <: Widget */] ()
  extends /* key */ org.scalablytyped.runtime.NumberDictionary[T] {
  def this(widgets: js.Array[Widget]) = this()
  /**
    * Contains the number of widgets in the collection.
    */
  val length: scala.Double = js.native
  /**
    * Animates all widgets in this collection.
    * @param properties The properties and target values to animate.
    * @param options Configures the animation itself.
    */
  def animate(properties: tabrisLib.Anon_Opacity, options: AnimationOptions): scala.Unit = js.native
  /**
    * Appends all widgets in this collection to the given parent widget.
    * @param parent The parent widget to append to.
    */
  def appendTo(parent: Composite): this.type = js.native
  /**
    * Returns a collection containing all children of all widgets in this collection that match the given
    * selector.
    * @param selector A selector expression or a predicate function to filter the results.
    */
  def children(): WidgetCollection[Widget] = js.native
  def children(selector: tabrisLib.Selector): WidgetCollection[Widget] = js.native
  /**
    * Returns a collection containing all children of all widgets in this collection that are instances of
    * the given class.
    * @param constructor A class to filter the results.
    */
  def children[U /* <: Widget */](constructor: tabrisLib.Anon_Args[U]): WidgetCollection[U] = js.native
  /**
    * Disposes all widgets in this collection.
    */
  def dispose(): scala.Unit = js.native
  /**
    * Returns a new *WidgetCollection* containing all widgets in this collection that match the given
    * selector.
    * @param selector A selector expression or a predicate function to filter the results.
    */
  def filter(selector: tabrisLib.Selector): WidgetCollection[T] = js.native
  /**
    * Returns a new *WidgetCollection* containing all widgets in this collection that are instances of the
    * given class.
    * @param constructor A class to filter the results.
    */
  def filter[U /* <: Widget */](constructor: tabrisLib.Anon_Args[U]): WidgetCollection[U] = js.native
  /**
    * Returns a collection containing all descendants of all widgets in this collection that match the
    * given selector.
    * @param selector A selector expression or a predicate function to filter the results.
    */
  def find(): WidgetCollection[Widget] = js.native
  def find(selector: tabrisLib.Selector): WidgetCollection[Widget] = js.native
  /**
    * Returns a collection containing all descendants of all widgets in this collection that are instances
    * of the given class.
    * @param constructor A class to filter the results.
    */
  def find[U /* <: Widget */](constructor: tabrisLib.Anon_Args[U]): WidgetCollection[U] = js.native
  /**
    * Returns the first widget in the collection that is matched by the selector. Without selector, it is
    * the same as `collection[0]`.
    * @param selector A selector expression or a predicate function to filter the results.
    */
  def first(): js.UndefOr[T] = js.native
  def first(selector: tabrisLib.Selector): js.UndefOr[T] = js.native
  /**
    * Returns the first widget in the collection that is an instance of the given class.
    * @param constructor A class to filter the results.
    */
  def first[U /* <: Widget */](constructor: tabrisLib.Anon_Args[U]): U = js.native
  @JSName("first")
  def first_UWidgetU[U /* <: Widget */](): U = js.native
  /**
    * Calls the given callback function once for each widget in the collection.
    * @param callback The function to call for each widget. The arguments are: *widget*, *index*, *collection*
    */
  def forEach(
    callback: js.Function3[
      /* widget */ T, 
      /* index */ scala.Double, 
      /* collection */ WidgetCollection[T], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Returns the value of the given property of the first widget in this collection.
    * @param property 
    */
  def get(property: java.lang.String): js.Any = js.native
  /**
    * Returns `true` if the given widget is included in the collection, `false` otherwise.
    * @param widget The widget to search in the collection.
    */
  def includes(widget: T): scala.Boolean = js.native
  /**
    * Returns the index of the given widget within the collection, or `-1` if the widget is not present.
    * @param widget The widget to locate in the collection.
    */
  def indexOf(widget: T): scala.Double = js.native
  /**
    * Returns the last widget in the collection that is matched by the selector. Without selector, it is
    * the same as `collection[collection.length - 1]`.
    * @param selector A selector expression or a predicate function to filter the results.
    */
  def last(): js.UndefOr[T] = js.native
  def last(selector: tabrisLib.Selector): js.UndefOr[T] = js.native
  /**
    * Returns the last widget in the collection that is an instance of the given class.
    * @param constructor A class to filter the results.
    */
  def last[U /* <: Widget */](constructor: tabrisLib.Anon_Args[U]): U = js.native
  @JSName("last")
  def last_UWidgetU[U /* <: Widget */](): U = js.native
  /**
    * Removes the given listener from all widgets in this collection. See also `Widget.off()`.
    * @param event 
    * @param listener 
    * @param context 
    */
  def off(event: java.lang.String, listener: js.Function): this.type = js.native
  def off(event: java.lang.String, listener: js.Function, context: this.type): this.type = js.native
  /**
    * Adds the given listener to all widgets in this collection. See also `Widget.on()`.
    * @param event 
    * @param listener 
    * @param context In the listener function, `this` will point to this object.
    */
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  def on(event: java.lang.String, listener: js.Function, context: this.type): this.type = js.native
  /**
    * Adds the given listener for single execution on all widgets in this collection. See also
    * `Widget.once()`.
    * @param event 
    * @param listener 
    * @param context In the listener function, `this` will point to this object.
    */
  def once(event: java.lang.String, listener: js.Function): this.type = js.native
  def once(event: java.lang.String, listener: js.Function, context: this.type): this.type = js.native
  /**
    * Returns a collection containing all direct parents of the widgets in this collection.
    */
  def parent(): WidgetCollection[Widget] = js.native
  /**
    * Sets all key-value pairs in the properties object on all widgets in this collection. See also
    * `Widget.set()`.
    * @param properties 
    */
  def set(properties: tabrisLib.WidgetProperties with org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
  /**
    * Sets the given property on all widgets in this collection. See also `Widget.set()`.
    * @param property 
    * @param value 
    */
  def set(property: java.lang.String, value: js.Any): this.type = js.native
  /**
    * Returns an Array containing all widgets in the collection.
    */
  def toArray(): js.Array[T] = js.native
  /**
    * Triggers an event of the given type on all widgets in this collection. See also `Widget.trigger()`
    * @param event 
    * @param params 
    */
  def trigger(event: java.lang.String, params: js.Any*): this.type = js.native
}

