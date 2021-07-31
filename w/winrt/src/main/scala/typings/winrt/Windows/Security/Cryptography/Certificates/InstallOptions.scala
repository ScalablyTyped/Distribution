package typings.winrt.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InstallOptions extends StObject
@JSGlobal("Windows.Security.Cryptography.Certificates.InstallOptions")
@js.native
object InstallOptions extends StObject {
  
  @js.native
  sealed trait deleteExpired
    extends StObject
       with InstallOptions
  
  @js.native
  sealed trait none
    extends StObject
       with InstallOptions
}
