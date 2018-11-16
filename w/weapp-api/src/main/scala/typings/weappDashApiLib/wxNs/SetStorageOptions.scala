package typings
package weappDashApiLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SetStorageOptions extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.undefined
  /** 需要存储的内容 */
  var data: js.Any | java.lang.String
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.undefined
  /** 本地缓存中的指定的 key */
  var key: java.lang.String
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ResponseCallback] = js.undefined
}

