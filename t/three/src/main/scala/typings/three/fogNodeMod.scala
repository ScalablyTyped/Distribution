package typings.three

import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fogNodeMod {
  
  @JSImport("three/examples/jsm/nodes/fog/FogNode", JSImport.Default)
  @js.native
  open class default protected () extends FogNode {
    def this(colorNode: typings.three.nodeMod.default, factorNode: typings.three.nodeMod.default) = this()
  }
  
  @js.native
  trait FogNode
    extends typings.three.nodeMod.default {
    
    var colorNode: typings.three.nodeMod.default = js.native
    
    var factorNode: typings.three.nodeMod.default = js.native
    
    var isFogNode: `true` = js.native
    
    def mix(outputNode: typings.three.nodeMod.default): typings.three.nodeMod.default = js.native
  }
}
