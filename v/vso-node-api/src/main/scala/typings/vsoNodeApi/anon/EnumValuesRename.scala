package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesRename extends StObject {
  
  var enumValues: Rename
}
object EnumValuesRename {
  
  inline def apply(enumValues: Rename): EnumValuesRename = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesRename]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesRename] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Rename): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
