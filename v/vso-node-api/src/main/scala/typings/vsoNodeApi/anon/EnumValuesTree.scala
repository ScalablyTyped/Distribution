package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesTree extends StObject {
  
  var enumValues: Tree
}
object EnumValuesTree {
  
  inline def apply(enumValues: Tree): EnumValuesTree = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesTree]
  }
  
  extension [Self <: EnumValuesTree](x: Self) {
    
    inline def setEnumValues(value: Tree): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
