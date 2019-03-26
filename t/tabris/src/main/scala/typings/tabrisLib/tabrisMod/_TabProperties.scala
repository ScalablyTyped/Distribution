package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Tab
trait _TabProperties extends _CompositeProperties {
  /**
    * A badge to attach to the tab.
    */
  var badge: java.lang.String
  /**
    * An image to be displayed on the tab.  Will not be shown on iOS if the `TabFolder`'s `tabBarLocation`
    * is set to `top`
    */
  var image: tabrisLib.Image | scala.Null
  /**
    * An image to be displayed on the currently active tab.
    */
  var selectedImage: tabrisLib.Image | scala.Null
  /**
    * The title to be displayed on the tab.
    */
  var title: java.lang.String
}

object _TabProperties {
  @scala.inline
  def apply(
    background: tabrisLib.Color,
    backgroundImage: tabrisLib.Image,
    badge: java.lang.String,
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
    padding: BoxDimensions | scala.Double,
    right: tabrisLib.margin,
    title: java.lang.String,
    top: tabrisLib.margin,
    transform: Transformation,
    visible: scala.Boolean,
    width: tabrisLib.dimension,
    win_theme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light,
    font: tabrisLib.Font = null,
    image: tabrisLib.Image = null,
    selectedImage: tabrisLib.Image = null
  ): _TabProperties = {
    val __obj = js.Dynamic.literal(background = background, backgroundImage = backgroundImage.asInstanceOf[js.Any], badge = badge, baseline = baseline.asInstanceOf[js.Any], bottom = bottom, centerX = centerX, centerY = centerY, classList = classList, cornerRadius = cornerRadius, elevation = elevation, enabled = enabled, height = height, highlightOnTouch = highlightOnTouch, id = id, layoutData = layoutData, left = left, opacity = opacity, padding = padding.asInstanceOf[js.Any], right = right, title = title, top = top, transform = transform, visible = visible, width = width, win_theme = win_theme.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`)
    if (font != null) __obj.updateDynamic("font")(font)
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (selectedImage != null) __obj.updateDynamic("selectedImage")(selectedImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TabProperties]
  }
}

