package typings.vegaTypings.sceneMod

import typings.vegaTypings.AnonRole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vega-typings.vega-typings/types/runtime/scene.SceneItem & {  fill  :string,   height  :number,   width  :number} */
trait SceneRect extends js.Object {
  var bounds: Bounds
  var datum: js.UndefOr[js.Object] = js.undefined
  var fill: String
  var height: Double
  var mark: AnonRole
  var width: Double
  var x: Double
  var y: Double
}

object SceneRect {
  @scala.inline
  def apply(
    bounds: Bounds,
    fill: String,
    height: Double,
    mark: AnonRole,
    width: Double,
    x: Double,
    y: Double,
    datum: js.Object = null
  ): SceneRect = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (datum != null) __obj.updateDynamic("datum")(datum.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneRect]
  }
}

