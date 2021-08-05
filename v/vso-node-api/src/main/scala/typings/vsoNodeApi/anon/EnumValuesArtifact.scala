package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesArtifact extends StObject {
  
  var enumValues: Artifact
}
object EnumValuesArtifact {
  
  inline def apply(enumValues: Artifact): EnumValuesArtifact = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesArtifact]
  }
  
  extension [Self <: EnumValuesArtifact](x: Self) {
    
    inline def setEnumValues(value: Artifact): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
