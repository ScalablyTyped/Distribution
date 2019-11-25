package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreateTime extends js.Object {
  var createTime: Double
  var errMsg: String
  var size: Double
}

object Anon_CreateTime {
  @scala.inline
  def apply(createTime: Double, errMsg: String, size: Double): Anon_CreateTime = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CreateTime]
  }
}

