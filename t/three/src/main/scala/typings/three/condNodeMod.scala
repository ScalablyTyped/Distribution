package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object condNodeMod {
  
  @JSImport("three/examples/jsm/nodes/math/CondNode", JSImport.Default)
  @js.native
  open class default protected () extends CondNode {
    def this(
      condNode: typings.three.nodeMod.default,
      ifNode: typings.three.nodeMod.default,
      elseNode: typings.three.nodeMod.default
    ) = this()
  }
  
  @js.native
  trait CondNode
    extends typings.three.nodeMod.default {
    
    var condNode: typings.three.nodeMod.default = js.native
    
    var elseNode: typings.three.nodeMod.default = js.native
    
    var ifNode: typings.three.nodeMod.default = js.native
  }
}
