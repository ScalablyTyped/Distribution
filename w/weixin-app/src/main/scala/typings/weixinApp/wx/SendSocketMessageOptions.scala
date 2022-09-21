package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendSocketMessageOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 需要发送的内容 */
  var data: String | js.typedarray.ArrayBuffer
}
object SendSocketMessageOptions {
  
  inline def apply(data: String | js.typedarray.ArrayBuffer): SendSocketMessageOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendSocketMessageOptions]
  }
  
  extension [Self <: SendSocketMessageOptions](x: Self) {
    
    inline def setData(value: String | js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
