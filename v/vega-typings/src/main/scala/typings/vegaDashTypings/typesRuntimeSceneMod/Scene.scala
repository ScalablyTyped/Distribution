package typings.vegaDashTypings.typesRuntimeSceneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scene extends js.Object {
  var bounds: Bounds
  var clip: Boolean
  var interactive: Boolean
  var items: js.Array[SceneGroup]
  var marktype: String
  var name: String
  var role: String
}

object Scene {
  @scala.inline
  def apply(
    bounds: Bounds,
    clip: Boolean,
    interactive: Boolean,
    items: js.Array[SceneGroup],
    marktype: String,
    name: String,
    role: String
  ): Scene = {
    val __obj = js.Dynamic.literal(bounds = bounds, clip = clip, interactive = interactive, items = items, marktype = marktype, name = name, role = role)
  
    __obj.asInstanceOf[Scene]
  }
}

