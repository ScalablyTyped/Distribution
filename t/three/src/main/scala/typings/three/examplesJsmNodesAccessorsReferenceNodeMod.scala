package typings.three

import typings.three.examplesJsmNodesCoreConstantsMod.NodeTypeOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesAccessorsReferenceNodeMod {
  
  @JSImport("three/examples/jsm/nodes/accessors/ReferenceNode", JSImport.Default)
  @js.native
  open class default[T] protected () extends ReferenceNode[T] {
    def this(property: String, uniformType: NodeTypeOption) = this()
    def this(property: String, uniformType: NodeTypeOption, `object`: T) = this()
  }
  
  @js.native
  trait ReferenceNode[T]
    extends typings.three.examplesJsmNodesCoreNodeMod.default {
    
    var node: typings.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var `object`: T = js.native
    
    var property: String = js.native
    
    def setNodeType(uniformType: NodeTypeOption): Unit = js.native
    
    var uniformType: String = js.native
  }
}
