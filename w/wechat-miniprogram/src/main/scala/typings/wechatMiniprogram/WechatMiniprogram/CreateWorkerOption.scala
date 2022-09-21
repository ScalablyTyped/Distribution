package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 可选参数 */
trait CreateWorkerOption extends StObject {
  
  /** 是否使用实验worker。在iOS下，实验worker的JS运行效率比非实验worker提升近十倍，如需在worker内进行重度计算的建议开启此选项。同时，实验worker存在极小概率会在系统资源紧张时被系统回收，因此建议配合 worker.onProcessKilled 事件使用，在worker被回收后可重新创建一个。
    *
    * 最低基础库： `2.13.0` */
  var useExperimentalWorker: js.UndefOr[Boolean] = js.undefined
}
object CreateWorkerOption {
  
  inline def apply(): CreateWorkerOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorkerOption]
  }
  
  extension [Self <: CreateWorkerOption](x: Self) {
    
    inline def setUseExperimentalWorker(value: Boolean): Self = StObject.set(x, "useExperimentalWorker", value.asInstanceOf[js.Any])
    
    inline def setUseExperimentalWorkerUndefined: Self = StObject.set(x, "useExperimentalWorker", js.undefined)
  }
}
