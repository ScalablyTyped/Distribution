package typings.winrt.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeySize extends js.Object

@JSGlobal("Windows.Security.Cryptography.Certificates.KeySize")
@js.native
object KeySize extends js.Object {
  @js.native
  sealed trait invalid extends KeySize
  
  @js.native
  sealed trait rsa2048 extends KeySize
  
  @js.native
  sealed trait rsa4096 extends KeySize
  
}

