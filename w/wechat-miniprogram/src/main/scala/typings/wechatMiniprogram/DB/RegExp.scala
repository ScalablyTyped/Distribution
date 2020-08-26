package typings.wechatMiniprogram.DB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegExp extends js.Object {
  val options: String = js.native
  val regexp: String = js.native
}

object RegExp {
  @scala.inline
  def apply(options: String, regexp: String): RegExp = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExp]
  }
  @scala.inline
  implicit class RegExpOps[Self <: RegExp] (val x: Self) extends AnyVal {
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
    def setOptions(value: String): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegexp(value: String): Self = this.set("regexp", value.asInstanceOf[js.Any])
  }
  
}

