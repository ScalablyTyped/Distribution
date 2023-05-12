package typings.three

import typings.three.srcThreeMod.SpotLight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesLightingSpotLightNodeMod {
  
  @JSImport("three/examples/jsm/nodes/lighting/SpotLightNode", JSImport.Default)
  @js.native
  open class default () extends PointLightNode {
    def this(light: SpotLight) = this()
  }
  
  @js.native
  trait PointLightNode
    extends typings.three.examplesJsmNodesLightingAnalyticLightNodeMod.default[SpotLight] {
    
    var coneCosNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var cutoffDistanceNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var decayExponentNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var directionNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var penumbraCosNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
  }
}
