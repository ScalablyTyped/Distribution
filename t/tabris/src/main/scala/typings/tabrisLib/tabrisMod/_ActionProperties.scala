package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Action
trait _ActionProperties extends _WidgetProperties {
  /**
    * Icon image for the action.
    */
  var image: Image | scala.Null
  /**
    * Actions with higher placement priority will be placed at a more significant position in the UI, e.g.
    * low priority actions could go into a menu instead of being included in a toolbar.
    */
  var placementPriority: tabrisLib.tabrisLibStrings.high | tabrisLib.tabrisLibStrings.low | tabrisLib.tabrisLibStrings.normal
  /**
    * The text to be displayed for the action.
    */
  var title: java.lang.String
  /**
    * Allows to override the image of the Action with an MDL2 ("Metro Design Language 2") symbol. When the
    * string does not exactly match [the name of an MDL2
    * symbol](https://msdn.microsoft.com/en-us/library/windows/apps/windows.ui.xaml.controls.symbol.aspx)
    * the `image` property is used instead. Platforms other than windows ignore this property and always
    * show the image.
    */
  var win_symbol: java.lang.String
}

object _ActionProperties {
  @scala.inline
  def apply(
    background: tabrisLib.Color,
    backgroundImage: Image,
    baseline: Widget | Selector,
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
    placementPriority: tabrisLib.tabrisLibStrings.high | tabrisLib.tabrisLibStrings.low | tabrisLib.tabrisLibStrings.normal,
    right: tabrisLib.margin,
    title: java.lang.String,
    top: tabrisLib.margin,
    transform: Transformation,
    visible: scala.Boolean,
    width: tabrisLib.dimension,
    win_symbol: java.lang.String,
    win_theme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light,
    font: tabrisLib.Font = null,
    image: Image = null
  ): _ActionProperties = {
    val __obj = js.Dynamic.literal(background = background, backgroundImage = backgroundImage.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], bottom = bottom, centerX = centerX, centerY = centerY, classList = classList, cornerRadius = cornerRadius, elevation = elevation, enabled = enabled, height = height, highlightOnTouch = highlightOnTouch, id = id, layoutData = layoutData, left = left, opacity = opacity, placementPriority = placementPriority.asInstanceOf[js.Any], right = right, title = title, top = top, transform = transform, visible = visible, width = width, win_symbol = win_symbol, win_theme = win_theme.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`)
    if (font != null) __obj.updateDynamic("font")(font)
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ActionProperties]
  }
}

