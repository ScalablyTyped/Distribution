package typings.virtualDom

import typings.virtualDom.VirtualDOM.VPatch
import typings.virtualDom.VirtualDOM.VTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diffMod {
  
  @JSImport("virtual-dom/diff", JSImport.Namespace)
  @js.native
  def apply(left: VTree, right: VTree): js.Array[VPatch] = js.native
}
