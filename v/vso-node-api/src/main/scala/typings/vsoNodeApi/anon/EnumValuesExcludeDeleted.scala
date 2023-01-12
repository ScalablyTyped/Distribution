package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesExcludeDeleted extends StObject {
  
  var enumValues: ExcludeDeleted
}
object EnumValuesExcludeDeleted {
  
  inline def apply(enumValues: ExcludeDeleted): EnumValuesExcludeDeleted = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesExcludeDeleted]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesExcludeDeleted] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: ExcludeDeleted): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
