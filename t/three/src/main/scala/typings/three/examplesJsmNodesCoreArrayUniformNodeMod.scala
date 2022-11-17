package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesCoreArrayUniformNodeMod {
  
  @JSImport("three/examples/jsm/nodes/core/ArrayUniformNode", JSImport.Default)
  @js.native
  open class default () extends ArrayUniformNode {
    def this(nodes: js.Array[typings.three.examplesJsmNodesCoreNodeMod.default]) = this()
  }
  
  @js.native
  trait ArrayUniformNode
    extends typings.three.examplesJsmNodesCoreUniformNodeMod.default {
    
    var isArrayUniformNode: true = js.native
    
    var nodes: js.Array[typings.three.examplesJsmNodesCoreNodeMod.default] = js.native
  }
}
