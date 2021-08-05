package typings.wxServerSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonOption[T] extends StObject {
  
  var data: T
}
object CommonOption {
  
  inline def apply[T](data: T): CommonOption[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonOption[T]]
  }
  
  extension [Self <: CommonOption[?], T](x: Self & CommonOption[T]) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
