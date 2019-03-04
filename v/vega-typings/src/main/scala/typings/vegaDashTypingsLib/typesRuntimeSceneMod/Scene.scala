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
    val __obj = js.Dynamic.literal(bounds = bounds, clip = clip, interactive = interactive, items = items, marktype = marktype, name = name, role = role)
  
    __obj.asInstanceOf[Scene]
  }
}

