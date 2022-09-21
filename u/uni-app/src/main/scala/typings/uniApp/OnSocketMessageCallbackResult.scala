package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnSocketMessageCallbackResult extends StObject {
  
  /**
    * 服务器返回的消息
    */
  var data: js.UndefOr[String | js.typedarray.ArrayBuffer] = js.undefined
}
object OnSocketMessageCallbackResult {
  
  inline def apply(): OnSocketMessageCallbackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnSocketMessageCallbackResult]
  }
  
  extension [Self <: OnSocketMessageCallbackResult](x: Self) {
    
    inline def setData(value: String | js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
