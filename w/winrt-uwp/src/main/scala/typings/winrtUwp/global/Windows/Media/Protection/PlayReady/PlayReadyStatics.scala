package typings.winrtUwp.global.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides support for returning static or constant data. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyStatics")
@js.native
abstract class PlayReadyStatics ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyStatics
object PlayReadyStatics {
  
  @JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyStatics")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Queries whether the specified hardware digital rights management (DRM) feature is supported on the system.
    * @param hwdrmFeature The hardware DRM feature to query.
    * @return true if the hardware DRM feature is supported, otherwise false.
    */
  /* static member */
  inline def checkSupportedHardware(hwdrmFeature: typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyHardwareDRMFeatures): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkSupportedHardware")(hwdrmFeature.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** Gets the type of a PlayReady domain join service request. */
  /* static member */
  @JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyStatics.domainJoinServiceRequestType")
  @js.native
  def domainJoinServiceRequestType: String = js.native
  inline def domainJoinServiceRequestType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domainJoinServiceRequestType")(x.asInstanceOf[js.Any])
  
  /** Gets the type of a PlayReady domain leave service request. */
  /* static member */
  @JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyStatics.domainLeaveServiceRequestType")
  @js.native
  def domainLeaveServiceRequestType: String = js.native
  inline def domainLeaveServiceRequestType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domainLeaveServiceRequestType")(x.asInstanceOf[js.Any])
  
  /** Gets the type of a PlayReady individualization service request. */
  /* static member */
  @JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyStatics.individualizationServiceRequestType")
  @js.native
  def individualizationServiceRequestType: String = js.native
  inline def individualizationServiceRequestType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("individualizationServiceRequestType")(x.asInstanceOf[js.Any])
  
  /** Gets the type of a PlayReady license acquisition service request. */
  /* static member */
  @JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyStatics.licenseAcquirerServiceRequestType")
  @js.native
  def licenseAcquirerServiceRequestType: String = js.native
  inline def licenseAcquirerServiceRequestType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("licenseAcquirerServiceRequestType")(x.asInstanceOf[js.Any])
  
  /** Gets the PlayReady media protection system identifier. */
  /* static member */
  @JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyStatics.mediaProtectionSystemId")
  @js.native
  def mediaProtectionSystemId: String = js.native
  inline def mediaProtectionSystemId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mediaProtectionSystemId")(x.asInstanceOf[js.Any])
  
  /** Gets the type of a PlayReady metering service request. */
  /* static member */
  @JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyStatics.meteringReportServiceRequestType")
  @js.native
  def meteringReportServiceRequestType: String = js.native
  inline def meteringReportServiceRequestType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("meteringReportServiceRequestType")(x.asInstanceOf[js.Any])
  
  /** Gets the current certificate security level. */
  /* static member */
  @JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyStatics.playReadyCertificateSecurityLevel")
  @js.native
  def playReadyCertificateSecurityLevel: Double = js.native
  inline def playReadyCertificateSecurityLevel_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("playReadyCertificateSecurityLevel")(x.asInstanceOf[js.Any])
  
  /** Gets the PlayReady runtime security version. */
  /* static member */
  @JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyStatics.playReadySecurityVersion")
  @js.native
  def playReadySecurityVersion: Double = js.native
  inline def playReadySecurityVersion_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("playReadySecurityVersion")(x.asInstanceOf[js.Any])
  
  /** Gets the type of a PlayReady revocation service request. */
  /* static member */
  @JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyStatics.revocationServiceRequestType")
  @js.native
  def revocationServiceRequestType: String = js.native
  inline def revocationServiceRequestType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("revocationServiceRequestType")(x.asInstanceOf[js.Any])
  
  /** Gets the type of a PlayReady secure stop service request. */
  /* static member */
  @JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyStatics.secureStopServiceRequestType")
  @js.native
  def secureStopServiceRequestType: String = js.native
  inline def secureStopServiceRequestType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secureStopServiceRequestType")(x.asInstanceOf[js.Any])
}
