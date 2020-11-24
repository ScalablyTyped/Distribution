package typings.winrtUwp.global.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies whether a private key can be exported. This enumeration type is used in the Exportable property of a CertificateRequestProperties object. */
@JSGlobal("Windows.Security.Cryptography.Certificates.ExportOption")
@js.native
object ExportOption extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Security.Cryptography.Certificates.ExportOption with Double
  ] = js.native
  
  /* 1 */ val exportable: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ExportOption.exportable with Double = js.native
  
  /* 0 */ val notExportable: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ExportOption.notExportable with Double = js.native
}
