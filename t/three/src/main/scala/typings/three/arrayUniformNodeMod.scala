package typings.three

import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayUniformNodeMod {
  
  @JSImport("three/examples/jsm/nodes/core/ArrayUniformNode", JSImport.Default)
  @js.native
  open class default () extends ArrayUniformNode {
    def this(nodes: js.Array[typings.three.nodeMod.default]) = this()
  }
  
  @js.native
  trait ArrayUniformNode
    extends typings.three.uniformNodeMod.default {
    
    var isArrayUniformNode: `true` = js.native
    
    var nodes: js.Array[typings.three.nodeMod.default] = js.native
  }
}
