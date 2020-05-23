package typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning

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
  
}

