package typings.winrt.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Security.Cryptography.Certificates.KeyProtectionLevel.consentOnly
import typings.winrt.Windows.Security.Cryptography.Certificates.KeyProtectionLevel.consentWithPassword
import typings.winrt.Windows.Security.Cryptography.Certificates.KeyProtectionLevel.noConsent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeyProtectionLevel with Double] = js.native
  /* 1 */ @js.native
  object consentOnly extends TopLevel[consentOnly with Double]
  
  /* 2 */ @js.native
  object consentWithPassword extends TopLevel[consentWithPassword with Double]
  
  /* 0 */ @js.native
  object noConsent extends TopLevel[noConsent with Double]
  
}

