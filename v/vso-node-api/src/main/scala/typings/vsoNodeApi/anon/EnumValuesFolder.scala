package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesFolder extends StObject {
  
  var enumValues: Folder
}
object EnumValuesFolder {
  
  inline def apply(enumValues: Folder): EnumValuesFolder = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFolder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesFolder] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Folder): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
