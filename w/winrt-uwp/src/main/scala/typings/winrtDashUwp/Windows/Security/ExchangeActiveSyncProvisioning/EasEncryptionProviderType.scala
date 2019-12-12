package typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasEncryptionProviderType.notEvaluated
import typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasEncryptionProviderType.otherEncryption
import typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasEncryptionProviderType.windowsEncryption
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasEncryptionProviderType with Double] = js.native
  /* 0 */ @js.native
  object notEvaluated extends TopLevel[notEvaluated with Double]
  
  /* 2 */ @js.native
  object otherEncryption extends TopLevel[otherEncryption with Double]
  
  /* 1 */ @js.native
  object windowsEncryption extends TopLevel[windowsEncryption with Double]
  
}

