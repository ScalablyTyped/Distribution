package typings.winrt.Windows.Storage.Provider

import typings.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICachedFileUpdaterStatics extends js.Object {
  def setUpdateInformation(
    file: IStorageFile,
    contentId: String,
    readMode: ReadActivationMode,
    writeMode: WriteActivationMode,
    options: CachedFileOptions
  ): Unit
}

object ICachedFileUpdaterStatics {
  @scala.inline
  def apply(
    setUpdateInformation: (IStorageFile, String, ReadActivationMode, WriteActivationMode, CachedFileOptions) => Unit
  ): ICachedFileUpdaterStatics = {
    val __obj = js.Dynamic.literal(setUpdateInformation = js.Any.fromFunction5(setUpdateInformation))
    __obj.asInstanceOf[ICachedFileUpdaterStatics]
  }
}

