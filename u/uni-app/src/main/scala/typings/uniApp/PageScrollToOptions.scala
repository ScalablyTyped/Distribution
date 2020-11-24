package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageScrollToOptions extends js.Object {
  
  /**
    * 滚动动画的时长
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * 滚动到页面的目标位置
    */
  var scrollTop: js.UndefOr[Double] = js.native
}
object PageScrollToOptions {
  
  @scala.inline
  def apply(): PageScrollToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageScrollToOptions]
  }
  
  @scala.inline
  implicit class PageScrollToOptionsOps[Self <: PageScrollToOptions] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setScrollTop(value: Double): Self = this.set("scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollTop: Self = this.set("scrollTop", js.undefined)
  }
}
