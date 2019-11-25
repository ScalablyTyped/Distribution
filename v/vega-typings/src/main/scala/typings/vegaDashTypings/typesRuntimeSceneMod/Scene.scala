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
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], clip = clip.asInstanceOf[js.Any], interactive = interactive.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], marktype = marktype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Scene]
  }
}

