package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileInfoSuccess extends js.Object {
  /** 按照传入的 digestAlgorithm 计算得出的的文件摘要 */
  var digest: java.lang.String
  /** 调用结果 */
  var errMsg: java.lang.String
  /** 文件大小，单位：B */
  var size: scala.Double
}

object GetFileInfoSuccess {
  @scala.inline
  def apply(digest: java.lang.String, errMsg: java.lang.String, size: scala.Double): GetFileInfoSuccess = {
    val __obj = js.Dynamic.literal(digest = digest, errMsg = errMsg, size = size)
  
    __obj.asInstanceOf[GetFileInfoSuccess]
  }
}

