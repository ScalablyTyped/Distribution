package typings.uifabricUtilities

import typings.uifabricUtilities.anon.Rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rtlMod {
  
  @JSImport("@uifabric/utilities/lib/rtl", "getRTL")
  @js.native
  def getRTL(): Boolean = js.native
  @JSImport("@uifabric/utilities/lib/rtl", "getRTL")
  @js.native
  def getRTL(theme: Rtl): Boolean = js.native
  
  @JSImport("@uifabric/utilities/lib/rtl", "getRTLSafeKeyCode")
  @js.native
  def getRTLSafeKeyCode(key: Double): Double = js.native
  @JSImport("@uifabric/utilities/lib/rtl", "getRTLSafeKeyCode")
  @js.native
  def getRTLSafeKeyCode(key: Double, theme: Rtl): Double = js.native
  
  @JSImport("@uifabric/utilities/lib/rtl", "setRTL")
  @js.native
  def setRTL(isRTL: Boolean): Unit = js.native
  @JSImport("@uifabric/utilities/lib/rtl", "setRTL")
  @js.native
  def setRTL(isRTL: Boolean, persistSetting: Boolean): Unit = js.native
}
