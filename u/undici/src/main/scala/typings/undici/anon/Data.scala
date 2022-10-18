package typings.undici.anon

import typings.node.bufferMod.global.Buffer
import typings.undici.typesMockInterceptorMod.MockInterceptor.MockResponseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data[TData /* <: js.Object */] extends StObject {
  
  var data: js.UndefOr[TData | Buffer | String] = js.undefined
  
  var responseOptions: js.UndefOr[MockResponseOptions] = js.undefined
  
  var statusCode: Double
}
object Data {
  
  inline def apply[TData /* <: js.Object */](statusCode: Double): Data[TData] = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[TData]]
  }
  
  extension [Self <: Data[?], TData /* <: js.Object */](x: Self & Data[TData]) {
    
    inline def setData(value: TData | Buffer | String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setResponseOptions(value: MockResponseOptions): Self = StObject.set(x, "responseOptions", value.asInstanceOf[js.Any])
    
    inline def setResponseOptionsUndefined: Self = StObject.set(x, "responseOptions", js.undefined)
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
