package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs

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
  sealed trait notEvaluated
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasEncryptionProviderType
  
  /** The encryption provider is a non-Windows provider. */
  @js.native
  sealed trait otherEncryption
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasEncryptionProviderType
  
  /** The encryption provider is a Windows provider. */
  @js.native
  sealed trait windowsEncryption
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasEncryptionProviderType
  
  val notEvaluated: notEvaluated with java.lang.String = js.native
  val otherEncryption: otherEncryption with java.lang.String = js.native
  val windowsEncryption: windowsEncryption with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasEncryptionProviderType with java.lang.String
  ] = js.native
}

