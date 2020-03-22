package typings.vegaTypings.sceneMod

import typings.vegaTypings.AnonRole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vega-typings.vega-typings/types/runtime/scene.SceneItem & {  opacity  :number,   stroke  :string,   strokeWidth  :number,   x2  :number,   y2  :number} */
trait SceneLine extends js.Object {
  var bounds: Bounds
  var datum: js.UndefOr[js.Object] = js.undefined
  var mark: AnonRole
  var opacity: Double
  var stroke: String
  var strokeWidth: Double
  var x: Double
  var x2: Double
  var y: Double
  var y2: Double
}

object SceneLine {
  @scala.inline
  def apply(
    bounds: Bounds,
    mark: AnonRole,
    opacity: Double,
    stroke: String,
    strokeWidth: Double,
    x: Double,
    x2: Double,
    y: Double,
    y2: Double,
    datum: js.Object = null
  ): SceneLine = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    if (datum != null) __obj.updateDynamic("datum")(datum.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneLine]
  }
}

