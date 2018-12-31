package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides support for returning static or constant data. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyStatics")
@js.native
abstract class PlayReadyStatics () extends js.Object

/** Provides support for returning static or constant data. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyStatics")
@js.native
object PlayReadyStatics extends js.Object {
  /** Gets the type of a PlayReady domain join service request. */
  var domainJoinServiceRequestType: java.lang.String = js.native
  /** Gets the type of a PlayReady domain leave service request. */
  var domainLeaveServiceRequestType: java.lang.String = js.native
  /** Gets the type of a PlayReady individualization service request. */
  var individualizationServiceRequestType: java.lang.String = js.native
  /** Gets the type of a PlayReady license acquisition service request. */
  var licenseAcquirerServiceRequestType: java.lang.String = js.native
  /** Gets the PlayReady media protection system identifier. */
  var mediaProtectionSystemId: java.lang.String = js.native
  /** Gets the type of a PlayReady metering service request. */
  var meteringReportServiceRequestType: java.lang.String = js.native
  /** Gets the current certificate security level. */
  var playReadyCertificateSecurityLevel: scala.Double = js.native
  /** Gets the PlayReady runtime security version. */
  var playReadySecurityVersion: scala.Double = js.native
  /** Gets the type of a PlayReady revocation service request. */
  var revocationServiceRequestType: java.lang.String = js.native
  /** Gets the type of a PlayReady secure stop service request. */
  var secureStopServiceRequestType: java.lang.String = js.native
  /**
    * Queries whether the specified hardware digital rights management (DRM) feature is supported on the system.
    * @param hwdrmFeature The hardware DRM feature to query.
    * @return true if the hardware DRM feature is supported, otherwise false.
    */
  def checkSupportedHardware(
    hwdrmFeature: winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.PlayReadyHardwareDRMFeatures
  ): scala.Boolean = js.native
}

