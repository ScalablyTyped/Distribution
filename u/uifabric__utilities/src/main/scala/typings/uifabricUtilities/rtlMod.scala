package typings.uifabricUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/rtl", JSImport.Namespace)
@js.native
object rtlMod extends js.Object {
  def getRTL(): Boolean = js.native
  def getRTL(theme: AnonRtl): Boolean = js.native
  def getRTLSafeKeyCode(key: Double): Double = js.native
  def getRTLSafeKeyCode(key: Double, theme: AnonRtl): Double = js.native
  def setRTL(isRTL: Boolean): Unit = js.native
  def setRTL(isRTL: Boolean, persistSetting: Boolean): Unit = js.native
}

