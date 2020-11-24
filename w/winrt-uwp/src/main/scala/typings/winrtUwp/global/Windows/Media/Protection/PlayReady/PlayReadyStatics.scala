package typings.winrtUwp.global.Windows.Media.Protection.PlayReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides support for returning static or constant data. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyStatics")
@js.native
abstract class PlayReadyStatics ()
  extends typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyStatics
/* static members */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyStatics")
@js.native
object PlayReadyStatics extends js.Object {
  
  /**
    * Queries whether the specified hardware digital rights management (DRM) feature is supported on the system.
    * @param hwdrmFeature The hardware DRM feature to query.
    * @return true if the hardware DRM feature is supported, otherwise false.
    */
  def checkSupportedHardware(hwdrmFeature: typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyHardwareDRMFeatures): Boolean = js.native
  
  /** Gets the type of a PlayReady domain join service request. */
  var domainJoinServiceRequestType: String = js.native
  
  /** Gets the type of a PlayReady domain leave service request. */
  var domainLeaveServiceRequestType: String = js.native
  
  /** Gets the type of a PlayReady individualization service request. */
  var individualizationServiceRequestType: String = js.native
  
  /** Gets the type of a PlayReady license acquisition service request. */
  var licenseAcquirerServiceRequestType: String = js.native
  
  /** Gets the PlayReady media protection system identifier. */
  var mediaProtectionSystemId: String = js.native
  
  /** Gets the type of a PlayReady metering service request. */
  var meteringReportServiceRequestType: String = js.native
  
  /** Gets the current certificate security level. */
  var playReadyCertificateSecurityLevel: Double = js.native
  
  /** Gets the PlayReady runtime security version. */
  var playReadySecurityVersion: Double = js.native
  
  /** Gets the type of a PlayReady revocation service request. */
  var revocationServiceRequestType: String = js.native
  
  /** Gets the type of a PlayReady secure stop service request. */
  var secureStopServiceRequestType: String = js.native
}
