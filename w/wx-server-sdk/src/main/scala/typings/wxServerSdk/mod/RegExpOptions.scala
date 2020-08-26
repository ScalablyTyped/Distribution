package typings.wxServerSdk.mod

import typings.wxServerSdk.wxServerSdkStrings.i
import typings.wxServerSdk.wxServerSdkStrings.m
import typings.wxServerSdk.wxServerSdkStrings.s
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegExpOptions extends js.Object {
   // 正则表达式，字符串形式
  var options: i | m | s = js.native
  var regexp: String = js.native
}

object RegExpOptions {
  @scala.inline
  def apply(options: i | m | s, regexp: String): RegExpOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExpOptions]
  }
  @scala.inline
  implicit class RegExpOptionsOps[Self <: RegExpOptions] (val x: Self) extends AnyVal {
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
    def setOptions(value: i | m | s): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegexp(value: String): Self = this.set("regexp", value.asInstanceOf[js.Any])
  }
  
}

