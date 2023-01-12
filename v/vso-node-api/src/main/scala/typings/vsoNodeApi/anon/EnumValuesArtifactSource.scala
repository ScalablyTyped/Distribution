package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesArtifactSource extends StObject {
  
  var enumValues: ArtifactSource
}
object EnumValuesArtifactSource {
  
  inline def apply(enumValues: ArtifactSource): EnumValuesArtifactSource = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesArtifactSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesArtifactSource] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: ArtifactSource): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
