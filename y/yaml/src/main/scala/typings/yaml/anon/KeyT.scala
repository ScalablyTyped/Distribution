package typings.yaml.anon

import typings.yaml.distNodesScalarMod.Scalar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyT[T] extends StObject {
  
  var key: T
  
  var value: Scalar[Null] | Null
}
object KeyT {
  
  inline def apply[T](key: T): KeyT[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = null)
    __obj.asInstanceOf[KeyT[T]]
  }
  
  extension [Self <: KeyT[?], T](x: Self & KeyT[T]) {
    
    inline def setKey(value: T): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Scalar[Null]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
