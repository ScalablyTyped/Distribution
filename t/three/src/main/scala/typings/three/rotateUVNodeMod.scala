package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rotateUVNodeMod {
  
  @JSImport("three/examples/jsm/nodes/utils/RotateUVNode", JSImport.Default)
  @js.native
  open class default protected () extends RotateUVNode {
    def this(uvNode: typings.three.nodeMod.default, rotationNode: typings.three.nodeMod.default) = this()
    def this(
      uvNode: typings.three.nodeMod.default,
      rotationNode: typings.three.nodeMod.default,
      centerNode: typings.three.nodeMod.default
    ) = this()
  }
  
  @js.native
  trait RotateUVNode
    extends typings.three.tempNodeMod.default {
    
    var centerNode: typings.three.nodeMod.default = js.native
    
    var rotationNode: typings.three.nodeMod.default = js.native
    
    var uvNode: typings.three.nodeMod.default = js.native
  }
}
