package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigateBackOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 返回的页面数，如果 delta 大于现有页面数，则返回到首页。 */
  var delta: Double
}
object NavigateBackOptions {
  
  inline def apply(delta: Double): NavigateBackOptions = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateBackOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigateBackOptions] (val x: Self) extends AnyVal {
    
    inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
  }
}
