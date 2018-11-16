package typings
package winrtLib.WindowsNs.StorageNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Provider.CachedFileUpdater")
@js.native
class CachedFileUpdater () extends js.Object

@JSGlobal("Windows.Storage.Provider.CachedFileUpdater")
@js.native
object CachedFileUpdater extends js.Object {
  def setUpdateInformation(
    file: winrtLib.WindowsNs.StorageNs.IStorageFile,
    contentId: java.lang.String,
    readMode: winrtLib.WindowsNs.StorageNs.ProviderNs.ReadActivationMode,
    writeMode: winrtLib.WindowsNs.StorageNs.ProviderNs.WriteActivationMode,
    options: winrtLib.WindowsNs.StorageNs.ProviderNs.CachedFileOptions
  ): scala.Unit = js.native
}

