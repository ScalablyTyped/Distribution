package typings.wepy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollTop extends StObject {
  
  var duration: Double
  
  var scrollTop: Double
}
object ScrollTop {
  
  @scala.inline
  def apply(duration: Double, scrollTop: Double): ScrollTop = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollTop]
  }
  
  @scala.inline
  implicit class ScrollTopMutableBuilder[Self <: ScrollTop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
  }
}
