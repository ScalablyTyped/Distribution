package typings.three

import typings.three.nodesMod.TempNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayElementNodeMod {
  
  @JSImport("three/examples/jsm/nodes/utils/ArrayElementNode", JSImport.Default)
  @js.native
  open class default protected () extends ArrayElementNode {
    def this(node: typings.three.nodeMod.default, indexNode: typings.three.nodeMod.default) = this()
  }
  
  @js.native
  trait ArrayElementNode extends TempNode {
    
    var indexNode: typings.three.nodeMod.default = js.native
    
    var node: typings.three.nodeMod.default = js.native
  }
}
