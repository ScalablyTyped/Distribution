package typings.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgnoreIfNotExists extends js.Object {
  var ignoreIfNotExists: js.UndefOr[Boolean] = js.native
  var recursive: js.UndefOr[Boolean] = js.native
}

object IgnoreIfNotExists {
  @scala.inline
  def apply(): IgnoreIfNotExists = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreIfNotExists]
  }
  @scala.inline
  implicit class IgnoreIfNotExistsOps[Self <: IgnoreIfNotExists] (val x: Self) extends AnyVal {
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

