package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICertificateEnrollmentManagerStatics extends js.Object {
  def createRequestAsync(request: CertificateRequestProperties): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String]
  def importPfxDataAsync(
    pfxData: java.lang.String,
    password: java.lang.String,
    exportable: ExportOption,
    keyProtectionLevel: KeyProtectionLevel,
    installOption: InstallOptions,
    friendlyName: java.lang.String
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction
  def installCertificateAsync(certificate: java.lang.String, installOption: InstallOptions): winrtLib.WindowsNs.FoundationNs.IAsyncAction
}

object ICertificateEnrollmentManagerStatics {
  @scala.inline
  def apply(
    createRequestAsync: js.Function1[
      CertificateRequestProperties, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String]
    ],
    importPfxDataAsync: js.Function6[
      java.lang.String, 
      java.lang.String, 
      ExportOption, 
      KeyProtectionLevel, 
      InstallOptions, 
      java.lang.String, 
      winrtLib.WindowsNs.FoundationNs.IAsyncAction
    ],
    installCertificateAsync: js.Function2[java.lang.String, InstallOptions, winrtLib.WindowsNs.FoundationNs.IAsyncAction]
  ): ICertificateEnrollmentManagerStatics = {
    val __obj = js.Dynamic.literal(createRequestAsync = createRequestAsync, importPfxDataAsync = importPfxDataAsync, installCertificateAsync = installCertificateAsync)
  
    __obj.asInstanceOf[ICertificateEnrollmentManagerStatics]
  }
}

