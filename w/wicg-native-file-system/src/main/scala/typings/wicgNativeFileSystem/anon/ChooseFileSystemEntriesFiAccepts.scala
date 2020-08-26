package typings.wicgNativeFileSystem.anon

import typings.wicgNativeFileSystem.ChooseFileSystemEntriesOptionsAccepts
import typings.wicgNativeFileSystem.wicgNativeFileSystemBooleans.`true`
import typings.wicgNativeFileSystem.wicgNativeFileSystemStrings.`open-file`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined wicg-native-file-system.ChooseFileSystemEntriesFileOptions & {  type :'open-file' | undefined,   multiple :true} */
@js.native
trait ChooseFileSystemEntriesFiAccepts extends js.Object {
  var accepts: js.UndefOr[js.Array[ChooseFileSystemEntriesOptionsAccepts]] = js.native
  var excludeAcceptAllOption: js.UndefOr[Boolean] = js.native
  var multiple: `true` = js.native
  var `type`: js.UndefOr[`open-file`] = js.native
}

object ChooseFileSystemEntriesFiAccepts {
  @scala.inline
  def apply(multiple: `true`): ChooseFileSystemEntriesFiAccepts = {
    val __obj = js.Dynamic.literal(multiple = multiple.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseFileSystemEntriesFiAccepts]
  }
  @scala.inline
  implicit class ChooseFileSystemEntriesFiAcceptsOps[Self <: ChooseFileSystemEntriesFiAccepts] (val x: Self) extends AnyVal {
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
    def setMultiple(value: `true`): Self = this.set("multiple", value.asInstanceOf[js.Any])
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
    @scala.inline
    def setType(value: `open-file`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

