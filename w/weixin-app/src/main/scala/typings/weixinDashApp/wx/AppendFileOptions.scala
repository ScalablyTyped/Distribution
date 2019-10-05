package typings.weixinDashApp.wx

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendFileOptions
  extends BaseOptions[js.Any, js.Any] {
   // 要追加内容的文件路径
  var data: String | ArrayBuffer
   // 要追加的文本或二进制数据
  var encoding: js.UndefOr[String] = js.undefined
  var filePath: String
}

object AppendFileOptions {
  @scala.inline
  def apply(
    data: String | ArrayBuffer,
    filePath: String,
    complete: /* res */ js.Any => Unit = null,
    encoding: String = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): AppendFileOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], filePath = filePath)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[AppendFileOptions]
  }
}

