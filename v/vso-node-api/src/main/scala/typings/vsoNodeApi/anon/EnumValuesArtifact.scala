package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesArtifact extends StObject {
  
  var enumValues: Artifact = js.native
}
object EnumValuesArtifact {
  
  @scala.inline
  def apply(enumValues: Artifact): EnumValuesArtifact = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesArtifact]
  }
  
  @scala.inline
  implicit class EnumValuesArtifactMutableBuilder[Self <: EnumValuesArtifact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Artifact): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
