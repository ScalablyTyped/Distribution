package typings.weappDashApi.weappDashApiMod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStorageOptions extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.native
  /** 本地缓存中的指定的 key */
  var key: String = js.native
  /** 接口调用的回调函数,res = {data: key对应的内容} */
  @JSName("success")
  var success_Original: DataResponseCallback = js.native
  /** 接口调用的回调函数,res = {data: key对应的内容} */
  def success(res: DataResponse): Unit = js.native
}

