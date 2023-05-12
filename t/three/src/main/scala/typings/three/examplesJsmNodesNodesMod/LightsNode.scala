package typings.three.examplesJsmNodesNodesMod

import typings.three.anon.Instantiable
import typings.three.anon.InstantiableDefault
import typings.three.examplesJsmNodesLightingLightsNodeMod.default
import typings.three.srcCamerasCameraMod.Camera
import typings.three.srcLightsLightShadowMod.LightShadow
import typings.three.srcThreeMod.Light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/nodes/Nodes", "LightsNode")
@js.native
open class LightsNode () extends default {
  def this(lightNodes: js.Array[typings.three.examplesJsmNodesLightingLightingNodeMod.default]) = this()
}
/* static members */
object LightsNode {
  
  @JSImport("three/examples/jsm/nodes/Nodes", "LightsNode")
  @js.native
  val ^ : js.Any = js.native
  
  inline def setReference[T /* <: Light[js.UndefOr[LightShadow[Camera]]] */](lightClass: Instantiable[T], lightNodeClass: InstantiableDefault[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setReference")(lightClass.asInstanceOf[js.Any], lightNodeClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
