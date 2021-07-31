package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyName extends StObject {
  
  var propertyName: String
  
  var target: js.Function | String
}
object PropertyName {
  
  @scala.inline
  def apply(propertyName: String, target: js.Function | String): PropertyName = {
    val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyName]
  }
  
  @scala.inline
  implicit class PropertyNameMutableBuilder[Self <: PropertyName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Function | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
