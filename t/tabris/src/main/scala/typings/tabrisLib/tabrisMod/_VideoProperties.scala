package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Video
trait _VideoProperties extends _WidgetProperties {
  /**
    * If set to `true`, starts playing the video as soon as the state changes from `open` to `ready`.
    */
  var autoPlay: scala.Boolean
  /**
    * If set to `true`, overlays the video with a native UI for controlling playback.
    */
  var controlsVisible: scala.Boolean
  /**
    * The URL of the video to play. Setting this property to any non-empty string changes the
    * *[state](#state)* to `open` and the video starts loading. Setting this property to an empty string
    * unloads the current video and the *[state](#state)* returns to `empty`.
    */
  var url: java.lang.String
}

object _VideoProperties {
  @scala.inline
  def apply(
    autoPlay: scala.Boolean,
    background: tabrisLib.Color,
    backgroundImage: tabrisLib.Image,
    baseline: Widget | tabrisLib.Selector,
    bottom: tabrisLib.margin,
    centerX: tabrisLib.offset,
    centerY: tabrisLib.offset,
    `class`: java.lang.String,
    classList: js.Array[java.lang.String],
    controlsVisible: scala.Boolean,
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
    url: java.lang.String,
    visible: scala.Boolean,
    width: tabrisLib.dimension,
    win_theme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light,
    font: tabrisLib.Font = null
  ): _VideoProperties = {
    val __obj = js.Dynamic.literal(autoPlay = autoPlay, background = background, backgroundImage = backgroundImage.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], bottom = bottom, centerX = centerX, centerY = centerY, classList = classList, controlsVisible = controlsVisible, cornerRadius = cornerRadius, elevation = elevation, enabled = enabled, height = height, highlightOnTouch = highlightOnTouch, id = id, layoutData = layoutData, left = left, opacity = opacity, right = right, top = top, transform = transform, url = url, visible = visible, width = width, win_theme = win_theme.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`)
    if (font != null) __obj.updateDynamic("font")(font)
    __obj.asInstanceOf[_VideoProperties]
  }
}

