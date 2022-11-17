package typings.three

import typings.std.ArrayLike
import typings.three.examplesJsmNodesCoreConstantsMod.NodeTypeOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesAccessorsBufferNodeMod {
  
  @JSImport("three/examples/jsm/nodes/accessors/BufferNode", JSImport.Default)
  @js.native
  open class default protected () extends BufferNode {
    def this(value: ArrayLike[Double], bufferType: NodeTypeOption) = this()
    def this(value: ArrayLike[Double], bufferType: NodeTypeOption, bufferCount: Double) = this()
  }
  
  @js.native
  trait BufferNode
    extends typings.three.examplesJsmNodesCoreUniformNodeMod.default {
    
    var bufferCount: Double = js.native
    
    var bufferType: String = js.native
    
    var isBufferNode: true = js.native
  }
}
