package typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EasEncryptionProviderType extends js.Object

/** Describes the type of Exchange ActiveSync encryption provider. */
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasEncryptionProviderType")
@js.native
object EasEncryptionProviderType extends js.Object {
  /** The encryption provider type has not yet been determined. */
  @js.native
  sealed trait notEvaluated extends EasEncryptionProviderType
  
  /** The encryption provider is a non-Windows provider. */
  @js.native
  sealed trait otherEncryption extends EasEncryptionProviderType
  
  /** The encryption provider is a Windows provider. */
  @js.native
  sealed trait windowsEncryption extends EasEncryptionProviderType
  
  /* 0 */ val notEvaluated: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasEncryptionProviderType.notEvaluated with Double = js.native
  /* 2 */ val otherEncryption: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasEncryptionProviderType.otherEncryption with Double = js.native
  /* 1 */ val windowsEncryption: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasEncryptionProviderType.windowsEncryption with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasEncryptionProviderType with Double] = js.native
}

