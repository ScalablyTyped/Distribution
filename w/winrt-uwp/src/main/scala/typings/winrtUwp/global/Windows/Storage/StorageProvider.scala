package typings.winrtUwp.global.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains info about the service that stores files and folders. Files and folders may be stored either by the local file system or by a remote service like Microsoft OneDrive. */
@JSGlobal("Windows.Storage.StorageProvider")
@js.native
abstract class StorageProvider ()
  extends typings.winrtUwp.Windows.Storage.StorageProvider {
  /** Gets a user-friendly name for the current provider of files and folders. */
  /* CompleteClass */
  override var displayName: String = js.native
  /** Gets an identifier for the current provider of files and folders. */
  /* CompleteClass */
  override var id: String = js.native
}

