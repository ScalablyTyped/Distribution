package typings.wxDashServerDashSdk.wxDashServerDashSdkMod

import typings.wxDashServerDashSdk.wxDashServerDashSdkStrings.i
import typings.wxDashServerDashSdk.wxDashServerDashSdkStrings.m
import typings.wxDashServerDashSdk.wxDashServerDashSdkStrings.s
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExpOptions extends js.Object {
   // 正则表达式，字符串形式
  var options: i | m | s
  var regexp: String
}

object RegExpOptions {
  @scala.inline
  def apply(options: i | m | s, regexp: String): RegExpOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], regexp = regexp)
  
    __obj.asInstanceOf[RegExpOptions]
  }
}

