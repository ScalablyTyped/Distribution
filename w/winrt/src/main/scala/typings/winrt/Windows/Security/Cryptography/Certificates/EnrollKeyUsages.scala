package typings.winrt.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
