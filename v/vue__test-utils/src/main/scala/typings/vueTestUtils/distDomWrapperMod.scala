package typings.vueTestUtils

import typings.std.Node
import typings.vueTestUtils.distBaseWrapperMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDomWrapperMod {
  
  @JSImport("@vue/test-utils/dist/domWrapper", "DOMWrapper")
  @js.native
  open class DOMWrapper[NodeType /* <: Node */] () extends default[NodeType] {
    def this(element: NodeType) = this()
    
    /* private */ var setChecked: Any = js.native
    
    /* private */ var setSelected: Any = js.native
  }
}
