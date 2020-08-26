package typings.temp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AffixOptions extends js.Object {
  var dir: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var suffix: js.UndefOr[String] = js.native
}

object AffixOptions {
  @scala.inline
  def apply(): AffixOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AffixOptions]
  }
  @scala.inline
  implicit class AffixOptionsOps[Self <: AffixOptions] (val x: Self) extends AnyVal {
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
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
  }
  
}

