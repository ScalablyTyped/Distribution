package typings.weixinDashApp.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 用户过去三十天的微信运动步数 */
trait StepInfoList extends js.Object {
  var stepInfoList: js.Array[StepInfo]
}

object StepInfoList {
  @scala.inline
  def apply(stepInfoList: js.Array[StepInfo]): StepInfoList = {
    val __obj = js.Dynamic.literal(stepInfoList = stepInfoList)
  
    __obj.asInstanceOf[StepInfoList]
  }
}

