package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents PFX import parameters. */
trait PfxImportParameters extends StObject {
  
  /** Gets or sets the container name prefix. */
  var containerNamePrefix: String
  
  /** Gets or sets the export option. */
  var exportable: ExportOption
  
  /** Gets or sets the friendly name. */
  var friendlyName: String
  
  /** Gets or sets the install options. */
  var installOptions: InstallOptions
  
  /** Gets or sets the key protection level. */
  var keyProtectionLevel: KeyProtectionLevel
  
  /** Gets or sets the key storage provider name. */
  var keyStorageProviderName: String
  
  /** Gets or sets the reader name. */
  var readerName: String
}
object PfxImportParameters {
  
  inline def apply(
    containerNamePrefix: String,
    exportable: ExportOption,
    friendlyName: String,
    installOptions: InstallOptions,
    keyProtectionLevel: KeyProtectionLevel,
    keyStorageProviderName: String,
    readerName: String
  ): PfxImportParameters = {
    val __obj = js.Dynamic.literal(containerNamePrefix = containerNamePrefix.asInstanceOf[js.Any], exportable = exportable.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], installOptions = installOptions.asInstanceOf[js.Any], keyProtectionLevel = keyProtectionLevel.asInstanceOf[js.Any], keyStorageProviderName = keyStorageProviderName.asInstanceOf[js.Any], readerName = readerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PfxImportParameters]
  }
  
  extension [Self <: PfxImportParameters](x: Self) {
    
    inline def setContainerNamePrefix(value: String): Self = StObject.set(x, "containerNamePrefix", value.asInstanceOf[js.Any])
    
    inline def setExportable(value: ExportOption): Self = StObject.set(x, "exportable", value.asInstanceOf[js.Any])
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setInstallOptions(value: InstallOptions): Self = StObject.set(x, "installOptions", value.asInstanceOf[js.Any])
    
    inline def setKeyProtectionLevel(value: KeyProtectionLevel): Self = StObject.set(x, "keyProtectionLevel", value.asInstanceOf[js.Any])
    
    inline def setKeyStorageProviderName(value: String): Self = StObject.set(x, "keyStorageProviderName", value.asInstanceOf[js.Any])
    
    inline def setReaderName(value: String): Self = StObject.set(x, "readerName", value.asInstanceOf[js.Any])
  }
}
