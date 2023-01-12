package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesProjects extends StObject {
  
  var enumValues: Projects
}
object EnumValuesProjects {
  
  inline def apply(enumValues: Projects): EnumValuesProjects = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesProjects]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesProjects] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Projects): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
