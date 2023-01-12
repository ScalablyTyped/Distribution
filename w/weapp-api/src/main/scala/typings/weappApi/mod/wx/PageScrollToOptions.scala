package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//  滚动
trait PageScrollToOptions
  extends StObject
     with CommonCallbackOptions {
  
  //  滚动动画的时长，单位 ms。默认300
  var duration: Double
  
  //  滚动到页面的目标位置，单位 px
  var scrollTop: Double
}
object PageScrollToOptions {
  
  inline def apply(duration: Double, scrollTop: Double): PageScrollToOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageScrollToOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageScrollToOptions] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
  }
}
