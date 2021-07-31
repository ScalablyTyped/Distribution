package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesBehaviors extends StObject {
  
  var enumValues: Behaviors
}
object EnumValuesBehaviors {
  
  @scala.inline
  def apply(enumValues: Behaviors): EnumValuesBehaviors = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesBehaviors]
  }
  
  @scala.inline
  implicit class EnumValuesBehaviorsMutableBuilder[Self <: EnumValuesBehaviors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Behaviors): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
