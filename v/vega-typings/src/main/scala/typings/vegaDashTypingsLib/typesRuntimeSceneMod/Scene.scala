package typings
package vegaDashTypingsLib.typesRuntimeSceneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scene extends js.Object {
  var bounds: Bounds
  var clip: scala.Boolean
  var interactive: scala.Boolean
  var items: js.Array[SceneGroup]
  var marktype: java.lang.String
  var name: java.lang.String
  var role: java.lang.String
}

object Scene {
  @scala.inline
  def apply(
    bounds: Bounds,
    clip: scala.Boolean,
    interactive: scala.Boolean,
    items: js.Array[SceneGroup],
    marktype: java.lang.String,
    name: java.lang.String,
    role: java.lang.String
  ): Scene = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bounds")(bounds)
    __obj.updateDynamic("clip")(clip)
    __obj.updateDynamic("interactive")(interactive)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("marktype")(marktype)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[Scene]
  }
}

