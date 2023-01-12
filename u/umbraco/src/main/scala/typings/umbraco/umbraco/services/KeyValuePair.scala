package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyValuePair[T] extends StObject {
  
  var key: String
  
  var value: T
}
object KeyValuePair {
  
  inline def apply[T](key: String, value: T): KeyValuePair[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValuePair[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyValuePair[?], T] (val x: Self & KeyValuePair[T]) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
