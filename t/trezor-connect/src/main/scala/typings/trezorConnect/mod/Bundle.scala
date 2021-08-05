package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bundle[T] extends StObject {
  
  var bundle: js.Array[T]
}
object Bundle {
  
  inline def apply[T](bundle: js.Array[T]): Bundle[T] = {
    val __obj = js.Dynamic.literal(bundle = bundle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundle[T]]
  }
  
  extension [Self <: Bundle[?], T](x: Self & Bundle[T]) {
    
    inline def setBundle(value: js.Array[T]): Self = StObject.set(x, "bundle", value.asInstanceOf[js.Any])
    
    inline def setBundleVarargs(value: T*): Self = StObject.set(x, "bundle", js.Array(value :_*))
  }
}
