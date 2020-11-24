package typings.uifabricUtilities

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/utilities/lib/setFocusVisibility", JSImport.Namespace)
@js.native
object setFocusVisibilityMod extends js.Object {
  
  val IsFocusHiddenClassName: /* "ms-Fabric--isFocusHidden" */ String = js.native
  
  val IsFocusVisibleClassName: /* "ms-Fabric--isFocusVisible" */ String = js.native
  
  def setFocusVisibility(enabled: Boolean): Unit = js.native
  def setFocusVisibility(enabled: Boolean, target: Element): Unit = js.native
}
