package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertiesHeight extends StObject {
  
  var properties: Height = js.native
  
  var value: js.Array[_] = js.native
}
object PropertiesHeight {
  
  @scala.inline
  def apply(properties: Height, value: js.Array[_]): PropertiesHeight = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesHeight]
  }
  
  @scala.inline
  implicit class PropertiesHeightMutableBuilder[Self <: PropertiesHeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: Height): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Array[_]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
