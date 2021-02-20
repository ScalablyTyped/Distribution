package typings.uifabricUtilities

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setFocusVisibilityMod {
  
  @JSImport("@uifabric/utilities/lib/setFocusVisibility", "IsFocusHiddenClassName")
  @js.native
  val IsFocusHiddenClassName: /* "ms-Fabric--isFocusHidden" */ String = js.native
  
  @JSImport("@uifabric/utilities/lib/setFocusVisibility", "IsFocusVisibleClassName")
  @js.native
  val IsFocusVisibleClassName: /* "ms-Fabric--isFocusVisible" */ String = js.native
  
  @JSImport("@uifabric/utilities/lib/setFocusVisibility", "setFocusVisibility")
  @js.native
  def setFocusVisibility(enabled: Boolean): Unit = js.native
  @JSImport("@uifabric/utilities/lib/setFocusVisibility", "setFocusVisibility")
  @js.native
  def setFocusVisibility(enabled: Boolean, target: Element): Unit = js.native
}
