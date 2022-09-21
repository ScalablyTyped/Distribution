package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spriteSheetUVNodeMod {
  
  @JSImport("three/examples/jsm/nodes/utils/SpriteSheetUVNode", JSImport.Default)
  @js.native
  open class default protected () extends SpriteSheetUVNode {
    def this(countNode: typings.three.nodeMod.default) = this()
    def this(countNode: typings.three.nodeMod.default, uvNode: typings.three.nodeMod.default) = this()
    def this(countNode: typings.three.nodeMod.default, uvNode: Unit, frameNode: typings.three.nodeMod.default) = this()
    def this(
      countNode: typings.three.nodeMod.default,
      uvNode: typings.three.nodeMod.default,
      frameNode: typings.three.nodeMod.default
    ) = this()
  }
  
  @js.native
  trait SpriteSheetUVNode
    extends typings.three.nodeMod.default {
    
    var countNode: typings.three.nodeMod.default = js.native
    
    var frameNode: typings.three.nodeMod.default = js.native
    
    var uvNode: typings.three.nodeMod.default = js.native
  }
}
