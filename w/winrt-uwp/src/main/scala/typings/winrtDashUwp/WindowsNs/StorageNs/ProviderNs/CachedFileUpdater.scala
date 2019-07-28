package typings.winrtDashUwp.WindowsNs.StorageNs.ProviderNs

import typings.winrtDashUwp.WindowsNs.StorageNs.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages files so that they can be updated in real-time by an app that participates in the Cached File Updater contract. */
@JSGlobal("Windows.Storage.Provider.CachedFileUpdater")
@js.native
abstract class CachedFileUpdater () extends js.Object

/* static members */
@JSGlobal("Windows.Storage.Provider.CachedFileUpdater")
@js.native
object CachedFileUpdater extends js.Object {
  /**
    * Configures update policies for a local file.
    * @param file The local file.
    * @param contentId A unique identifier for the local file.
    * @param readMode A value that specifies whether Windows will request updates before the local file is read by other apps.
    * @param writeMode A value that specifies whether other apps can write to the local file and, if so, whether Windows will request updates after the local file is written.
    * @param options A value that specifies additional circumstances and behaviors for when Windows requests updates.
    */
  def setUpdateInformation(
    file: IStorageFile,
    contentId: String,
    readMode: ReadActivationMode,
    writeMode: WriteActivationMode,
    options: CachedFileOptions
  ): Unit = js.native
}

