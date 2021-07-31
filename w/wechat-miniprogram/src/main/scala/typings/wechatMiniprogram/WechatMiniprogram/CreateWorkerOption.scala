package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 可选参数 */
trait CreateWorkerOption extends StObject {
  
  /** 是否使用实验worker。在iOS下，实验worker的JS运行效率比非实验worker提升近十倍，如需在worker内进行重度计算的建议开启此选项。
    *
    * 最低基础库： `2.13.0` */
  var useExperimentalWorker: js.UndefOr[Boolean] = js.undefined
}
object CreateWorkerOption {
  
  @scala.inline
  def apply(): CreateWorkerOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorkerOption]
  }
  
  @scala.inline
  implicit class CreateWorkerOptionMutableBuilder[Self <: CreateWorkerOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUseExperimentalWorker(value: Boolean): Self = StObject.set(x, "useExperimentalWorker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseExperimentalWorkerUndefined: Self = StObject.set(x, "useExperimentalWorker", js.undefined)
  }
}
