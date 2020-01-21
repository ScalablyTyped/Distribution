package typings.vegaTypings

import typings.vegaTypings.sceneMod.SceneContext
import typings.vegaTypings.sceneMod.SceneItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext extends js.Object {
  var context: SceneContext
  var height: Double
  var items: js.Array[SceneItem]
  var stroke: js.UndefOr[String] = js.undefined
  var width: Double
}

object AnonContext {
  @scala.inline
  def apply(
    context: SceneContext,
    height: Double,
    items: js.Array[SceneItem],
    width: Double,
    stroke: String = null
  ): AnonContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContext]
  }
}

