package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesProject extends StObject {
  
  var enumValues: Project
}
object EnumValuesProject {
  
  inline def apply(enumValues: Project): EnumValuesProject = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesProject]
  }
  
  extension [Self <: EnumValuesProject](x: Self) {
    
    inline def setEnumValues(value: Project): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
