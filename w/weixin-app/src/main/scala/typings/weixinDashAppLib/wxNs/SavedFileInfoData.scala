package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedFileInfoData extends js.Object {
  /**
  		 * 文件的保存是的时间戳，从1970/01/01 08:00:00 到当前时间的秒数
  		 */
  var createTime: scala.Double
  /**
  		 * 接口调用结果
  		 */
  var errMsg: java.lang.String
  /**
  		 * 文件大小，单位B
  		 */
  var size: scala.Double
}

object SavedFileInfoData {
  @scala.inline
  def apply(createTime: scala.Double, errMsg: java.lang.String, size: scala.Double): SavedFileInfoData = {
    val __obj = js.Dynamic.literal(createTime = createTime, errMsg = errMsg, size = size)
  
    __obj.asInstanceOf[SavedFileInfoData]
  }
}

