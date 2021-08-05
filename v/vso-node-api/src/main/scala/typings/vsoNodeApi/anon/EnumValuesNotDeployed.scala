package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesNotDeployed extends StObject {
  
  var enumValues: NotDeployed
}
object EnumValuesNotDeployed {
  
  inline def apply(enumValues: NotDeployed): EnumValuesNotDeployed = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesNotDeployed]
  }
  
  extension [Self <: EnumValuesNotDeployed](x: Self) {
    
    inline def setEnumValues(value: NotDeployed): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
