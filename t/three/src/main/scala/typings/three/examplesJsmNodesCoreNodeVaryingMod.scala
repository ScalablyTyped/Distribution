package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesCoreNodeVaryingMod {
  
  @JSImport("three/examples/jsm/nodes/core/NodeVarying", JSImport.Default)
  @js.native
  open class default protected () extends NodeVarying {
    def this(name: String, `type`: String) = this()
  }
  
  @js.native
  trait NodeVarying
    extends typings.three.examplesJsmNodesCoreNodeVarMod.default {
    
    var isNodeVarying: true = js.native
    
    var needsInterpolation: false = js.native
  }
}
