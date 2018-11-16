package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlayReadyHardwareDRMFeatures extends js.Object

/** Indicates the valid list of hardware digital rights management (DRM) feature values that can be queried. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyHardwareDRMFeatures")
@js.native
object PlayReadyHardwareDRMFeatures extends js.Object {
  /** Hardware DRM is supported on the machine. */
  @js.native
  sealed trait hardwareDRM
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.PlayReadyHardwareDRMFeatures
  
  /** Indicates the hardware supports High Efficiency Video Coding (HEVC)/H.265 codec. */
  @js.native
  sealed trait hevc
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.PlayReadyHardwareDRMFeatures
  
  val hardwareDRM: hardwareDRM with java.lang.String = js.native
  val hevc: hevc with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.PlayReadyHardwareDRMFeatures with java.lang.String
  ] = js.native
}

