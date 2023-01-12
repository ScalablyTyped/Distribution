package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesArtifacts extends StObject {
  
  var enumValues: Artifacts
}
object EnumValuesArtifacts {
  
  inline def apply(enumValues: Artifacts): EnumValuesArtifacts = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesArtifacts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesArtifacts] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Artifacts): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
