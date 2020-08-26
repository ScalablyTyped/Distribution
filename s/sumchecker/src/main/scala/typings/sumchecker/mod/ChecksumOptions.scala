package typings.sumchecker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChecksumOptions extends js.Object {
  var defaultTextEncoding: js.UndefOr[String] = js.native
}

object ChecksumOptions {
  @scala.inline
  def apply(): ChecksumOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChecksumOptions]
  }
  @scala.inline
  implicit class ChecksumOptionsOps[Self <: ChecksumOptions] (val x: Self) extends AnyVal {
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
    def setDefaultTextEncoding(value: String): Self = this.set("defaultTextEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTextEncoding: Self = this.set("defaultTextEncoding", js.undefined)
  }
  
}

