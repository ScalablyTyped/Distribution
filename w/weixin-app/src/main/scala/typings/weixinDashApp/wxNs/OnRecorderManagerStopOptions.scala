package typings.weixinDashApp.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnRecorderManagerStopOptions extends js.Object {
  var tempFilePath: String
}

object OnRecorderManagerStopOptions {
  @scala.inline
  def apply(tempFilePath: String): OnRecorderManagerStopOptions = {
    val __obj = js.Dynamic.literal(tempFilePath = tempFilePath)
  
    __obj.asInstanceOf[OnRecorderManagerStopOptions]
  }
}

