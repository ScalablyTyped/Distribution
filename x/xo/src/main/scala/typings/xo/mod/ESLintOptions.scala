package typings.xo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined xo.xo.Pick<eslint.eslint.Linter.LintOptions, 'filename'> */
@js.native
trait ESLintOptions extends js.Object {
  var filename: js.UndefOr[String] = js.native
}

object ESLintOptions {
  @scala.inline
  def apply(): ESLintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ESLintOptions]
  }
  @scala.inline
  implicit class ESLintOptionsOps[Self <: ESLintOptions] (val x: Self) extends AnyVal {
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
  }
  
}

