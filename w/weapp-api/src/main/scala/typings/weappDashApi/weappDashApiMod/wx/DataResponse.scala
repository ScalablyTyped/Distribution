package typings.weappDashApi.weappDashApiMod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataResponse extends js.Object {
  /** 回调函数返回的内容 */
  var data: js.Any
}

object DataResponse {
  @scala.inline
  def apply(data: js.Any): DataResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataResponse]
  }
}

