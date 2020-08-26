package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages PlayReady-ND storage files. */
@js.native
trait NDStorageFileHelper extends js.Object {
  /**
    * Gets transmitter settings from the URLs associated with a StorageFile object if the URLs contain PlayReady-ND metadata.
    * @param file A storage file object that a media server has discovered.
    * @return The transmitter settings found in the storage file.
    */
  def getFileURLs(file: IStorageFile): IVector[String] = js.native
}

object NDStorageFileHelper {
  @scala.inline
  def apply(getFileURLs: IStorageFile => IVector[String]): NDStorageFileHelper = {
    val __obj = js.Dynamic.literal(getFileURLs = js.Any.fromFunction1(getFileURLs))
    __obj.asInstanceOf[NDStorageFileHelper]
  }
  @scala.inline
  implicit class NDStorageFileHelperOps[Self <: NDStorageFileHelper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetFileURLs(value: IStorageFile => IVector[String]): Self = this.set("getFileURLs", js.Any.fromFunction1(value))
  }
  
}

