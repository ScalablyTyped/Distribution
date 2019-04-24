package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendFileOptions
  extends BaseOptions[js.Any, js.Any] {
   // 要追加内容的文件路径
  var data: java.lang.String | stdLib.ArrayBuffer
   // 要追加的文本或二进制数据
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var filePath: java.lang.String
}

object AppendFileOptions {
  @scala.inline
  def apply(
    data: java.lang.String | stdLib.ArrayBuffer,
    filePath: java.lang.String,
    complete: /* res */ js.Any => scala.Unit = null,
    encoding: java.lang.String = null,
    fail: js.Any => scala.Unit = null,
    success: js.Any => scala.Unit = null
  ): AppendFileOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], filePath = filePath)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[AppendFileOptions]
  }
}

