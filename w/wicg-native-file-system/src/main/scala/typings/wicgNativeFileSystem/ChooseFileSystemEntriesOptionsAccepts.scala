package typings.wicgNativeFileSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Old methods available on stable Chrome instead of the ones above.
@js.native
trait ChooseFileSystemEntriesOptionsAccepts extends js.Object {
  var description: js.UndefOr[String] = js.native
  var extensions: js.UndefOr[js.Array[String]] = js.native
  var mimeTypes: js.UndefOr[js.Array[String]] = js.native
}

object ChooseFileSystemEntriesOptionsAccepts {
  @scala.inline
  def apply(): ChooseFileSystemEntriesOptionsAccepts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseFileSystemEntriesOptionsAccepts]
  }
  @scala.inline
  implicit class ChooseFileSystemEntriesOptionsAcceptsOps[Self <: ChooseFileSystemEntriesOptionsAccepts] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setMimeTypesVarargs(value: String*): Self = this.set("mimeTypes", js.Array(value :_*))
    @scala.inline
    def setMimeTypes(value: js.Array[String]): Self = this.set("mimeTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeTypes: Self = this.set("mimeTypes", js.undefined)
  }
  
}

