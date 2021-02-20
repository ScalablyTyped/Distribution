package typings.weixinApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollTop extends StObject {
  
  var scrollTop: Double = js.native
}
object ScrollTop {
  
  @scala.inline
  def apply(scrollTop: Double): ScrollTop = {
    val __obj = js.Dynamic.literal(scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollTop]
  }
  
  @scala.inline
  implicit class ScrollTopMutableBuilder[Self <: ScrollTop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
  }
}
