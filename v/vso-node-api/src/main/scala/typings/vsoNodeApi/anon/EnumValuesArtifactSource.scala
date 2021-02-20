package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesArtifactSource extends StObject {
  
  var enumValues: ArtifactSource = js.native
}
object EnumValuesArtifactSource {
  
  @scala.inline
  def apply(enumValues: ArtifactSource): EnumValuesArtifactSource = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesArtifactSource]
  }
  
  @scala.inline
  implicit class EnumValuesArtifactSourceMutableBuilder[Self <: EnumValuesArtifactSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: ArtifactSource): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
