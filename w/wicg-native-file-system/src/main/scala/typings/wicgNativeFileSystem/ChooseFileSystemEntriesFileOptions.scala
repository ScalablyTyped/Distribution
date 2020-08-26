package typings.wicgNativeFileSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooseFileSystemEntriesFileOptions extends js.Object {
  var accepts: js.UndefOr[js.Array[ChooseFileSystemEntriesOptionsAccepts]] = js.native
  var excludeAcceptAllOption: js.UndefOr[Boolean] = js.native
}

object ChooseFileSystemEntriesFileOptions {
  @scala.inline
  def apply(): ChooseFileSystemEntriesFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseFileSystemEntriesFileOptions]
  }
  @scala.inline
  implicit class ChooseFileSystemEntriesFileOptionsOps[Self <: ChooseFileSystemEntriesFileOptions] (val x: Self) extends AnyVal {
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
    def setAcceptsVarargs(value: ChooseFileSystemEntriesOptionsAccepts*): Self = this.set("accepts", js.Array(value :_*))
    @scala.inline
    def setAccepts(value: js.Array[ChooseFileSystemEntriesOptionsAccepts]): Self = this.set("accepts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccepts: Self = this.set("accepts", js.undefined)
    @scala.inline
    def setExcludeAcceptAllOption(value: Boolean): Self = this.set("excludeAcceptAllOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeAcceptAllOption: Self = this.set("excludeAcceptAllOption", js.undefined)
  }
  
}

