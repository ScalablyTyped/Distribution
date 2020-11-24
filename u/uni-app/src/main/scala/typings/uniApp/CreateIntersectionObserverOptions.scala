package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateIntersectionObserverOptions extends js.Object {
  
  /**
    * 初始的相交比例
    */
  var initialRatio: js.UndefOr[Double] = js.native
  
  /**
    * 是否同时观测多个参照节点（而非一个）
    */
  var selectAll: js.UndefOr[Boolean] = js.native
  
  /**
    * 所有阈值
    */
  var thresholds: js.UndefOr[js.Array[_]] = js.native
}
object CreateIntersectionObserverOptions {
  
  @scala.inline
  def apply(): CreateIntersectionObserverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIntersectionObserverOptions]
  }
  
  @scala.inline
  implicit class CreateIntersectionObserverOptionsOps[Self <: CreateIntersectionObserverOptions] (val x: Self) extends AnyVal {
    
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
    def setInitialRatio(value: Double): Self = this.set("initialRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialRatio: Self = this.set("initialRatio", js.undefined)
    
    @scala.inline
    def setSelectAll(value: Boolean): Self = this.set("selectAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectAll: Self = this.set("selectAll", js.undefined)
    
    @scala.inline
    def setThresholdsVarargs(value: js.Any*): Self = this.set("thresholds", js.Array(value :_*))
    
    @scala.inline
    def setThresholds(value: js.Array[_]): Self = this.set("thresholds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThresholds: Self = this.set("thresholds", js.undefined)
  }
}
