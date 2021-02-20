package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 选项 */
@js.native
trait CreateIntersectionObserverOption extends StObject {
  
  /** 初始的相交比例，如果调用时检测到的相交比例与这个值不相等且达到阈值，则会触发一次监听器的回调函数。 */
  var initialRatio: js.UndefOr[Double] = js.native
  
  /** 是否同时观测多个目标节点（而非一个），如果设为 true ，observe 的 targetSelector 将选中多个节点（注意：同时选中过多节点将影响渲染性能）
    *
    * 最低基础库： `2.0.0` */
  var observeAll: js.UndefOr[Boolean] = js.native
  
  /** 一个数值数组，包含所有阈值。 */
  var thresholds: js.UndefOr[js.Array[Double]] = js.native
}
object CreateIntersectionObserverOption {
  
  @scala.inline
  def apply(): CreateIntersectionObserverOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIntersectionObserverOption]
  }
  
  @scala.inline
  implicit class CreateIntersectionObserverOptionMutableBuilder[Self <: CreateIntersectionObserverOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialRatio(value: Double): Self = StObject.set(x, "initialRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialRatioUndefined: Self = StObject.set(x, "initialRatio", js.undefined)
    
    @scala.inline
    def setObserveAll(value: Boolean): Self = StObject.set(x, "observeAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObserveAllUndefined: Self = StObject.set(x, "observeAll", js.undefined)
    
    @scala.inline
    def setThresholds(value: js.Array[Double]): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdsUndefined: Self = StObject.set(x, "thresholds", js.undefined)
    
    @scala.inline
    def setThresholdsVarargs(value: Double*): Self = StObject.set(x, "thresholds", js.Array(value :_*))
  }
}
