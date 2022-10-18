package typings.three

import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesCoreBypassNodeMod {
  
  @JSImport("three/examples/jsm/nodes/core/BypassNode", JSImport.Default)
  @js.native
  open class default protected () extends BypassNode {
    def this(
      returnNode: typings.three.examplesJsmNodesCoreNodeMod.default,
      callNode: typings.three.examplesJsmNodesCoreNodeMod.default
    ) = this()
  }
  
  @js.native
  trait BypassNode
    extends typings.three.examplesJsmNodesCoreNodeMod.default {
    
    var callNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var isBypassNode: `true` = js.native
    
    var outputNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
  }
}
