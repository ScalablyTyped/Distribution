package typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICertificateEnrollmentManagerStatics extends js.Object {
  def createRequestAsync(request: CertificateRequestProperties): IAsyncOperation[String]
  def importPfxDataAsync(
    pfxData: String,
    password: String,
    exportable: ExportOption,
    keyProtectionLevel: KeyProtectionLevel,
    installOption: InstallOptions,
    friendlyName: String
  ): IAsyncAction
  def installCertificateAsync(certificate: String, installOption: InstallOptions): IAsyncAction
}

object ICertificateEnrollmentManagerStatics {
  @scala.inline
  def apply(
    createRequestAsync: CertificateRequestProperties => IAsyncOperation[String],
    importPfxDataAsync: (String, String, ExportOption, KeyProtectionLevel, InstallOptions, String) => IAsyncAction,
    installCertificateAsync: (String, InstallOptions) => IAsyncAction
  ): ICertificateEnrollmentManagerStatics = {
    val __obj = js.Dynamic.literal(createRequestAsync = js.Any.fromFunction1(createRequestAsync), importPfxDataAsync = js.Any.fromFunction6(importPfxDataAsync), installCertificateAsync = js.Any.fromFunction2(installCertificateAsync))
  
    __obj.asInstanceOf[ICertificateEnrollmentManagerStatics]
  }
}

