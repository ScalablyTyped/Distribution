package typings
package vegaDashTypingsLib.typesRuntimeSceneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneContext extends js.Object {
  var background: js.UndefOr[java.lang.String] = js.undefined
}

object SceneContext {
  @scala.inline
  def apply(background: java.lang.String = null): SceneContext = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    __obj.asInstanceOf[SceneContext]
  }
}

