package typings.tabris.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.tabris.anon.InstantiableU
import typings.tabris.anon.Opacity
import typings.tabris.anon.`6`
import typings.tabris.tabrisStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "WidgetCollection")
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
  extends StObject
     with /**
  * @constant
  */
/* key */ NumberDictionary[WidgetType]
     with _JSXChildren[WidgetType] {
  def this(widgets: js.Array[Widget[Any]]) = this()
  
  /**
    * Animates all widgets in this collection.
    * @param properties The properties and target values to animate.
    * @param options Configures the animation itself.
    */
  def animate(properties: Opacity, options: AnimationOptions): Unit = js.native
  
  /**
    * Appends all widgets in this collection to the given parent widget.
    * @param parent The parent widget to append to.
    */
  def appendTo(parent: typings.tabris.mod.Composite[Widget[Any]]): this.type = js.native
  
  /**
    * Returns a collection containing all children of all widgets in this collection that match the given
    * selector.
    * @param selector A selector expression or a predicate function to filter the results.
    */
  def children[Result /* <: Widget[Any] */](): WidgetCollection[Result] = js.native
  def children[Result /* <: Widget[Any] */](selector: Selector[Widget[Any], Result]): WidgetCollection[Result] = js.native
  
  /**
    * Returns a clone of this *WidgetCollection* containing all widgets in this collection.
    */
  def concat(): WidgetCollection[WidgetType] = js.native
  /**
    * Returns a new *WidgetCollection* containing all widgets in this collection and those given as
    * arguments.
    * @param items
    */
  def concat[AddedType /* <: Widget[Any] */](items: (AddedType | js.Array[AddedType] | WidgetCollection[AddedType])*): WidgetCollection[AddedType | WidgetType] = js.native
  
  /**
    * Detaches all widgets in this collection from their parent.
    */
  def detach(): Unit = js.native
  
  /**
    * Disposes all widgets in this collection.
    */
  def dispose(): Unit = js.native
  
  /**
    * Returns a new *WidgetCollection* containing all widgets in this collection that match the given
    * selector.
    * @param selector A selector expression or a predicate function to filter the results.
    */
  def filter[Result /* <: WidgetType */](selector: Selector[WidgetType, Result]): WidgetCollection[Result] = js.native
  
  /**
    * Returns the first widget in the collection that is matched by the selector. Without selector, it is
    * the same as `collection[0]`.
    * @param selector A selector expression or a predicate function to filter the results.
    */
  def first[Result /* <: WidgetType */](): js.UndefOr[Result] = js.native
  def first[Result /* <: WidgetType */](selector: Selector[WidgetType, Result]): js.UndefOr[Result] = js.native
  
  /**
    * Calls the given callback function once for each widget in the collection.
    * @param callback The function to call.
    */
  def forEach(
    callback: js.Function3[
      /* widget */ WidgetType, 
      /* index */ Double, 
      /* collection */ WidgetCollection[WidgetType], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * The widget this WidgetCollection was created from. Corresponds to the ':host' selector.
    * @constant
    */
  val host: Widget[Any] = js.native
  
  /**
    * Returns `true` if the given widget is included in the collection, `false` otherwise.
    * @param widget The widget to search in the collection.
    */
  def includes(widget: WidgetType): Boolean = js.native
  
  /**
    * Returns the index of the given widget within the collection, or `-1` if the widget is not present.
    * @param widget The widget to locate in the collection.
    */
  def indexOf(widget: WidgetType): Double = js.native
  
  /**
    * @constant
    */
  val jsxAttributes: `6`[WidgetType] = js.native
  
  /**
    * Returns the last widget in the collection that is matched by the selector. Without selector, it is
    * the same as `collection[collection.length - 1]`.
    * @param selector A selector expression or a predicate function to filter the results.
    */
  def last[Result /* <: WidgetType */](): js.UndefOr[Result] = js.native
  def last[U /* <: Widget[Any] */](constructor: InstantiableU[U]): U = js.native
  def last[Result /* <: WidgetType */](selector: Selector[WidgetType, Result]): js.UndefOr[Result] = js.native
  /**
    * Returns the last widget in the collection that is an instance of the given class.
    * @param constructor A class to filter the results.
    */
  @JSName("last")
  def last_U_U[U /* <: Widget[Any] */](): U = js.native
  
  /**
    * Contains the number of widgets in the collection.
    * @constant
    */
  val length: Double = js.native
  
  /**
    * Calls the given callback function once for each widget in the collection and returns an array with
    * the return values of each call.
    * @param callback The function to call for each widget.
    */
  def map(
    callback: js.Function3[
      /* widget */ WidgetType, 
      /* index */ Double, 
      /* collection */ WidgetCollection[WidgetType], 
      Any
    ]
  ): js.Array[Any] = js.native
  /**
    * Calls the given callback function once for each widget in the collection and returns an array with
    * the return values of each call.
    * @param callback The function to call for each widget. The arguments are: *widget*, *index*, *collection*
    */
  @JSName("map")
  def map_U[U](
    callback: js.Function3[
      /* widget */ WidgetType, 
      /* index */ Double, 
      /* collection */ WidgetCollection[WidgetType], 
      U
    ]
  ): js.Array[U] = js.native
  
  /**
    * Removes the given listener from all widgets in this collection. See also `Widget.off()`.
    * @param event
    * @param listener
    * @param context
    */
  def off(event: String, listener: js.Function): this.type = js.native
  def off(event: String, listener: js.Function, context: this.type): this.type = js.native
  
  /**
    * Adds the given listener to all widgets in this collection. See also `Widget.on()`.
    * @param event
    * @param listener
    * @param context In the listener function, `this` will point to this object.
    */
  def on(event: String, listener: js.Function): this.type = js.native
  def on(event: String, listener: js.Function, context: this.type): this.type = js.native
  
  /**
    * Adds the given listener for single execution on all widgets in this collection. See also
    * `Widget.once()`.
    * @param event
    * @param listener
    * @param context In the listener function, `this` will point to this object.
    */
  def once(event: String, listener: js.Function): this.type = js.native
  def once(event: String, listener: js.Function, context: this.type): this.type = js.native
  
  /**
    * Returns the only widget in the collection that is matched by the selector. If there is more or less
    * than one match the method throws en Error. Without a selector the widget collection needs to have
    * exactly one entry.
    * @param selector A selector expression or a predicate function to filter the results.
    */
  def only[Result /* <: WidgetType */](): Result = js.native
  def only[Result /* <: WidgetType */](selector: Selector[WidgetType, Result]): Result = js.native
  
  /**
    * Returns a collection containing all direct parents of the widgets in this collection.
    */
  def parent(): WidgetCollection[Widget[Any]] = js.native
  
  /**
    * Sets all key-value pairs in the properties object on all widgets in this collection. See also
    * `Widget.set()`.
    * @param properties
    */
  @JSName("set")
  def set_set(properties: Properties[WidgetType, Omit[WidgetType, set]]): this.type = js.native
  
  /**
    * Returns a new *WidgetCollection* containing a section of this collection.
    * @param start The beginning of the specified portion of the collection.
    * @param end The end of the specified portion of the collection.
    */
  def slice(): WidgetCollection[WidgetType] = js.native
  def slice(start: Double): WidgetCollection[WidgetType] = js.native
  def slice(start: Double, end: Double): WidgetCollection[WidgetType] = js.native
  def slice(start: Unit, end: Double): WidgetCollection[WidgetType] = js.native
  
  /**
    * Returns an Array containing all widgets in the collection.
    */
  def toArray(): js.Array[WidgetType] = js.native
  
  /**
    * Triggers an event of the given type on all widgets in this collection and passes the fields of the
    * given *object* to all listeners`
    * @param type The type of event to trigger
    * @param eventData The data to pass to listener functions.
    */
  def trigger(`type`: String): this.type = js.native
  def trigger(`type`: String, eventData: js.Object): this.type = js.native
}
