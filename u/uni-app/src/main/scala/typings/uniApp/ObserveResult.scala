package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObserveResult extends js.Object {
  
  /**
    * 目标节点布局区域的边界
    */
  var boundingClientRect: js.UndefOr[ObserveNodeRect] = js.native
  
  /**
    * 相交比例
    */
  var intersectionRatio: js.UndefOr[Double] = js.native
  
  /**
    * 相交区域的边界
    */
  var intersectionRect: js.UndefOr[js.Any] = js.native
  
  /**
    * 参照区域的边界
    */
  var relativeRect: js.UndefOr[ObserveNodeRect] = js.native
  
  /**
    * 相交检测时的时间戳
    */
  var time: js.UndefOr[Double] = js.native
}
object ObserveResult {
  
  @scala.inline
  def apply(): ObserveResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObserveResult]
  }
  
  @scala.inline
  implicit class ObserveResultOps[Self <: ObserveResult] (val x: Self) extends AnyVal {
    
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
    def setBoundingClientRect(value: ObserveNodeRect): Self = this.set("boundingClientRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundingClientRect: Self = this.set("boundingClientRect", js.undefined)
    
    @scala.inline
    def setIntersectionRatio(value: Double): Self = this.set("intersectionRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntersectionRatio: Self = this.set("intersectionRatio", js.undefined)
    
    @scala.inline
    def setIntersectionRect(value: js.Any): Self = this.set("intersectionRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntersectionRect: Self = this.set("intersectionRect", js.undefined)
    
    @scala.inline
    def setRelativeRect(value: ObserveNodeRect): Self = this.set("relativeRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativeRect: Self = this.set("relativeRect", js.undefined)
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
}
