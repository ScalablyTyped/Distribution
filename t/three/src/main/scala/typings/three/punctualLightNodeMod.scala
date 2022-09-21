package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object punctualLightNodeMod {
  
  @JSImport("three/examples/jsm/nodes/lighting/PunctualLightNode", JSImport.Default)
  @js.native
  open class default () extends PunctualLightNode {
    def this(light: PunctualLight) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.three.threeMod.PointLight
    - typings.three.threeMod.SpotLight
  */
  trait PunctualLight extends StObject
  
  @js.native
  trait PunctualLightNode
    extends typings.three.analyticLightNodeMod.default[PunctualLight] {
    
    var cutoffDistanceNode: typings.three.nodeMod.default = js.native
    
    var decayExponentNode: typings.three.nodeMod.default = js.native
  }
}
