package typings.tmp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TmpNameOptions extends js.Object {
  var dir: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var postfix: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var template: js.UndefOr[String] = js.native
  var tmpdir: js.UndefOr[String] = js.native
  var tries: js.UndefOr[Double] = js.native
}

object TmpNameOptions {
  @scala.inline
  def apply(): TmpNameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TmpNameOptions]
  }
  @scala.inline
  implicit class TmpNameOptionsOps[Self <: TmpNameOptions] (val x: Self) extends AnyVal {
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
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPostfix(value: String): Self = this.set("postfix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostfix: Self = this.set("postfix", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTmpdir(value: String): Self = this.set("tmpdir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTmpdir: Self = this.set("tmpdir", js.undefined)
    @scala.inline
    def setTries(value: Double): Self = this.set("tries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTries: Self = this.set("tries", js.undefined)
  }
  
}

