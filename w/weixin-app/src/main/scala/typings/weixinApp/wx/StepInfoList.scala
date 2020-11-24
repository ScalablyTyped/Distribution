package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 用户过去三十天的微信运动步数 */
@js.native
trait StepInfoList extends js.Object {
  
  var stepInfoList: js.Array[StepInfo] = js.native
}
object StepInfoList {
  
  @scala.inline
  def apply(stepInfoList: js.Array[StepInfo]): StepInfoList = {
    val __obj = js.Dynamic.literal(stepInfoList = stepInfoList.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepInfoList]
  }
  
  @scala.inline
  implicit class StepInfoListOps[Self <: StepInfoList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStepInfoListVarargs(value: StepInfo*): Self = this.set("stepInfoList", js.Array(value :_*))
    
    @scala.inline
    def setStepInfoList(value: js.Array[StepInfo]): Self = this.set("stepInfoList", value.asInstanceOf[js.Any])
  }
}
