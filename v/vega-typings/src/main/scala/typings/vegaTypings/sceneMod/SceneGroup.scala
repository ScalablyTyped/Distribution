package typings.vegaTypings.sceneMod

import typings.vegaTypings.anon.Role
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vega-typings.vega-typings/types/runtime/scene.SceneItem & {  context  :vega-typings.vega-typings/types/runtime/scene.SceneContext,   items  :std.Array<vega-typings.vega-typings/types/runtime/scene.SceneItem>,   height  :number,   width  :number,   stroke ? :string} */
trait SceneGroup extends js.Object {
  var bounds: Bounds
  var context: SceneContext
  var datum: js.UndefOr[js.Object] = js.undefined
  var height: Double
  var items: js.Array[SceneItem]
  var mark: Role
  var stroke: js.UndefOr[String] = js.undefined
  var width: Double
  var x: Double
  var y: Double
}

object SceneGroup {
  @scala.inline
  def apply(
    bounds: Bounds,
    context: SceneContext,
    height: Double,
    items: js.Array[SceneItem],
    mark: Role,
    width: Double,
    x: Double,
    y: Double,
    datum: js.Object = null,
    stroke: String = null
  ): SceneGroup = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (datum != null) __obj.updateDynamic("datum")(datum.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneGroup]
  }
}

