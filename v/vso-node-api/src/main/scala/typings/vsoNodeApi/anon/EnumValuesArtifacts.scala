package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesArtifacts extends StObject {
  
  var enumValues: Artifacts = js.native
}
object EnumValuesArtifacts {
  
  @scala.inline
  def apply(enumValues: Artifacts): EnumValuesArtifacts = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesArtifacts]
  }
  
  @scala.inline
  implicit class EnumValuesArtifactsMutableBuilder[Self <: EnumValuesArtifacts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Artifacts): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
