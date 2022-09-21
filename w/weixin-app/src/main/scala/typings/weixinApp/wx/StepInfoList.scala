package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 用户过去三十天的微信运动步数 */
trait StepInfoList extends StObject {
  
  var stepInfoList: js.Array[StepInfo]
}
object StepInfoList {
  
  inline def apply(stepInfoList: js.Array[StepInfo]): StepInfoList = {
    val __obj = js.Dynamic.literal(stepInfoList = stepInfoList.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepInfoList]
  }
  
  extension [Self <: StepInfoList](x: Self) {
    
    inline def setStepInfoList(value: js.Array[StepInfo]): Self = StObject.set(x, "stepInfoList", value.asInstanceOf[js.Any])
    
    inline def setStepInfoListVarargs(value: StepInfo*): Self = StObject.set(x, "stepInfoList", js.Array(value*))
  }
}
