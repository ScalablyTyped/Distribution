package typings.winrtUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlayReadyHardwareDRMFeatures extends StObject
/** Indicates the valid list of hardware digital rights management (DRM) feature values that can be queried. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyHardwareDRMFeatures")
@js.native
object PlayReadyHardwareDRMFeatures extends StObject {
  
  /** Hardware DRM is supported on the machine. */
  @js.native
  sealed trait hardwareDRM
    extends StObject
       with PlayReadyHardwareDRMFeatures
  
  /** Indicates the hardware supports High Efficiency Video Coding (HEVC)/H.265 codec. */
  @js.native
  sealed trait hevc
    extends StObject
       with PlayReadyHardwareDRMFeatures
}
