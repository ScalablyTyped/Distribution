package typings.three

import typings.three.nodesMod.TempNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object joinNodeMod {
  
  @JSImport("three/examples/jsm/nodes/utils/JoinNode", JSImport.Default)
  @js.native
  open class default protected () extends JoinNode {
    def this(nodes: js.Array[typings.three.nodeMod.default]) = this()
  }
  
  @js.native
  trait JoinNode extends TempNode {
    
    var nodes: js.Array[typings.three.nodeMod.default] = js.native
  }
}
