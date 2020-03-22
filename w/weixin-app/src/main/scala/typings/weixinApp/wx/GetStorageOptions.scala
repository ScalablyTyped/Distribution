package typings.weixinApp.wx

import typings.weixinApp.Anon0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStorageOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 本地缓存中的指定的 key */
  var key: String
  /** 接口调用的回调函数,res = {data: key对应的内容} */
  @JSName("success")
  def success_MGetStorageOptions(res: Anon0): Unit
}

object GetStorageOptions {
  @scala.inline
  def apply(
    key: String,
    success: Anon0 => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null
  ): GetStorageOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[GetStorageOptions]
  }
}

