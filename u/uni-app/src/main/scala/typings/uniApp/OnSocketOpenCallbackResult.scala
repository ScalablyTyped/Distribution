package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnSocketOpenCallbackResult extends StObject {
  
  /**
    * 连接成功的 HTTP 响应 Header
    */
  var header: js.UndefOr[Any] = js.undefined
}
object OnSocketOpenCallbackResult {
  
  inline def apply(): OnSocketOpenCallbackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnSocketOpenCallbackResult]
  }
  
  extension [Self <: OnSocketOpenCallbackResult](x: Self) {
    
    inline def setHeader(value: Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
  }
}
