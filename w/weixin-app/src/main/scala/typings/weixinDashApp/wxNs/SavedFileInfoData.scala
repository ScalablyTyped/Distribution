package typings.weixinDashApp.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedFileInfoData extends js.Object {
  /**
  		 * 文件的保存是的时间戳，从1970/01/01 08:00:00 到当前时间的秒数
  		 */
  var createTime: Double
  /**
  		 * 接口调用结果
  		 */
  var errMsg: String
  /**
  		 * 文件大小，单位B
  		 */
  var size: Double
}

object SavedFileInfoData {
  @scala.inline
  def apply(createTime: Double, errMsg: String, size: Double): SavedFileInfoData = {
    val __obj = js.Dynamic.literal(createTime = createTime, errMsg = errMsg, size = size)
  
    __obj.asInstanceOf[SavedFileInfoData]
  }
}

