package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesExternalTfsBuild extends StObject {
  
  var enumValues: ExternalTfsBuild = js.native
}
object EnumValuesExternalTfsBuild {
  
  @scala.inline
  def apply(enumValues: ExternalTfsBuild): EnumValuesExternalTfsBuild = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesExternalTfsBuild]
  }
  
  @scala.inline
  implicit class EnumValuesExternalTfsBuildMutableBuilder[Self <: EnumValuesExternalTfsBuild] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: ExternalTfsBuild): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
