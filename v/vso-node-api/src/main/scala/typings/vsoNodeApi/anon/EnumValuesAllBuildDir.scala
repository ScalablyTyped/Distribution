package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAllBuildDir extends StObject {
  
  var enumValues: AllBuildDir = js.native
}
object EnumValuesAllBuildDir {
  
  @scala.inline
  def apply(enumValues: AllBuildDir): EnumValuesAllBuildDir = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAllBuildDir]
  }
  
  @scala.inline
  implicit class EnumValuesAllBuildDirMutableBuilder[Self <: EnumValuesAllBuildDir] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: AllBuildDir): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
