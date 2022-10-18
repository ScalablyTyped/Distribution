package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueT[T] extends StObject {
  
  var value: T
}
object ValueT {
  
  inline def apply[T](value: T): ValueT[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueT[T]]
  }
  
  extension [Self <: ValueT[?], T](x: Self & ValueT[T]) {
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
