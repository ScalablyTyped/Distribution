package typings.three

import typings.three.srcCamerasCameraMod.Camera
import typings.three.srcLightsLightShadowMod.LightShadow
import typings.three.srcThreeMod.Light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesLightingAnalyticLightNodeMod {
  
  @JSImport("three/examples/jsm/nodes/lighting/AnalyticLightNode", JSImport.Default)
  @js.native
  open class default[T /* <: Light[js.UndefOr[LightShadow[Camera]]] */] () extends AnalyticLightNode[T] {
    def this(light: T) = this()
  }
  
  @js.native
  trait AnalyticLightNode[T /* <: Light[js.UndefOr[LightShadow[Camera]]] */]
    extends typings.three.examplesJsmNodesLightingLightingNodeMod.default {
    
    var colorNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var light: T | Null = js.native
  }
}
