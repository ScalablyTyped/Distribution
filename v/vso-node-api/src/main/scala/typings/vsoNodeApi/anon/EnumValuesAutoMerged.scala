package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAutoMerged extends StObject {
  
  var enumValues: AutoMerged
}
object EnumValuesAutoMerged {
  
  inline def apply(enumValues: AutoMerged): EnumValuesAutoMerged = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAutoMerged]
  }
  
  extension [Self <: EnumValuesAutoMerged](x: Self) {
    
    inline def setEnumValues(value: AutoMerged): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
