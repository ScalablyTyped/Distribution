package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base class for all widgets
  */
@JSImport("tabris", "Widget")
@js.native
class Widget protected ()
  extends NativeObject
     with _WidgetProperties {
  protected def this(properties: Properties[Widget, TypeScriptPropertiesKey]) = this()
  /**
    * Background color of the widget.
    */
  /* CompleteClass */
  override var background: tabrisLib.Color = js.native
  /**
    * An image to be displayed on the widget's background. If the image is smaller than the widget, it will
    * be tiled.
    */
  /* CompleteClass */
  override var backgroundImage: Image = js.native
  /**
    * The vertical position of the widget's baseline relative to a sibling widget.
    */
  /* CompleteClass */
  override var baseline: Widget | Selector = js.native
  /**
    * The position of the widget's bottom edge relative to the parent or a sibling widget.
    */
  /* CompleteClass */
  override var bottom: tabrisLib.margin = js.native
  /**
    * The actual location and size of the widget, relative to its parent.
    */
  val bounds: Bounds = js.native
  /**
    * The horizontal position of the widget's center relative to the parent's center.
    */
  /* CompleteClass */
  override var centerX: tabrisLib.offset = js.native
  /**
    * The vertical position of the widget's center relative to the parent's center.
    */
  /* CompleteClass */
  override var centerY: tabrisLib.offset = js.native
  /**
    * A class name or a whitespace separated list of class names to identify the widget. Class names are
    * arbitrary strings that describe a state or a category and help to select widgets using a selector
    * expression. A class name may only contain alphanumeric characters, `_` and `-`. Class names can also
    * be added or removed using the field `classList`.
    */
  /* CompleteClass */
  override var `class`: java.lang.String = js.native
  /**
    * Provides convenient access to the list of class names set to this widget. Class names can either be
    * set using the `class` property or by modifying the `classList` directly.
    */
  /* CompleteClass */
  override var classList: js.Array[java.lang.String] = js.native
  /**
    * Configure a widget to have rounded corners. Each corner is affected equally. Supported on iOS and
    * Android 5.0+.
    */
  /* CompleteClass */
  override var cornerRadius: scala.Double = js.native
  /**
    * A general-purpose object that allows the application to attach arbitrary data to the widget.
    * Manipulations on this object have no effect on the widget itself in any way. Example:
    * `widget.data.myData = myData;`
    */
  val data: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
    * The position of the widget on the z-axis. Supported on iOS and Android 5.0+.
    */
  /* CompleteClass */
  override var elevation: scala.Double = js.native
  /**
    * Whether the widget can be operated.
    */
  /* CompleteClass */
  override var enabled: scala.Boolean = js.native
  /**
    * The font used for the widget.
    */
  /* CompleteClass */
  override var font: tabrisLib.Font | scala.Null = js.native
  /**
    * The height of the widget.
    */
  /* CompleteClass */
  override var height: tabrisLib.dimension = js.native
  /**
    * Whether the widget should show visual feedback while touched. Enabling `highlightOnTouch` will not
    * prevent the touch event from being propagated to the parent widget.
    */
  /* CompleteClass */
  override var highlightOnTouch: scala.Boolean = js.native
  /**
    * A string to identify the widget by using selectors. IDs are optional. It is strongly recommended that
    * they are unique within a page.
    */
  /* CompleteClass */
  override var id: java.lang.String = js.native
  /**
    * Shorthand for all layout properties. See [Layout](../layout.md).
    */
  /* CompleteClass */
  override var layoutData: LayoutData = js.native
  /**
    * The position of the widget's left edge relative to the parent or a sibling widget.
    */
  /* CompleteClass */
  override var left: tabrisLib.margin = js.native
  /**
    * Opacity of the entire widget, in the range `[0..1]`. Can be used for fade animations.
    */
  /* CompleteClass */
  override var opacity: scala.Double = js.native
  /**
    * The position of the widget's right edge relative to the parent or a sibling widget.
    */
  /* CompleteClass */
  override var right: tabrisLib.margin = js.native
  /**
    * The position of the widget's top edge relative to the parent or a sibling widget.
    */
  /* CompleteClass */
  override var top: tabrisLib.margin = js.native
  /**
    * Modifications to the widget's shape, size, or position. Can be used for animations. **Note:** In
    * Android the *transform* property does not affect the *bounds* property, while it does so in iOS.
    */
  /* CompleteClass */
  override var transform: Transformation = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_Widget: WidgetProperties = js.native
  /**
    * Whether the widget is visible.
    */
  /* CompleteClass */
  override var visible: scala.Boolean = js.native
  /**
    * The width of the widget.
    */
  /* CompleteClass */
  override var width: tabrisLib.dimension = js.native
  /**
    * Controls the color scheme used for this widget. When set to `"default"` the theme is inherited from
    * either the parent (if present) or the OS settings. Available only on windows.
    */
  /* CompleteClass */
  override var win_theme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light = js.native
  /**
    * Identical to the `apply` method, but intended to be used by subclasses in case the `children` method
    * was overwritten . See `children` for details.
    * @param properties An object in the format `{Selector: {property: value, property: value, ... }, Selector: ...}`
    */
  /* protected */ def _apply(
    properties: org.scalablytyped.runtime.StringDictionary[WidgetProperties with org.scalablytyped.runtime.StringDictionary[js.Any]]
  ): this.type = js.native
  /**
    * Identical to the `children` method, but intended to be used by subclasses in case the `children`
    * method was overwritten. See `children` for details.
    * @param selector A selector expression or a predicate function to filter the results.
    */
  /* protected */ def _children(): WidgetCollection[Widget] = js.native
  /* protected */ def _children(selector: Selector): WidgetCollection[Widget] = js.native
  /**
    * Identical to the `children` method, but intended to be used by subclasses in case the `children`
    * method was overwritten. See `children` for details.
    * @param constructor A class to filter the results.
    */
  /* protected */ def _children[U /* <: Widget */](constructor: tabrisLib.Anon_Args[U]): WidgetCollection[U] = js.native
  /**
    * Identical to the `find` method, but intended to be used by subclasses in case the `children` method
    * was overwritten. See `children` for details.
    * @param selector A selector expression or a predicate function to filter the results.
    */
  /* protected */ def _find(): WidgetCollection[Widget] = js.native
  /* protected */ def _find(selector: Selector): WidgetCollection[Widget] = js.native
  /**
    * Identical to the `find` method, but intended to be used by subclasses in case the `children` method
    * was overwritten. See `children` for details.
    * @param constructor A class to filter the results.
    */
  /* protected */ def _find[U /* <: Widget */](constructor: tabrisLib.Anon_Args[U]): WidgetCollection[U] = js.native
  /**
    * Starts an animation that transforms the given properties from their current values to the given ones.
    * Supported properties are *transform* and *opacity*. Returns a promise that is resolved once the
    * animation is completed and is rejected if the animation is aborted.
    * @param properties The properties and target values to animate.
    * @param options Configures the animation itself.
    */
  def animate(properties: tabrisLib.Anon_Opacity, options: AnimationOptions): js.Promise[_] = js.native
  /**
    * Appends this widget to the given parent. The parent widget must support children (extending
    * *Composite*). If the widget already has a parent, it is removed from the old parent.
    * @param parent 
    */
  def appendTo(parent: Composite): this.type = js.native
  /**
    * Applies the given properties to all descendants that match the associated selector(s).
    * If you wish to always exclude specific "internal" children from this, overwrite the `children` method
    * on their parent. See `children` for details.
    * @param properties An object in the format `{Selector: {property: value, property: value, ... }, Selector: ...}`
    */
  @JSName("apply")
  def apply(
    properties: org.scalablytyped.runtime.StringDictionary[WidgetProperties with org.scalablytyped.runtime.StringDictionary[js.Any]]
  ): this.type = js.native
  /**
    * Returns a (possibly empty) collection of all children of this widget that match the given selector.
    * When writing custom UI components it may be useful to overwrite this method to prevent access to the
    * internal children by external code. Doing so also affects `find` and `apply`, on this widget as well
    * as on all parents, thereby preventing accidental clashes of widget id or class values. See also
    * `_children`, `_find` and `_apply`.
    * @param selector A selector expression or a predicate function to filter the results.
    */
  def children(): WidgetCollection[Widget] = js.native
  def children(selector: Selector): WidgetCollection[Widget] = js.native
  /**
    * Returns a collection containing all children of all widgets in this collection that are instances of
    * the given class.
    * @param constructor A class to filter the results.
    */
  def children[U /* <: Widget */](constructor: tabrisLib.Anon_Args[U]): WidgetCollection[U] = js.native
  /**
    * Removes this widget from its parent.
    */
  def detach(): this.type = js.native
  /**
    * Removes this widget from its parent and destroys it. Also disposes of all its children. Triggers a
    * `remove` event on the parent and a `dispose` event on itself. The widget can no longer be used.
    */
  def dispose(): scala.Unit = js.native
  /**
    * Returns a collection containing all descendants of all widgets in this collection that match the
    * given selector.
    * If you wish to always exclude specific "internal" children from the result, overwrite the `children`
    * method on their parent. See `children` for details.
    * @param selector A selector expression or a predicate function to filter the results.
    */
  def find(): WidgetCollection[Widget] = js.native
  def find(selector: Selector): WidgetCollection[Widget] = js.native
  /**
    * Returns a collection containing all descendants of all widgets in this collection that match the
    * given selector.
    * If you wish to always exclude  specific "internal" children from the result, overwrite the `children`
    * method on their parent. See `children` for details.
    * @param constructor A class to filter the results.
    */
  def find[U /* <: Widget */](constructor: tabrisLib.Anon_Args[U]): WidgetCollection[U] = js.native
  /**
    * Inserts this widget directly after the given widget. If the widget already has a parent, it is
    * removed from the old parent.
    * @param widget 
    */
  def insertAfter(widget: Widget): this.type = js.native
  /**
    * Inserts this widget directly before the given widget. If the widget already has a parent, it is
    * removed from the old parent.
    * @param widget 
    */
  def insertBefore(widget: Widget): this.type = js.native
  /**
    * Returns `true` if the widget has been disposed, otherwise `false`.
    */
  def isDisposed(): scala.Boolean = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: WidgetEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: WidgetEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: WidgetEvents): this.type = js.native
  /**
    * Returns the parent of this widget or `null` if this widget is not appended to a parent.
    */
  def parent(): Composite = js.native
  /**
    * Returns a (possibly empty) collection of all siblings of this widget that match the given selector.
    * @param selector A selector expression or a predicate function to filter the results.
    */
  def siblings(): WidgetCollection[Widget] = js.native
  def siblings(selector: Selector): WidgetCollection[Widget] = js.native
  /**
    * Returns a (possibly empty) collection of all siblings of this widget that are instances of the given
    * class.
    * @param constructor A class to filter the results.
    */
  def siblings[U /* <: Widget */](constructor: tabrisLib.Anon_Args[U]): WidgetCollection[U] = js.native
}

