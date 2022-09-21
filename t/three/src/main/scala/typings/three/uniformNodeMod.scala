package typings.three

import typings.three.constantsMod.NodeTypeOption
import typings.three.constantsMod.NodeValueOption
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uniformNodeMod {
  
  @JSImport("three/examples/jsm/nodes/core/UniformNode", JSImport.Default)
  @js.native
  open class default protected () extends UniformNode {
    def this(value: NodeValueOption) = this()
    def this(value: NodeValueOption, nodeType: NodeTypeOption) = this()
  }
  
  @js.native
  trait UniformNode
    extends typings.three.inputNodeMod.default {
    
    def getUniformHash(builder: typings.three.nodeBuilderMod.default): String = js.native
    
    var isUniformNode: `true` = js.native
  }
}
