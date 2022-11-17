package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesFogFogNodeMod {
  
  @JSImport("three/examples/jsm/nodes/fog/FogNode", JSImport.Default)
  @js.native
  open class default protected () extends FogNode {
    def this(
      colorNode: typings.three.examplesJsmNodesCoreNodeMod.default,
      factorNode: typings.three.examplesJsmNodesCoreNodeMod.default
    ) = this()
  }
  
  @js.native
  trait FogNode
    extends typings.three.examplesJsmNodesCoreNodeMod.default {
    
    var colorNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var factorNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var isFogNode: true = js.native
    
    def mix(outputNode: typings.three.examplesJsmNodesCoreNodeMod.default): typings.three.examplesJsmNodesCoreNodeMod.default = js.native
  }
}
