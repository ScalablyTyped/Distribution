package typings.winrtUwp.global.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies certificate installation options. This enumeration type is used by the InstallCertificateAsync and ImportPfxDataAsync methods. */
@JSGlobal("Windows.Security.Cryptography.Certificates.InstallOptions")
@js.native
object InstallOptions extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Security.Cryptography.Certificates.InstallOptions with Double
  ] = js.native
  
  /* 1 */ val deleteExpired: typings.winrtUwp.Windows.Security.Cryptography.Certificates.InstallOptions.deleteExpired with Double = js.native
  
  /* 0 */ val none: typings.winrtUwp.Windows.Security.Cryptography.Certificates.InstallOptions.none with Double = js.native
}
