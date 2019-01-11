package typings
package vegaDashTypingsLib.typesRuntimeSceneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-typings/types/runtime/scene", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def sceneVisit(
    scene: vegaDashTypingsLib.typesRuntimeSceneMod.SceneGroup,
    itemCallback: js.Function1[
      /* item */ vegaDashTypingsLib.typesRuntimeSceneMod.Scene | vegaDashTypingsLib.typesRuntimeSceneMod.SceneGroup | vegaDashTypingsLib.typesRuntimeSceneMod.SceneItem, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def sceneVisit(
    scene: vegaDashTypingsLib.typesRuntimeSceneMod.Scene,
    itemCallback: js.Function1[
      /* item */ vegaDashTypingsLib.typesRuntimeSceneMod.Scene | vegaDashTypingsLib.typesRuntimeSceneMod.SceneGroup | vegaDashTypingsLib.typesRuntimeSceneMod.SceneItem, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

