package typings.three

import typings.three.srcThreeMod.PointLight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesLightingPointLightNodeMod {
  
  @JSImport("three/examples/jsm/nodes/lighting/PointLightNode", JSImport.Default)
  @js.native
  open class default () extends PointLightNode {
    def this(light: PointLight) = this()
  }
  
  @js.native
  trait PointLightNode
    extends typings.three.examplesJsmNodesLightingAnalyticLightNodeMod.default[PointLight] {
    
    var cutoffDistanceNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var decayExponentNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
  }
}
