package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesFogFogRangeNodeMod {
  
  @JSImport("three/examples/jsm/nodes/fog/FogRangeNode", JSImport.Default)
  @js.native
  open class default protected () extends FogRangeNode {
    def this(
      colorNode: typings.three.examplesJsmNodesCoreNodeMod.default,
      nearNode: typings.three.examplesJsmNodesCoreNodeMod.default,
      farNode: typings.three.examplesJsmNodesCoreNodeMod.default
    ) = this()
  }
  
  @js.native
  trait FogRangeNode
    extends typings.three.examplesJsmNodesFogFogNodeMod.default {
    
    var farNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var isFogRangeNode: true = js.native
    
    var nearNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
  }
}
