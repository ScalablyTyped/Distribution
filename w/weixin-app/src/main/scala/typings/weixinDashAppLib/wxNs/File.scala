package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  /**
  		 * 文件的保存时的时间戳，从1970/01/01 08:00:00 到当前时间的秒数
  		 */
  var createTime: scala.Double
  /**
  		 * 文件的本地路径
  		 */
  var filePath: java.lang.String
  /**
  		 * 文件大小，单位B
  		 */
  var size: scala.Double
}

object File {
  @scala.inline
  def apply(createTime: scala.Double, filePath: java.lang.String, size: scala.Double): File = {
    val __obj = js.Dynamic.literal(createTime = createTime, filePath = filePath, size = size)
  
    __obj.asInstanceOf[File]
  }
}

