package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIntersectionObserverOptions extends StObject {
  
  /**
    * 初始的相交比例
    */
  var initialRatio: js.UndefOr[Double] = js.undefined
  
  /**
    * 是否同时观测多个参照节点（而非一个）
    */
  var selectAll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 所有阈值
    */
  var thresholds: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object CreateIntersectionObserverOptions {
  
  @scala.inline
  def apply(): CreateIntersectionObserverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIntersectionObserverOptions]
  }
  
  @scala.inline
  implicit class CreateIntersectionObserverOptionsMutableBuilder[Self <: CreateIntersectionObserverOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialRatio(value: Double): Self = StObject.set(x, "initialRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialRatioUndefined: Self = StObject.set(x, "initialRatio", js.undefined)
    
    @scala.inline
    def setSelectAll(value: Boolean): Self = StObject.set(x, "selectAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectAllUndefined: Self = StObject.set(x, "selectAll", js.undefined)
    
    @scala.inline
    def setThresholds(value: js.Array[js.Any]): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdsUndefined: Self = StObject.set(x, "thresholds", js.undefined)
    
    @scala.inline
    def setThresholdsVarargs(value: js.Any*): Self = StObject.set(x, "thresholds", js.Array(value :_*))
  }
}
