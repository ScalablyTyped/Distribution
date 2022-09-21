package typings.three

import typings.std.ArrayLike
import typings.three.constantsMod.NodeTypeOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storageBufferNodeMod {
  
  @JSImport("three/examples/jsm/nodes/accessors/StorageBufferNode", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.three.bufferNodeMod.default {
    def this(value: ArrayLike[Double], bufferType: NodeTypeOption) = this()
    def this(value: ArrayLike[Double], bufferType: NodeTypeOption, bufferCount: Double) = this()
  }
  
  type StorageBufferNode = typings.three.bufferNodeMod.default
}
