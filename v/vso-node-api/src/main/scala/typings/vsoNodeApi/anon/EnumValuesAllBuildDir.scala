package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAllBuildDir extends StObject {
  
  var enumValues: AllBuildDir
}
object EnumValuesAllBuildDir {
  
  inline def apply(enumValues: AllBuildDir): EnumValuesAllBuildDir = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAllBuildDir]
  }
  
  extension [Self <: EnumValuesAllBuildDir](x: Self) {
    
    inline def setEnumValues(value: AllBuildDir): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
