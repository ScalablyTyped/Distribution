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
    createRequestAsync: CertificateRequestProperties => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String],
    importPfxDataAsync: (java.lang.String, java.lang.String, ExportOption, KeyProtectionLevel, InstallOptions, java.lang.String) => winrtLib.WindowsNs.FoundationNs.IAsyncAction,
    installCertificateAsync: (java.lang.String, InstallOptions) => winrtLib.WindowsNs.FoundationNs.IAsyncAction
  ): ICertificateEnrollmentManagerStatics = {
    val __obj = js.Dynamic.literal(createRequestAsync = js.Any.fromFunction1(createRequestAsync), importPfxDataAsync = js.Any.fromFunction6(importPfxDataAsync), installCertificateAsync = js.Any.fromFunction2(installCertificateAsync))
  
    __obj.asInstanceOf[ICertificateEnrollmentManagerStatics]
  }
}

