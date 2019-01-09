package typings
package vegaDashTypingsLib.typesRuntimeSceneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-typings/types/runtime/scene", JSImport.Namespace)
@js.native
object typesRuntimeSceneModMembers extends js.Object {
  def sceneVisit(
    scene: SceneGroup,
    itemCallback: js.Function1[/* item */ Scene | SceneGroup | SceneItem, scala.Unit]
  ): scala.Unit = js.native
  def sceneVisit(scene: Scene, itemCallback: js.Function1[/* item */ Scene | SceneGroup | SceneItem, scala.Unit]): scala.Unit = js.native
}

