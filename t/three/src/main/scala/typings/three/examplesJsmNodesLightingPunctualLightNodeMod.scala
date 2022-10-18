package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesLightingPunctualLightNodeMod {
  
  @JSImport("three/examples/jsm/nodes/lighting/PunctualLightNode", JSImport.Default)
  @js.native
  open class default () extends PunctualLightNode {
    def this(light: PunctualLight) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.three.srcThreeMod.PointLight
    - typings.three.srcThreeMod.SpotLight
  */
  trait PunctualLight extends StObject
  
  @js.native
  trait PunctualLightNode
    extends typings.three.examplesJsmNodesLightingAnalyticLightNodeMod.default[PunctualLight] {
    
    var cutoffDistanceNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var decayExponentNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
  }
}
