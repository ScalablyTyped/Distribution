package typings.three

import typings.three.constantsMod.NodeTypeOption
import typings.three.constantsMod.NodeValueOption
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constNodeMod {
  
  @JSImport("three/examples/jsm/nodes/core/ConstNode", JSImport.Default)
  @js.native
  open class default protected () extends ConstNode {
    def this(value: NodeValueOption) = this()
    def this(value: NodeValueOption, nodeType: NodeTypeOption) = this()
  }
  
  @js.native
  trait ConstNode
    extends typings.three.inputNodeMod.default {
    
    def generateConst(builder: typings.three.nodeBuilderMod.default): String = js.native
    
    var isConstNode: `true` = js.native
  }
}
