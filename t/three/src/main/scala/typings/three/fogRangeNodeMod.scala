package typings.three

import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fogRangeNodeMod {
  
  @JSImport("three/examples/jsm/nodes/fog/FogRangeNode", JSImport.Default)
  @js.native
  open class default protected () extends FogRangeNode {
    def this(
      colorNode: typings.three.nodeMod.default,
      nearNode: typings.three.nodeMod.default,
      farNode: typings.three.nodeMod.default
    ) = this()
  }
  
  @js.native
  trait FogRangeNode
    extends typings.three.fogNodeMod.default {
    
    var farNode: typings.three.nodeMod.default = js.native
    
    var isFogRangeNode: `true` = js.native
    
    var nearNode: typings.three.nodeMod.default = js.native
  }
}
