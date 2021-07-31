package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesExcludeDeleted extends StObject {
  
  var enumValues: ExcludeDeleted
}
object EnumValuesExcludeDeleted {
  
  @scala.inline
  def apply(enumValues: ExcludeDeleted): EnumValuesExcludeDeleted = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesExcludeDeleted]
  }
  
  @scala.inline
  implicit class EnumValuesExcludeDeletedMutableBuilder[Self <: EnumValuesExcludeDeleted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: ExcludeDeleted): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
