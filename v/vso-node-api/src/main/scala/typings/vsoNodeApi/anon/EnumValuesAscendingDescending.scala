package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAscendingDescending extends StObject {
  
  var enumValues: AscendingDescending
}
object EnumValuesAscendingDescending {
  
  @scala.inline
  def apply(enumValues: AscendingDescending): EnumValuesAscendingDescending = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAscendingDescending]
  }
  
  @scala.inline
  implicit class EnumValuesAscendingDescendingMutableBuilder[Self <: EnumValuesAscendingDescending] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: AscendingDescending): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
