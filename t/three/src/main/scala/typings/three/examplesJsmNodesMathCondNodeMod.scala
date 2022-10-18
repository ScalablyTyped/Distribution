package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesMathCondNodeMod {
  
  @JSImport("three/examples/jsm/nodes/math/CondNode", JSImport.Default)
  @js.native
  open class default protected () extends CondNode {
    def this(
      condNode: typings.three.examplesJsmNodesCoreNodeMod.default,
      ifNode: typings.three.examplesJsmNodesCoreNodeMod.default,
      elseNode: typings.three.examplesJsmNodesCoreNodeMod.default
    ) = this()
  }
  
  @js.native
  trait CondNode
    extends typings.three.examplesJsmNodesCoreNodeMod.default {
    
    var condNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var elseNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var ifNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
  }
}
