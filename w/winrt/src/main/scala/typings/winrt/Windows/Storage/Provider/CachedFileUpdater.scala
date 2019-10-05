package typings.winrt.Windows.Storage.Provider

import typings.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Provider.CachedFileUpdater")
@js.native
class CachedFileUpdater () extends js.Object

/* static members */
@JSGlobal("Windows.Storage.Provider.CachedFileUpdater")
@js.native
object CachedFileUpdater extends js.Object {
  def setUpdateInformation(
    file: IStorageFile,
    contentId: String,
    readMode: ReadActivationMode,
    writeMode: WriteActivationMode,
    options: CachedFileOptions
  ): Unit = js.native
}

