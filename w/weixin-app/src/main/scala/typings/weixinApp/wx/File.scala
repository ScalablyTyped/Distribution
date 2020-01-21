package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  /**
  		 * 文件的保存时的时间戳，从1970/01/01 08:00:00 到当前时间的秒数
  		 */
  var createTime: Double
  /**
  		 * 文件的本地路径
  		 */
  var filePath: String
  /**
  		 * 文件大小，单位B
  		 */
  var size: Double
}

object File {
  @scala.inline
  def apply(createTime: Double, filePath: String, size: Double): File = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[File]
  }
}

