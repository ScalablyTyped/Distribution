package typings.three

import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesFogFogExp2NodeMod {
  
  @JSImport("three/examples/jsm/nodes/fog/FogExp2Node", JSImport.Default)
  @js.native
  open class default protected () extends FogExp2Node {
    def this(
      colorNode: typings.three.examplesJsmNodesCoreNodeMod.default,
      densityNode: typings.three.examplesJsmNodesCoreNodeMod.default
    ) = this()
  }
  
  @js.native
  trait FogExp2Node
    extends typings.three.examplesJsmNodesFogFogNodeMod.default {
    
    var densityNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var isFogExp2Node: `true` = js.native
  }
}
