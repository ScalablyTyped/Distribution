package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAllAttributes extends StObject {
  
  var enumValues: AllAttributes = js.native
}
object EnumValuesAllAttributes {
  
  @scala.inline
  def apply(enumValues: AllAttributes): EnumValuesAllAttributes = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAllAttributes]
  }
  
  @scala.inline
  implicit class EnumValuesAllAttributesMutableBuilder[Self <: EnumValuesAllAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: AllAttributes): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
