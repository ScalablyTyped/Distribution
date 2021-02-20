package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertiesValue extends StObject {
  
  var properties: ConeCos = js.native
  
  var value: js.Array[_] = js.native
}
object PropertiesValue {
  
  @scala.inline
  def apply(properties: ConeCos, value: js.Array[_]): PropertiesValue = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesValue]
  }
  
  @scala.inline
  implicit class PropertiesValueMutableBuilder[Self <: PropertiesValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: ConeCos): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Array[_]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
