package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  var context: vegaDashTypingsLib.typesRuntimeSceneMod.SceneContext
  var height: scala.Double
  var items: js.Array[vegaDashTypingsLib.typesRuntimeSceneMod.SceneItem]
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  var width: scala.Double
}

object Anon_Context {
  @scala.inline
  def apply(
    context: vegaDashTypingsLib.typesRuntimeSceneMod.SceneContext,
    height: scala.Double,
    items: js.Array[vegaDashTypingsLib.typesRuntimeSceneMod.SceneItem],
    width: scala.Double,
    stroke: java.lang.String = null
  ): Anon_Context = {
    val __obj = js.Dynamic.literal(context = context, height = height, items = items, width = width)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    __obj.asInstanceOf[Anon_Context]
  }
}

