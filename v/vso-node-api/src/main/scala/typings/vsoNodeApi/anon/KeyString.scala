package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyString extends StObject {
  
  var key: String
  
  var value: js.Array[KeyValue]
}
object KeyString {
  
  @scala.inline
  def apply(key: String, value: js.Array[KeyValue]): KeyString = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyString]
  }
  
  @scala.inline
  implicit class KeyStringMutableBuilder[Self <: KeyString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Array[KeyValue]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: KeyValue*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
