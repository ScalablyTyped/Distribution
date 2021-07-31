package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region 微信运动
trait StepInfo extends StObject {
  
  /** 微信运动步数 */
  var step: Double
  
  /** 时间戳，表示数据对应的时间 */
  var timestamp: Double
}
object StepInfo {
  
  @scala.inline
  def apply(step: Double, timestamp: Double): StepInfo = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepInfo]
  }
  
  @scala.inline
  implicit class StepInfoMutableBuilder[Self <: StepInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
