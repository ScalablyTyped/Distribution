package typings.atUifabricUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/rtl", JSImport.Namespace)
@js.native
object libRtlMod extends js.Object {
  def getRTL(): Boolean = js.native
  def getRTL(theme: Anon_Rtl): Boolean = js.native
  def getRTLSafeKeyCode(key: Double): Double = js.native
  def getRTLSafeKeyCode(key: Double, theme: Anon_Rtl): Double = js.native
  def setRTL(isRTL: Boolean): Unit = js.native
  def setRTL(isRTL: Boolean, persistSetting: Boolean): Unit = js.native
}

