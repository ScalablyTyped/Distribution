package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesBlockData extends StObject {
  
  var enumValues: BlockData
}
object EnumValuesBlockData {
  
  inline def apply(enumValues: BlockData): EnumValuesBlockData = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesBlockData]
  }
  
  extension [Self <: EnumValuesBlockData](x: Self) {
    
    inline def setEnumValues(value: BlockData): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
