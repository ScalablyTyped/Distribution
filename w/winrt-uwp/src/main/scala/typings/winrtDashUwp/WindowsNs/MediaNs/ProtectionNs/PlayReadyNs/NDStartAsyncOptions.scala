package typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NDStartAsyncOptions extends js.Object

/** Indicates the asynchronous start options. This enumeration is a bitwise OR and is used by the StartAsync method. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDStartAsyncOptions")
@js.native
object NDStartAsyncOptions extends js.Object {
  /** If set, the transmitter's certificate will be presented to the caller through a RegistrationCompleted event for verification. The caller should set a flag to accept or reject it. If not set, RegistrationCompleted will not contain the certificate. */
  @js.native
  sealed trait mutualAuthentication extends NDStartAsyncOptions
  
  /** If set and the LicenseFetchDescriptor parameter is null for StartAsync , then StartAsync will wait for OnContentIDReceived from either NDDownloadEngineNotifier or NDStreamParserNotifier . After OnContententIDReceived, the received LicenseFetchDescriptor is used to perform the license fetch. If not set and the LicenseFetchDescriptor parameter is null for StartAsync, then StartAsync assumes you already acquired the license beforehand and will not do a license fetch. Note that if LicenseFetchDescriptor is not null, this flag is ignored and a license fetch will be performed. */
  @js.native
  sealed trait waitForLicenseDescriptor extends NDStartAsyncOptions
  
  /* 0 */ val mutualAuthentication: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDStartAsyncOptions.mutualAuthentication with Double = js.native
  /* 1 */ val waitForLicenseDescriptor: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDStartAsyncOptions.waitForLicenseDescriptor with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NDStartAsyncOptions with Double] = js.native
}

