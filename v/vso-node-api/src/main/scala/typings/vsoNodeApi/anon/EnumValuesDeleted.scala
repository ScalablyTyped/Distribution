package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesDeleted extends StObject {
  
  var enumValues: Deleted = js.native
}
object EnumValuesDeleted {
  
  @scala.inline
  def apply(enumValues: Deleted): EnumValuesDeleted = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDeleted]
  }
  
  @scala.inline
  implicit class EnumValuesDeletedMutableBuilder[Self <: EnumValuesDeleted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Deleted): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
