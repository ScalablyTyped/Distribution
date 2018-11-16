package typings
package weappDashApiLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StartRecordOptions extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.undefined
  /** 录音成功后调用，返回录音文件的临时文件路径，res = {tempFilePath: '录音文件的临时路径'} */
  var success: js.UndefOr[TempFileResponseCallback] = js.undefined
}

