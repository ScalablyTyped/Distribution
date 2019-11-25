package typings.vegaDashTypings.typesRuntimeSceneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneContext extends js.Object {
  var background: js.UndefOr[String] = js.undefined
}

object SceneContext {
  @scala.inline
  def apply(background: String = null): SceneContext = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneContext]
  }
}

