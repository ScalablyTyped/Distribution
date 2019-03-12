package typings
package winrtLib.WindowsNs.StorageNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICachedFileUpdaterStatics extends js.Object {
  def setUpdateInformation(
    file: winrtLib.WindowsNs.StorageNs.IStorageFile,
    contentId: java.lang.String,
    readMode: ReadActivationMode,
    writeMode: WriteActivationMode,
    options: CachedFileOptions
  ): scala.Unit
}

object ICachedFileUpdaterStatics {
  @scala.inline
  def apply(
    setUpdateInformation: (winrtLib.WindowsNs.StorageNs.IStorageFile, java.lang.String, ReadActivationMode, WriteActivationMode, CachedFileOptions) => scala.Unit
  ): ICachedFileUpdaterStatics = {
    val __obj = js.Dynamic.literal(setUpdateInformation = js.Any.fromFunction5(setUpdateInformation))
  
    __obj.asInstanceOf[ICachedFileUpdaterStatics]
  }
}

