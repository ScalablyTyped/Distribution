package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Properties extends StObject {
  
  var properties: Color
  
  var value: js.Array[js.Any]
}
object Properties {
  
  @scala.inline
  def apply(properties: Color, value: js.Array[js.Any]): Properties = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Properties]
  }
  
  @scala.inline
  implicit class PropertiesMutableBuilder[Self <: Properties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: Color): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Array[js.Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
