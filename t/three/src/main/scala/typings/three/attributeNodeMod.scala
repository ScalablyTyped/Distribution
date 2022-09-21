package typings.three

import typings.three.constantsMod.NodeTypeOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attributeNodeMod {
  
  @JSImport("three/examples/jsm/nodes/core/AttributeNode", JSImport.Default)
  @js.native
  open class default protected () extends AttributeNode {
    def this(attributeName: String) = this()
    def this(attributeName: String, nodeType: NodeTypeOption) = this()
  }
  
  @js.native
  trait AttributeNode
    extends typings.three.nodeMod.default {
    
    def getAttributeName(builder: typings.three.nodeBuilderMod.default): String = js.native
    
    def setAttributeName(attributeName: String): this.type = js.native
  }
}
