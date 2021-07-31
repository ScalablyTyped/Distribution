package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyName extends StObject {
  
  var propertyName: String
}
object PropertyName {
  
  @scala.inline
  def apply(propertyName: String): PropertyName = {
    val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyName]
  }
  
  @scala.inline
  implicit class PropertyNameMutableBuilder[Self <: PropertyName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
  }
}
