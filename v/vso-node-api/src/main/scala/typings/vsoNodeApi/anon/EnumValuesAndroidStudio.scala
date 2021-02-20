package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAndroidStudio extends StObject {
  
  var enumValues: AndroidStudio = js.native
}
object EnumValuesAndroidStudio {
  
  @scala.inline
  def apply(enumValues: AndroidStudio): EnumValuesAndroidStudio = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAndroidStudio]
  }
  
  @scala.inline
  implicit class EnumValuesAndroidStudioMutableBuilder[Self <: EnumValuesAndroidStudio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: AndroidStudio): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
