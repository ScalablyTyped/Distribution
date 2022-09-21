package typings.yaDisk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiResponse[T] extends StObject {
  
  var data: T
  
  var status: Double
}
object ApiResponse {
  
  inline def apply[T](data: T, status: Double): ApiResponse[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiResponse[T]]
  }
  
  extension [Self <: ApiResponse[?], T](x: Self & ApiResponse[T]) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
