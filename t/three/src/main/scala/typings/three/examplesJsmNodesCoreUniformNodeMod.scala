package typings.three

import typings.three.examplesJsmNodesCoreConstantsMod.NodeTypeOption
import typings.three.examplesJsmNodesCoreConstantsMod.NodeValueOption
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesCoreUniformNodeMod {
  
  @JSImport("three/examples/jsm/nodes/core/UniformNode", JSImport.Default)
  @js.native
  open class default protected () extends UniformNode {
    def this(value: NodeValueOption) = this()
    def this(value: NodeValueOption, nodeType: NodeTypeOption) = this()
  }
  
  @js.native
  trait UniformNode
    extends typings.three.examplesJsmNodesCoreInputNodeMod.default {
    
    def getUniformHash(builder: typings.three.examplesJsmNodesCoreNodeBuilderMod.default): String = js.native
    
    var isUniformNode: `true` = js.native
  }
}
