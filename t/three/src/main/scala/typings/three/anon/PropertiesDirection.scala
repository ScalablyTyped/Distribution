package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesDirection extends StObject {
  
  var properties: Direction
  
  var value: js.Array[js.Any]
}
object PropertiesDirection {
  
  @scala.inline
  def apply(properties: Direction, value: js.Array[js.Any]): PropertiesDirection = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesDirection]
  }
  
  @scala.inline
  implicit class PropertiesDirectionMutableBuilder[Self <: PropertiesDirection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: Direction): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Array[js.Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
