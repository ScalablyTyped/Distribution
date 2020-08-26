package typings.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFileOptions extends js.Object {
  /**
    * Ignore the operation if the file doesn't exist.
    */
  var ignoreIfNotExists: js.UndefOr[Boolean] = js.native
  /**
    * Delete the content recursively if a folder is denoted.
    */
  var recursive: js.UndefOr[Boolean] = js.native
}

object DeleteFileOptions {
  @scala.inline
  def apply(): DeleteFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFileOptions]
  }
  @scala.inline
  implicit class DeleteFileOptionsOps[Self <: DeleteFileOptions] (val x: Self) extends AnyVal {
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
    def setIgnoreIfNotExists(value: Boolean): Self = this.set("ignoreIfNotExists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreIfNotExists: Self = this.set("ignoreIfNotExists", js.undefined)
    @scala.inline
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
  }
  
}

