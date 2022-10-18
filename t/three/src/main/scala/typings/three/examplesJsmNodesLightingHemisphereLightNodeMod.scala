package typings.three

import typings.three.srcThreeMod.HemisphereLight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesLightingHemisphereLightNodeMod {
  
  @JSImport("three/examples/jsm/nodes/lighting/HemisphereLightNode", JSImport.Default)
  @js.native
  open class default () extends HemisphereLightNode {
    def this(light: HemisphereLight) = this()
  }
  
  @js.native
  trait HemisphereLightNode
    extends typings.three.examplesJsmNodesLightingAnalyticLightNodeMod.default[HemisphereLight] {
    
    var groundColorNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var lightDirectionNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var lightPositionNode: typings.three.examplesJsmNodesAccessorsObject3DNodeMod.default = js.native
  }
}
