package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesDerived extends StObject {
  
  var enumValues: Derived = js.native
}
object EnumValuesDerived {
  
  @scala.inline
  def apply(enumValues: Derived): EnumValuesDerived = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDerived]
  }
  
  @scala.inline
  implicit class EnumValuesDerivedMutableBuilder[Self <: EnumValuesDerived] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Derived): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
