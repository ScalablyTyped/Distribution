package typings.winrtDashUwp.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents PFX import parameters. */
@JSGlobal("Windows.Security.Cryptography.Certificates.PfxImportParameters")
@js.native
/** Creates a new instance of the PfxImportParameters class. */
class PfxImportParameters () extends js.Object {
  /** Gets or sets the container name prefix. */
  var containerNamePrefix: String = js.native
  /** Gets or sets the export option. */
  var exportable: ExportOption = js.native
  /** Gets or sets the friendly name. */
  var friendlyName: String = js.native
  /** Gets or sets the install options. */
  var installOptions: InstallOptions = js.native
  /** Gets or sets the key protection level. */
  var keyProtectionLevel: KeyProtectionLevel = js.native
  /** Gets or sets the key storage provider name. */
  var keyStorageProviderName: String = js.native
  /** Gets or sets the reader name. */
  var readerName: String = js.native
}

