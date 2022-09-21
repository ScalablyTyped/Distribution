package typings.three

import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bypassNodeMod {
  
  @JSImport("three/examples/jsm/nodes/core/BypassNode", JSImport.Default)
  @js.native
  open class default protected () extends BypassNode {
    def this(returnNode: typings.three.nodeMod.default, callNode: typings.three.nodeMod.default) = this()
  }
  
  @js.native
  trait BypassNode
    extends typings.three.nodeMod.default {
    
    var callNode: typings.three.nodeMod.default = js.native
    
    var isBypassNode: `true` = js.native
    
    var outputNode: typings.three.nodeMod.default = js.native
  }
}
