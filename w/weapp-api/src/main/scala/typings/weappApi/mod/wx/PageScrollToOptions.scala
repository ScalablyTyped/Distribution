package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//  滚动
@js.native
trait PageScrollToOptions extends CommonCallbackOptions {
  
  //  滚动动画的时长，单位 ms。默认300
  var duration: Double = js.native
  
  //  滚动到页面的目标位置，单位 px
  var scrollTop: Double = js.native
}
object PageScrollToOptions {
  
  @scala.inline
  def apply(duration: Double, scrollTop: Double): PageScrollToOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageScrollToOptions]
  }
  
  @scala.inline
  implicit class PageScrollToOptionsMutableBuilder[Self <: PageScrollToOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
  }
}
