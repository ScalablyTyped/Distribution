package typings.winrt.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KeyProtectionLevel extends js.Object
@JSGlobal("Windows.Security.Cryptography.Certificates.KeyProtectionLevel")
@js.native
object KeyProtectionLevel extends js.Object {
  
  @js.native
  sealed trait consentOnly extends KeyProtectionLevel
  
  @js.native
  sealed trait consentWithPassword extends KeyProtectionLevel
  
  @js.native
  sealed trait noConsent extends KeyProtectionLevel
}
