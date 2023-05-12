package typings.three

import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesCoreStackNodeMod {
  
  @JSImport("three/examples/jsm/nodes/core/StackNode", JSImport.Default)
  @js.native
  open class default () extends StackNode
  
  @js.native
  trait StackNode
    extends typings.three.examplesJsmNodesCoreNodeMod.default {
    
    def assign(
      targetNode: typings.three.examplesJsmNodesCoreNodeMod.default,
      sourceValue: typings.three.examplesJsmNodesCoreNodeMod.default
    ): this.type = js.native
    
    var isStackNode: `true` = js.native
    
    var nodes: js.Array[typings.three.examplesJsmNodesCoreNodeMod.default] = js.native
    
    var outputNode: typings.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
  }
}
