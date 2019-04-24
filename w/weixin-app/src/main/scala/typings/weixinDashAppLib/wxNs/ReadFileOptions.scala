package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadFileOptions
  extends BaseOptions[js.Any, js.Any] {
   // 要读取的文件的路径
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var filePath: java.lang.String
   // 指定读取文件的字符编码，如果不传 encoding，则以 ArrayBuffer 格式读取文件的二进制内容
  @JSName("success")
  var success_ReadFileOptions: js.UndefOr[js.Function1[/* res */ weixinDashAppLib.Anon_Data, scala.Unit]] = js.undefined
}

object ReadFileOptions {
  @scala.inline
  def apply(
    filePath: java.lang.String,
    complete: /* res */ js.Any => scala.Unit = null,
    encoding: java.lang.String = null,
    fail: js.Any => scala.Unit = null,
    success: /* res */ weixinDashAppLib.Anon_Data => scala.Unit = null
  ): ReadFileOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ReadFileOptions]
  }
}

