package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyValuePair[T] extends StObject {
  
  var key: String = js.native
  
  var value: T = js.native
}
object KeyValuePair {
  
  @scala.inline
  def apply[T](key: String, value: T): KeyValuePair[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValuePair[T]]
  }
  
  @scala.inline
  implicit class KeyValuePairMutableBuilder[Self <: KeyValuePair[_], T] (val x: Self with KeyValuePair[T]) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
