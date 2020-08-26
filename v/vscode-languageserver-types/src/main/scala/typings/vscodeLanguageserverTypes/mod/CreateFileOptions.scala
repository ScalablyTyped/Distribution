package typings.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFileOptions extends js.Object {
  /**
    * Ignore if exists.
    */
  var ignoreIfExists: js.UndefOr[Boolean] = js.native
  /**
    * Overwrite existing file. Overwrite wins over `ignoreIfExists`
    */
  var overwrite: js.UndefOr[Boolean] = js.native
}

object CreateFileOptions {
  @scala.inline
  def apply(): CreateFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFileOptions]
  }
  @scala.inline
  implicit class CreateFileOptionsOps[Self <: CreateFileOptions] (val x: Self) extends AnyVal {
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
    def setIgnoreIfExists(value: Boolean): Self = this.set("ignoreIfExists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreIfExists: Self = this.set("ignoreIfExists", js.undefined)
    @scala.inline
    def setOverwrite(value: Boolean): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
  }
  
}

