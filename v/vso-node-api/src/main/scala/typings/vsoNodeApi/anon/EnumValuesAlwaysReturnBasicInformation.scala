package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAlwaysReturnBasicInformation extends StObject {
  
  var enumValues: AlwaysReturnBasicInformation
}
object EnumValuesAlwaysReturnBasicInformation {
  
  inline def apply(enumValues: AlwaysReturnBasicInformation): EnumValuesAlwaysReturnBasicInformation = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAlwaysReturnBasicInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesAlwaysReturnBasicInformation] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: AlwaysReturnBasicInformation): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
