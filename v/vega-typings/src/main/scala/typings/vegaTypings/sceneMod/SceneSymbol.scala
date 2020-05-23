package typings.vegaTypings.sceneMod

import typings.vegaTypings.anon.Role
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vega-typings.vega-typings/types/runtime/scene.SceneItem & {  fill  :string,   shape  :string,   size  :number,   strokeWidth  :number} */
trait SceneSymbol extends js.Object {
  var bounds: Bounds
  var datum: js.UndefOr[js.Object] = js.undefined
  var fill: String
  var mark: Role
  var shape: String
  var size: Double
  var strokeWidth: Double
  var x: Double
  var y: Double
}

object SceneSymbol {
  @scala.inline
  def apply(
    bounds: Bounds,
    fill: String,
    mark: Role,
    shape: String,
    size: Double,
    strokeWidth: Double,
    x: Double,
    y: Double,
    datum: js.Object = null
  ): SceneSymbol = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (datum != null) __obj.updateDynamic("datum")(datum.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneSymbol]
  }
}

