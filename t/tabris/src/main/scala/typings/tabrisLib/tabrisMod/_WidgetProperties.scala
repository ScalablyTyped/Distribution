package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Widget
trait _WidgetProperties extends _NativeObjectProperties {
  /**
    * Background color of the widget.
    */
  var background: tabrisLib.Color
  /**
    * An image to be displayed on the widget's background. If the image is smaller than the widget, it will
    * be tiled.
    */
  var backgroundImage: tabrisLib.Image
  /**
    * The vertical position of the widget's baseline relative to a sibling widget.
    */
  var baseline: Widget | tabrisLib.Selector
  /**
    * The position of the widget's bottom edge relative to the parent or a sibling widget.
    */
  var bottom: tabrisLib.margin
  /**
    * The horizontal position of the widget's center relative to the parent's center.
    */
  var centerX: tabrisLib.offset
  /**
    * The vertical position of the widget's center relative to the parent's center.
    */
  var centerY: tabrisLib.offset
  /**
    * A class name or a whitespace separated list of class names to identify the widget. Class names are
    * arbitrary strings that describe a state or a category and help to select widgets using a selector
    * expression. A class name may only contain alphanumeric characters, `_` and `-`. Class names can also
    * be added or removed using the field `classList`.
    */
  var `class`: java.lang.String
  /**
    * Provides convenient access to the list of class names set to this widget. Class names can either be
    * set using the `class` property or by modifying the `classList` directly.
    */
  var classList: js.Array[java.lang.String]
  /**
    * Configure a widget to have rounded corners. Each corner is affected equally. Supported on iOS and
    * Android 5.0+.
    */
  var cornerRadius: scala.Double
  /**
    * The position of the widget on the z-axis. Supported on iOS and Android 5.0+.
    */
  var elevation: scala.Double
  /**
    * Whether the widget can be operated.
    */
  var enabled: scala.Boolean
  /**
    * The font used for the widget.
    */
  var font: tabrisLib.Font | scala.Null
  /**
    * The height of the widget.
    */
  var height: tabrisLib.dimension
  /**
    * Whether the widget should show visual feedback while touched. Enabling `highlightOnTouch` will not
    * prevent the touch event from being propagated to the parent widget.
    */
  var highlightOnTouch: scala.Boolean
  /**
    * A string to identify the widget by using selectors. IDs are optional. It is strongly recommended that
    * they are unique within a page.
    */
  var id: java.lang.String
  /**
    * Shorthand for all layout properties. See [Layout](../layout.md).
    */
  var layoutData: LayoutData
  /**
    * The position of the widget's left edge relative to the parent or a sibling widget.
    */
  var left: tabrisLib.margin
  /**
    * Opacity of the entire widget, in the range `[0..1]`. Can be used for fade animations.
    */
  var opacity: scala.Double
  /**
    * The position of the widget's right edge relative to the parent or a sibling widget.
    */
  var right: tabrisLib.margin
  /**
    * The position of the widget's top edge relative to the parent or a sibling widget.
    */
  var top: tabrisLib.margin
  /**
    * Modifications to the widget's shape, size, or position. Can be used for animations. **Note:** In
    * Android the *transform* property does not affect the *bounds* property, while it does so in iOS.
    */
  var transform: Transformation
  /**
    * Whether the widget is visible.
    */
  var visible: scala.Boolean
  /**
    * The width of the widget.
    */
  var width: tabrisLib.dimension
  /**
    * Controls the color scheme used for this widget. When set to `"default"` the theme is inherited from
    * either the parent (if present) or the OS settings. Available only on windows.
    */
  var win_theme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light
}

object _WidgetProperties {
  @scala.inline
  def apply(
    background: tabrisLib.Color,
    backgroundImage: tabrisLib.Image,
    baseline: Widget | tabrisLib.Selector,
    bottom: tabrisLib.margin,
    centerX: tabrisLib.offset,
    centerY: tabrisLib.offset,
    `class`: java.lang.String,
    classList: js.Array[java.lang.String],
    cornerRadius: scala.Double,
    elevation: scala.Double,
    enabled: scala.Boolean,
    height: tabrisLib.dimension,
    highlightOnTouch: scala.Boolean,
    id: java.lang.String,
    layoutData: LayoutData,
    left: tabrisLib.margin,
    opacity: scala.Double,
    right: tabrisLib.margin,
    top: tabrisLib.margin,
    transform: Transformation,
    visible: scala.Boolean,
    width: tabrisLib.dimension,
    win_theme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light,
    font: tabrisLib.Font = null
  ): _WidgetProperties = {
    val __obj = js.Dynamic.literal(background = background, backgroundImage = backgroundImage.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], bottom = bottom, centerX = centerX, centerY = centerY, classList = classList, cornerRadius = cornerRadius, elevation = elevation, enabled = enabled, height = height, highlightOnTouch = highlightOnTouch, id = id, layoutData = layoutData, left = left, opacity = opacity, right = right, top = top, transform = transform, visible = visible, width = width, win_theme = win_theme.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`)
    if (font != null) __obj.updateDynamic("font")(font)
    __obj.asInstanceOf[_WidgetProperties]
  }
}

