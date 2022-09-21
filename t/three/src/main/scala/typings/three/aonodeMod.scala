package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aonodeMod {
  
  @JSImport("three/examples/jsm/nodes/lighting/AONode", JSImport.Default)
  @js.native
  open class default () extends AONode {
    def this(aoNode: typings.three.nodeMod.default) = this()
  }
  
  @js.native
  trait AONode
    extends typings.three.lightingNodeMod.default {
    
    var aoNode: typings.three.nodeMod.default | Null = js.native
  }
}
