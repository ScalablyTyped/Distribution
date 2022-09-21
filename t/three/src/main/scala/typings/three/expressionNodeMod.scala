package typings.three

import typings.three.constantsMod.NodeTypeOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expressionNodeMod {
  
  @JSImport("three/examples/jsm/nodes/core/ExpressionNode", JSImport.Default)
  @js.native
  /* sic */
  open class default () extends ExpressionNode {
    def this(snipped: String) = this()
    def this(snipped: String, nodeType: NodeTypeOption) = this()
    def this(snipped: Unit, nodeType: NodeTypeOption) = this()
  }
  
  @js.native
  trait ExpressionNode
    extends typings.three.tempNodeMod.default {
    
    var snipped: String = js.native
  }
}
