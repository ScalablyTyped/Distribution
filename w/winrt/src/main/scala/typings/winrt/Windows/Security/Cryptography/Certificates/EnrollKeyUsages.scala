package typings.winrt.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnrollKeyUsages extends js.Object

@JSGlobal("Windows.Security.Cryptography.Certificates.EnrollKeyUsages")
@js.native
object EnrollKeyUsages extends js.Object {
  @js.native
  sealed trait all extends EnrollKeyUsages
  
  @js.native
  sealed trait decryption extends EnrollKeyUsages
  
  @js.native
  sealed trait keyAgreement extends EnrollKeyUsages
  
  @js.native
  sealed trait none extends EnrollKeyUsages
  
  @js.native
  sealed trait signing extends EnrollKeyUsages
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnrollKeyUsages with Double] = js.native
  /* 4 */ @js.native
  object all extends TopLevel[all with Double]
  
  /* 1 */ @js.native
  object decryption extends TopLevel[decryption with Double]
  
  /* 3 */ @js.native
  object keyAgreement extends TopLevel[keyAgreement with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object signing extends TopLevel[signing with Double]
  
}

