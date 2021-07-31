package typings.winrt.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KeySize extends StObject
@JSGlobal("Windows.Security.Cryptography.Certificates.KeySize")
@js.native
object KeySize extends StObject {
  
  @js.native
  sealed trait invalid
    extends StObject
       with KeySize
  
  @js.native
  sealed trait rsa2048
    extends StObject
       with KeySize
  
  @js.native
  sealed trait rsa4096
    extends StObject
       with KeySize
}
