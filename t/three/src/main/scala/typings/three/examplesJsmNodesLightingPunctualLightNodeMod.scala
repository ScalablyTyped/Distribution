package typings.three

import typings.three.srcThreeMod.PointLight
import typings.three.srcThreeMod.SpotLight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesLightingPunctualLightNodeMod {
  
  @JSImport("three/examples/jsm/nodes/lighting/PunctualLightNode", JSImport.Default)
  @js.native
  open class default () extends PunctualLightNode {
    def this(light: PunctualLight) = this()
  }
  
  type PunctualLight = PointLight | SpotLight
  
  @js.native
  trait PunctualLightNode
    extends typings.three.examplesJsmNodesLightingAnalyticLightNodeMod.default[PunctualLight] {
    
    var cutoffDistanceNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var decayExponentNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
  }
}
