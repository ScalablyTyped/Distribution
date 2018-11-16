package typings
package winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages files so that they can be updated in real-time by an app that participates in the Cached File Updater contract. */
@JSGlobal("Windows.Storage.Provider.CachedFileUpdater")
@js.native
abstract class CachedFileUpdater () extends js.Object

/** Manages files so that they can be updated in real-time by an app that participates in the Cached File Updater contract. */
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
    file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile,
    contentId: java.lang.String,
    readMode: winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs.ReadActivationMode,
    writeMode: winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs.WriteActivationMode,
    options: winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs.CachedFileOptions
  ): scala.Unit = js.native
}

