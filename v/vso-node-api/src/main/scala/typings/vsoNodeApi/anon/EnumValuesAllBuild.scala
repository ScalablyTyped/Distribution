package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAllBuild extends StObject {
  
  var enumValues: AllBuild = js.native
}
object EnumValuesAllBuild {
  
  @scala.inline
  def apply(enumValues: AllBuild): EnumValuesAllBuild = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAllBuild]
  }
  
  @scala.inline
  implicit class EnumValuesAllBuildMutableBuilder[Self <: EnumValuesAllBuild] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: AllBuild): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
