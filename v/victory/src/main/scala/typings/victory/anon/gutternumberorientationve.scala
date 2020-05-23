package typings.victory.anon

import typings.victory.mod.OrientationTypes
import typings.victory.victoryStrings.horizontal
import typings.victory.victoryStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  gutter ? :number,   orientation ? :'vertical' | 'horizontal',   titleOrientation ? :victory.victory.OrientationTypes,   style ? :{  data ? :react.react.CSSProperties & {  type ? :victory.victory.ScatterSymbolType},   labels ? :react.react.CSSProperties,   title ? :react.react.CSSProperties}} & victory.victory.ThemeBaseProps */
trait gutternumberorientationve extends js.Object {
  var colorScale: js.Array[String]
  var gutter: js.UndefOr[Double] = js.undefined
  var height: Double
  var orientation: js.UndefOr[vertical | horizontal] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[Labels] = js.undefined
  var titleOrientation: js.UndefOr[OrientationTypes] = js.undefined
  var width: Double
}

object gutternumberorientationve {
  @scala.inline
  def apply(
    colorScale: js.Array[String],
    height: Double,
    width: Double,
    gutter: js.UndefOr[Double] = js.undefined,
    orientation: vertical | horizontal = null,
    padding: js.UndefOr[Double] = js.undefined,
    style: Labels = null,
    titleOrientation: OrientationTypes = null
  ): gutternumberorientationve = {
    val __obj = js.Dynamic.literal(colorScale = colorScale.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(gutter)) __obj.updateDynamic("gutter")(gutter.get.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (titleOrientation != null) __obj.updateDynamic("titleOrientation")(titleOrientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[gutternumberorientationve]
  }
}

