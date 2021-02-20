package typings.winrt.Windows.Security.Cryptography.Certificates

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICertificateEnrollmentManagerStatics extends StObject {
  
  def createRequestAsync(request: CertificateRequestProperties): IAsyncOperation[String] = js.native
  
  def importPfxDataAsync(
    pfxData: String,
    password: String,
    exportable: ExportOption,
    keyProtectionLevel: KeyProtectionLevel,
    installOption: InstallOptions,
    friendlyName: String
  ): IAsyncAction = js.native
  
  def installCertificateAsync(certificate: String, installOption: InstallOptions): IAsyncAction = js.native
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
  
  @scala.inline
  implicit class ICertificateEnrollmentManagerStaticsMutableBuilder[Self <: ICertificateEnrollmentManagerStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateRequestAsync(value: CertificateRequestProperties => IAsyncOperation[String]): Self = StObject.set(x, "createRequestAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setImportPfxDataAsync(value: (String, String, ExportOption, KeyProtectionLevel, InstallOptions, String) => IAsyncAction): Self = StObject.set(x, "importPfxDataAsync", js.Any.fromFunction6(value))
    
    @scala.inline
    def setInstallCertificateAsync(value: (String, InstallOptions) => IAsyncAction): Self = StObject.set(x, "installCertificateAsync", js.Any.fromFunction2(value))
  }
}
