package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents PFX import parameters. */
trait PfxImportParameters extends js.Object {
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
  @scala.inline
  def apply(
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
}

