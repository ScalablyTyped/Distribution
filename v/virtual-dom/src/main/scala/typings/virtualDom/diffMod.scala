package typings.virtualDom

import typings.virtualDom.VirtualDOM.VPatch
import typings.virtualDom.VirtualDOM.VTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diffMod {
  
  @scala.inline
  def apply(left: VTree, right: VTree): js.Array[VPatch] = (^.asInstanceOf[js.Dynamic].apply(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Array[VPatch]]
  
  @JSImport("virtual-dom/diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
