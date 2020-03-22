package typings.vegaTypings.sceneMod

import typings.vegaTypings.AnonRole
import typings.vegaTypings.vegaTypingsStrings.ltr
import typings.vegaTypings.vegaTypingsStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vega-typings.vega-typings/types/runtime/scene.SceneItem & {  align ? :vega-typings.vega-typings/types/runtime/scene.SceneTextAlign,   angle ? :number,   baseline  :vega-typings.vega-typings/types/runtime/scene.SceneTextBaseline,   dir ? :'rtl' | 'ltr',   dx ? :number,   dy  :number,   ellipsis ? :string,   fill  :string,   font  :string,   fontSize  :number,   fontStyle ? :string,   fontWeight ? :number | string,   limit ? :number,   lineBreak ? :string,   lineHeight ? :number,   radius ? :number,   text  :string,   theta ? :number} */
trait SceneText extends js.Object {
  var align: js.UndefOr[SceneTextAlign] = js.undefined
  var angle: js.UndefOr[Double] = js.undefined
  var baseline: SceneTextBaseline
  var bounds: Bounds
  var datum: js.UndefOr[js.Object] = js.undefined
  var dir: js.UndefOr[rtl | ltr] = js.undefined
  var dx: js.UndefOr[Double] = js.undefined
  var dy: Double
  var ellipsis: js.UndefOr[String] = js.undefined
  var fill: String
  var font: String
  var fontSize: Double
  var fontStyle: js.UndefOr[String] = js.undefined
  var fontWeight: js.UndefOr[Double | String] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var lineBreak: js.UndefOr[String] = js.undefined
  var lineHeight: js.UndefOr[Double] = js.undefined
  var mark: AnonRole
  var radius: js.UndefOr[Double] = js.undefined
  var text: String
  var theta: js.UndefOr[Double] = js.undefined
  var x: Double
  var y: Double
}

object SceneText {
  @scala.inline
  def apply(
    baseline: SceneTextBaseline,
    bounds: Bounds,
    dy: Double,
    fill: String,
    font: String,
    fontSize: Double,
    mark: AnonRole,
    text: String,
    x: Double,
    y: Double,
    align: SceneTextAlign = null,
    angle: Int | Double = null,
    datum: js.Object = null,
    dir: rtl | ltr = null,
    dx: Int | Double = null,
    ellipsis: String = null,
    fontStyle: String = null,
    fontWeight: Double | String = null,
    limit: Int | Double = null,
    lineBreak: String = null,
    lineHeight: Int | Double = null,
    radius: Int | Double = null,
    theta: Int | Double = null
  ): SceneText = {
    val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (datum != null) __obj.updateDynamic("datum")(datum.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (ellipsis != null) __obj.updateDynamic("ellipsis")(ellipsis.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (lineBreak != null) __obj.updateDynamic("lineBreak")(lineBreak.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (theta != null) __obj.updateDynamic("theta")(theta.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneText]
  }
}

