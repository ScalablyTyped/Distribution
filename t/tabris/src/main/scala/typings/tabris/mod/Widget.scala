package typings.tabris.mod

import org.scalablytyped.runtime.StringDictionary
import typings.tabris.anon.OmitWidgetset
import typings.tabris.anon.Opacity
import typings.tabris.tabrisBooleans.`true`
import typings.tabris.tabrisStrings.`class`
import typings.tabris.tabrisStrings.auto
import typings.tabris.tabrisStrings.background
import typings.tabris.tabrisStrings.baseline
import typings.tabris.tabrisStrings.bottom
import typings.tabris.tabrisStrings.centerX
import typings.tabris.tabrisStrings.centerY
import typings.tabris.tabrisStrings.classList
import typings.tabris.tabrisStrings.cornerRadius
import typings.tabris.tabrisStrings.data
import typings.tabris.tabrisStrings.elevation
import typings.tabris.tabrisStrings.enabled
import typings.tabris.tabrisStrings.excludeFromLayout
import typings.tabris.tabrisStrings.height
import typings.tabris.tabrisStrings.highlightOnTouch
import typings.tabris.tabrisStrings.id
import typings.tabris.tabrisStrings.layoutData
import typings.tabris.tabrisStrings.left
import typings.tabris.tabrisStrings.opacity
import typings.tabris.tabrisStrings.right
import typings.tabris.tabrisStrings.top
import typings.tabris.tabrisStrings.transform
import typings.tabris.tabrisStrings.visible
import typings.tabris.tabrisStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "Widget")
@js.native
/* protected */ class Widget () extends NativeObject {
  /* protected */ def this(properties: Properties[Widget, OmitWidgetset]) = this()
  
  /**
    * Sets the parent of the widget. If an index is given the widget will be inserted at that position.
    * @param parent
    * @param index
    */
  /* protected */ def _setParent(parent: typings.tabris.mod.Composite[Widget]): Unit = js.native
  /* protected */ def _setParent(parent: typings.tabris.mod.Composite[Widget], index: Double): Unit = js.native
  
  /**
    * The actual location and size of the widget, relative to contentView.
    */
  val absoluteBounds: Bounds = js.native
  
  /**
    * Starts an animation that transforms the given properties from their current values to the given ones.
    * Supported properties are *transform* and *opacity*. Returns a promise that is resolved once the
    * animation is completed and is rejected if the animation is aborted.
    * @param properties The properties and target values to animate.
    * @param options Configures the animation itself.
    */
  def animate(properties: Opacity, options: AnimationOptions): js.Promise[Unit] = js.native
  
  /**
    * Appends this widget to the given parent. The parent widget must support children (extending
    * *Composite*). If the widget already has a parent, it is removed from the old parent.
    * @param parent
    */
  def appendTo(parent: typings.tabris.mod.Composite[Widget]): this.type = js.native
  
  /**
    * The background of the widget. If given a plain string it is interpreted first as a gradient, then as
    * a color, and finally as an image path, whichever passes first. Use object literals or instances of
    * `LinearGradient`, `Color` or `Image` to avoid any ambiguity.
    */
  var background: LinearGradientValue | ColorValue | ImageValue = js.native
  
  /**
    * The vertical position of the widget's baseline relative to a sibling widget. Value `true` is treated
    * like `'prev()'` and aligns it with the previous sibling.
    */
  var baseline: SiblingReferenceValue | auto | `true` = js.native
  
  /**
    * The position of the widget's bottom edge relative to the parent or a sibling widget.
    */
  var bottom: ConstraintValue = js.native
  
  /**
    * The actual location and size of the widget, relative to its parent.
    */
  val bounds: Bounds = js.native
  
  /**
    * The horizontal position of the widget's center relative to the parent's center. Value `true` is
    * treated like `0` and puts it at the exact center without offset.
    */
  var centerX: Offset | auto | `true` = js.native
  
  /**
    * The vertical position of the widget's center relative to the parent's center. Value `true` is treated
    * like `0` and puts it at the exact center without offset.
    */
  var centerY: Offset | auto | `true` = js.native
  
  /**
    * A class name or a whitespace separated list of class names to identify the widget. Class names are
    * arbitrary strings that describe a state or a category and help to select widgets using a selector
    * expression. A class name may only contain alphanumeric characters, `_` and `-`. Class names can also
    * be added or removed using the field `classList`.
    */
  var `class`: String = js.native
  
  /**
    * Provides convenient access to the list of class names set to this widget. Class names can either be
    * set using the `class` property or by modifying the `classList` directly.
    */
  var classList: js.Array[String] = js.native
  
  /**
    * Configure a widget to have equally rounded corners. The widget content is clipped by the rounded
    * corners.
    */
  var cornerRadius: Double = js.native
  
  /**
    * A general-purpose property that may be set to any object. It is initialized with an empty object for
    * historical reasons (backwards compatibility).
    */
  var data: StringDictionary[js.Any] = js.native
  
  /**
    * Removes this widget from its parent.
    */
  def detach(): this.type = js.native
  
  /**
    * Removes this widget from its parent and destroys it. Also disposes of all its children. Triggers a
    * `remove` event on the parent and a `dispose` event on itself. The widget can no longer be used.
    */
  def dispose(): Unit = js.native
  
  /**
    * The position of the widget on the z-axis. Setting an `elevation` casts a shadow in the shape of the
    * widget.
    * To have the shadow properly applied on Android it is required to set the `background` on the widget
    * as well.
    */
  var elevation: Double = js.native
  
  /**
    * Whether the widget can be interacted with.
    */
  var enabled: Boolean = js.native
  
  /**
    * If set to true the widget will be invisible and ignored in the layout of the parent. Visually it is
    * treated like it was not attached to its parent, but it will still included in the return value of
    * `children()`.
    */
  var excludeFromLayout: Boolean = js.native
  
  /**
    * The height of the widget.
    */
  var height: Dimension | auto = js.native
  
  /**
    * Whether the widget should show visual feedback while touched. Enabling `highlightOnTouch` will not
    * prevent the touch event from being propagated to the parent widget.
    */
  var highlightOnTouch: Boolean = js.native
  
  /**
    * A string to identify the widget by using selectors. IDs are optional. It is strongly recommended that
    * they are unique within any component.
    */
  var id: String = js.native
  
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
  def isDisposed(): Boolean = js.native
  
  /**
    * Provides information for a widget to be used by the parent when determining its size and position.
    * While this property accepts any valid LayoutData expression (see
    * [LayoutDataValue](../types.md#layoutdatavalue), it will always return an instance of the class
    * [LayoutData](./LayoutData.md).
    * Widget provides an alias property for each property of LayoutData. Setting these properties will
    * change the value of the `layoutData` property, while getting them is the same as accessing them via
    * the `layoutData` property. I.e. `widget.left === widget.layoutData.left`.
    * There are multiple presets for layoutData available as static properties on the `LayoutData` class:
    * [center](./LayoutData.md#center)`, [stretch](./LayoutData.md#stretch)`,
    * [stretchX](./LayoutData.md#stretchx)` and [stretchY](./LayoutData.md#stretchy)`. They may be set
    * directly (`new TextView({layoutData: LayoutData.stretch});`), via string (e.g. `new
    * TextView({layoutData: 'stretch'});`), or in JSX via a special shorthand syntax: `<TextView
    * stretch/>`. The presets can be merged with widget properties, e.g. `<TextView stretch left={10}/>` or
    * `<TextView stretchX centerY/>`
    */
  var layoutData: LayoutDataValue = js.native
  
  /**
    * The position of the widget's left edge relative to the parent or a sibling widget.
    */
  var left: ConstraintValue = js.native
  
  /**
    * Fired when the [*background*](#background) property has changed.
    */
  var onBackgroundChanged: ChangeListeners[this.type, background] = js.native
  
  /**
    * Fired when the [*baseline*](#baseline) property has changed.
    */
  var onBaselineChanged: ChangeListeners[this.type, baseline] = js.native
  
  /**
    * Fired when the [*bottom*](#bottom) property has changed.
    */
  var onBottomChanged: ChangeListeners[this.type, bottom] = js.native
  
  /**
    * Fired when the [*bounds*](#bounds) property has changed.
    */
  var onBoundsChanged: ChangeListeners[this.type, typings.tabris.tabrisStrings.bounds] = js.native
  
  /**
    * Fired when the [*centerX*](#centerX) property has changed.
    */
  var onCenterXChanged: ChangeListeners[this.type, centerX] = js.native
  
  /**
    * Fired when the [*centerY*](#centerY) property has changed.
    */
  var onCenterYChanged: ChangeListeners[this.type, centerY] = js.native
  
  /**
    * Fired when the [*class*](#class) property has changed.
    */
  var onClassChanged: ChangeListeners[this.type, `class`] = js.native
  
  /**
    * Fired when the [*classList*](#classList) property has changed.
    */
  var onClassListChanged: ChangeListeners[this.type, classList] = js.native
  
  /**
    * Fired when the [*cornerRadius*](#cornerRadius) property has changed.
    */
  var onCornerRadiusChanged: ChangeListeners[this.type, cornerRadius] = js.native
  
  /**
    * Fired when the [*data*](#data) property has changed.
    */
  var onDataChanged: ChangeListeners[this.type, data] = js.native
  
  /**
    * Fired when the widget is about to be disposed. At this point the widget and its children are still
    * accessible.
    */
  var onDispose: Listeners[EventObject[this.type]] = js.native
  
  /**
    * Fired when the [*elevation*](#elevation) property has changed.
    */
  var onElevationChanged: ChangeListeners[this.type, elevation] = js.native
  
  /**
    * Fired when the [*enabled*](#enabled) property has changed.
    */
  var onEnabledChanged: ChangeListeners[this.type, enabled] = js.native
  
  /**
    * Fired when the [*excludeFromLayout*](#excludeFromLayout) property has changed.
    */
  var onExcludeFromLayoutChanged: ChangeListeners[this.type, excludeFromLayout] = js.native
  
  /**
    * Fired when the [*height*](#height) property has changed.
    */
  var onHeightChanged: ChangeListeners[this.type, height] = js.native
  
  /**
    * Fired when the [*highlightOnTouch*](#highlightOnTouch) property has changed.
    */
  var onHighlightOnTouchChanged: ChangeListeners[this.type, highlightOnTouch] = js.native
  
  /**
    * Fired when the [*id*](#id) property has changed.
    */
  var onIdChanged: ChangeListeners[this.type, id] = js.native
  
  /**
    * Fired when the [*layoutData*](#layoutData) property has changed.
    */
  var onLayoutDataChanged: ChangeListeners[this.type, layoutData] = js.native
  
  /**
    * Fired when the [*left*](#left) property has changed.
    */
  var onLeftChanged: ChangeListeners[this.type, left] = js.native
  
  /**
    * Fired after pressing a widget for a specific amount of time (about a second), and again on lifting
    * the finger.
    */
  var onLongPress: Listeners[WidgetLongPressEvent[this.type]] = js.native
  
  /**
    * Fired when the [*opacity*](#opacity) property has changed.
    */
  var onOpacityChanged: ChangeListeners[this.type, opacity] = js.native
  
  /**
    * Fired continuously after a finger touching the widget moved for a certain distance.
    */
  var onPan: Listeners[WidgetPanEvent[this.type]] = js.native
  
  /**
    * Fired when a finger starts moving down.
    */
  var onPanDown: Listeners[WidgetPanEvent[this.type]] = js.native
  
  /**
    * Fired when a finger starts moving left or right.
    */
  var onPanHorizontal: Listeners[WidgetPanEvent[this.type]] = js.native
  
  /**
    * Fired when a finger starts moving left.
    */
  var onPanLeft: Listeners[WidgetPanEvent[this.type]] = js.native
  
  /**
    * Fired when a finger starts moving right.
    */
  var onPanRight: Listeners[WidgetPanEvent[this.type]] = js.native
  
  /**
    * Fired when a finger starts moving up.
    */
  var onPanUp: Listeners[WidgetPanEvent[this.type]] = js.native
  
  /**
    * Fired when a finger starts moving up or down.
    */
  var onPanVertical: Listeners[WidgetPanEvent[this.type]] = js.native
  
  /**
    * Fired when the widget's size has changed.
    */
  var onResize: Listeners[WidgetResizeEvent[this.type]] = js.native
  
  /**
    * Fired when the [*right*](#right) property has changed.
    */
  var onRightChanged: ChangeListeners[this.type, right] = js.native
  
  /**
    * Fired when a finger moves down quickly.
    */
  var onSwipeDown: Listeners[WidgetSwipeEvent[this.type]] = js.native
  
  /**
    * Fired when a finger moves left quickly.
    */
  var onSwipeLeft: Listeners[WidgetSwipeEvent[this.type]] = js.native
  
  /**
    * Fired when a finger moves right quickly.
    */
  var onSwipeRight: Listeners[WidgetSwipeEvent[this.type]] = js.native
  
  /**
    * Fired when a finger moves up quickly.
    */
  var onSwipeUp: Listeners[WidgetSwipeEvent[this.type]] = js.native
  
  /**
    * Fired once when a finger briefly touched the widget.
    */
  var onTap: Listeners[WidgetTapEvent[this.type]] = js.native
  
  /**
    * Fired when the [*top*](#top) property has changed.
    */
  var onTopChanged: ChangeListeners[this.type, top] = js.native
  
  /**
    * Fired instead of touchEnd when the touch ends on another widget than it started on.
    */
  var onTouchCancel: Listeners[WidgetTouchEvent[this.type]] = js.native
  
  /**
    * Fired when a touch ends on the same widget than it started on.
    */
  var onTouchEnd: Listeners[WidgetTouchEvent[this.type]] = js.native
  
  /**
    * Fired repeatedly while swiping across the screen.
    */
  var onTouchMove: Listeners[WidgetTouchEvent[this.type]] = js.native
  
  /**
    * Fired when a widget is touched. See [Touch Events](../touch.md).
    */
  var onTouchStart: Listeners[WidgetTouchEvent[this.type]] = js.native
  
  /**
    * Fired when the [*transform*](#transform) property has changed.
    */
  var onTransformChanged: ChangeListeners[this.type, transform] = js.native
  
  /**
    * Fired when the [*visible*](#visible) property has changed.
    */
  var onVisibleChanged: ChangeListeners[this.type, visible] = js.native
  
  /**
    * Fired when the [*width*](#width) property has changed.
    */
  var onWidthChanged: ChangeListeners[this.type, width] = js.native
  
  /**
    * Opacity of the entire widget, in the range `[0..1]`. Can be used for fade animations.
    */
  var opacity: Double = js.native
  
  /**
    * Additional space to add inside the widgets bounds.
    * @constant
    */
  var padding: BoxDimensions | Null = js.native
  
  /**
    * Returns the parent of this widget or `null` if this widget is not appended to a parent.
    */
  def parent(): typings.tabris.mod.Composite[Widget] = js.native
  /**
    * Returns the first (nearest) parent of this widget that matches the given selector, or `null` if no
    * parent matches.
    * @param selector A selector expression or a predicate function to filter the results.
    */
  def parent[Result /* <: typings.tabris.mod.Composite[Widget] */](selector: Selector[typings.tabris.mod.Composite[Widget], Result]): Result = js.native
  
  /**
    * The position of the widget's right edge relative to the parent or a sibling widget.
    */
  var right: ConstraintValue = js.native
  
  /**
    * Returns a (possibly empty) collection of all siblings of this widget that match the given selector.
    * @param selector A selector expression or a predicate function to filter the results.
    */
  def siblings[Result /* <: Widget */](): WidgetCollection[Result] = js.native
  def siblings[Result /* <: Widget */](selector: Selector[Widget, Result]): WidgetCollection[Result] = js.native
  
  /**
    * The position of the widget's top edge relative to the parent or a sibling widget.
    */
  var top: ConstraintValue = js.native
  
  /**
    * Modifications to the widget's shape, size, or position. Can be used for animations. **Note:** In
    * Android the *transform* property does not affect the *bounds* property, while it does so in iOS.
    */
  var transform: Transformation = js.native
  
  /**
    * If set to false the widget will be invisible, but still occupy space in the parents layout. Visually
    * it is treated like a widget with an `opacity` of `0`, but in addition the widget can also not be
    * interacted with anymore.
    */
  var visible: Boolean = js.native
  
  /**
    * The width of the widget.
    */
  var width: Dimension | auto = js.native
}
