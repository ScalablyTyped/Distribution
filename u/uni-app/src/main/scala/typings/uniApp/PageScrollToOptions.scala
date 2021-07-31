package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageScrollToOptions extends StObject {
  
  /**
    * 滚动动画的时长
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * 滚动到页面的目标位置
    */
  var scrollTop: js.UndefOr[Double] = js.undefined
}
object PageScrollToOptions {
  
  @scala.inline
  def apply(): PageScrollToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageScrollToOptions]
  }
  
  @scala.inline
  implicit class PageScrollToOptionsMutableBuilder[Self <: PageScrollToOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
  }
}
