package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestFullScreenOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 有效值为 0（正常竖向）, 90（屏幕逆时针90度）, -90（屏幕顺时针90度） */
  var direction: Double
}
object RequestFullScreenOptions {
  
  inline def apply(direction: Double): RequestFullScreenOptions = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestFullScreenOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestFullScreenOptions] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
  }
}
