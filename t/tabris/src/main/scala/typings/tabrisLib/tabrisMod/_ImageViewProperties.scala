package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ImageView
trait _ImageViewProperties extends _WidgetProperties {
  /**
    * The image to display. Providing the `width` and `height` attributes on the image will resize it
    * internally. When no dimensions are given the image will be loaded with its original size. Since the
    * full size image might occupy a lot of memory, it's recommended to provide exact dimensions.
    */
  var image: Image | scala.Null
  /**
    * The highest amount the image can be zoomed in to. Setting the `maxZoomLevel` to a level smaller than
    * the current `zoomLevel` changes the `zoomLevel` to be the same as the new `maxZoomLevel`.
    */
  var maxZoomLevel: scala.Double
  /**
    * The lowest amount the image can be zoomed out to. Setting the `minZoomLevel` to a level larger than
    * the current `zoomLevel` changes the `zoomLevel` to be the same as the new `minZoomLevel`. 
    */
  var minZoomLevel: scala.Double
  /**
    * How to scale the image.
    * - `fit` will scale the image proportionally to fit into the view, possible leaving some empty space
    * at the edges. That is, the image will be displayed as large as possible while being fully contained
    * in the view.
    * - `fill` will scale the image proportionally to fill the entire view, possibly cutting off parts of
    * the image. That is, the image will be displayed as small as possible while covering the entire view.
    * - `auto` will scale *down* the image to *fit* into the view if it is too large, but it won't scale up
    * a smaller image.
    * - `stretch` will resize the image to the actual bounds of the image view.
    * - `none` will not resize the image at all. The image will be displayed in its original size.
    */
  var scaleMode: tabrisLib.tabrisLibStrings.auto | tabrisLib.tabrisLibStrings.fill | tabrisLib.tabrisLibStrings.fit | tabrisLib.tabrisLibStrings.none | tabrisLib.tabrisLibStrings.stretch
  /**
    * A color to change the image appearance. All opaque parts of the image will be tinted with the given
    * color. Set to `initial` to remove the effect.
    */
  var tintColor: tabrisLib.Color
  /**
    * Enables the pinch-to-zoom gesture on the `ImageView` and makes the properties `zoomLevel`,
    * `minZoomLevel` and `maxZoomLevel` available. Setting `zoomEnabled` to `false` also resets the
    * `zoomLevel`, `minZoomLevel`, `maxZoomLevel` to their respective defaults.
    */
  var zoomEnabled: scala.Boolean
  /**
    * The amount that the image is zoomed in or out. The default position without any zooming has the value
    * 1.0.
    */
  var zoomLevel: scala.Double
}

object _ImageViewProperties {
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
    maxZoomLevel: scala.Double,
    minZoomLevel: scala.Double,
    opacity: scala.Double,
    right: tabrisLib.margin,
    scaleMode: tabrisLib.tabrisLibStrings.auto | tabrisLib.tabrisLibStrings.fill | tabrisLib.tabrisLibStrings.fit | tabrisLib.tabrisLibStrings.none | tabrisLib.tabrisLibStrings.stretch,
    tintColor: tabrisLib.Color,
    top: tabrisLib.margin,
    transform: Transformation,
    visible: scala.Boolean,
    width: tabrisLib.dimension,
    win_theme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light,
    zoomEnabled: scala.Boolean,
    zoomLevel: scala.Double,
    font: tabrisLib.Font = null,
    image: Image = null
  ): _ImageViewProperties = {
    val __obj = js.Dynamic.literal(background = background, backgroundImage = backgroundImage.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], bottom = bottom, centerX = centerX, centerY = centerY, classList = classList, cornerRadius = cornerRadius, elevation = elevation, enabled = enabled, height = height, highlightOnTouch = highlightOnTouch, id = id, layoutData = layoutData, left = left, maxZoomLevel = maxZoomLevel, minZoomLevel = minZoomLevel, opacity = opacity, right = right, scaleMode = scaleMode.asInstanceOf[js.Any], tintColor = tintColor, top = top, transform = transform, visible = visible, width = width, win_theme = win_theme.asInstanceOf[js.Any], zoomEnabled = zoomEnabled, zoomLevel = zoomLevel)
    __obj.updateDynamic("class")(`class`)
    if (font != null) __obj.updateDynamic("font")(font)
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ImageViewProperties]
  }
}

