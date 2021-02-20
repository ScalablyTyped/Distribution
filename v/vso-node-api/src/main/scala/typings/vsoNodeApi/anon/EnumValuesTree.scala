package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesTree extends StObject {
  
  var enumValues: Tree = js.native
}
object EnumValuesTree {
  
  @scala.inline
  def apply(enumValues: Tree): EnumValuesTree = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesTree]
  }
  
  @scala.inline
  implicit class EnumValuesTreeMutableBuilder[Self <: EnumValuesTree] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Tree): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
