package typings.winrt.Windows.Security.Cryptography.Certificates

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
  
  /* 4 */ val all: typings.winrt.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.all with Double = js.native
  /* 1 */ val decryption: typings.winrt.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.decryption with Double = js.native
  /* 3 */ val keyAgreement: typings.winrt.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.keyAgreement with Double = js.native
  /* 0 */ val none: typings.winrt.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.none with Double = js.native
  /* 2 */ val signing: typings.winrt.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.signing with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnrollKeyUsages with Double] = js.native
}

