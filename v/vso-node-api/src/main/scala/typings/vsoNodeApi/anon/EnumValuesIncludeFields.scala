package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesIncludeFields extends StObject {
  
  var enumValues: IncludeFields = js.native
}
object EnumValuesIncludeFields {
  
  @scala.inline
  def apply(enumValues: IncludeFields): EnumValuesIncludeFields = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesIncludeFields]
  }
  
  @scala.inline
  implicit class EnumValuesIncludeFieldsMutableBuilder[Self <: EnumValuesIncludeFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: IncludeFields): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
