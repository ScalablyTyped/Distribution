package typings.winrt.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Security.Cryptography.Certificates.KeySize.invalid
import typings.winrt.Windows.Security.Cryptography.Certificates.KeySize.rsa2048
import typings.winrt.Windows.Security.Cryptography.Certificates.KeySize.rsa4096
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeySize with Double] = js.native
  /* 0 */ @js.native
  object invalid extends TopLevel[invalid with Double]
  
  /* 1 */ @js.native
  object rsa2048 extends TopLevel[rsa2048 with Double]
  
  /* 2 */ @js.native
  object rsa4096 extends TopLevel[rsa4096 with Double]
  
}

