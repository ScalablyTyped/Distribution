package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesWorkItem extends StObject {
  
  var enumValues: WorkItem
}
object EnumValuesWorkItem {
  
  inline def apply(enumValues: WorkItem): EnumValuesWorkItem = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesWorkItem]
  }
  
  extension [Self <: EnumValuesWorkItem](x: Self) {
    
    inline def setEnumValues(value: WorkItem): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
