package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesExe extends StObject {
  
  var enumValues: Exe = js.native
}
object EnumValuesExe {
  
  @scala.inline
  def apply(enumValues: Exe): EnumValuesExe = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesExe]
  }
  
  @scala.inline
  implicit class EnumValuesExeMutableBuilder[Self <: EnumValuesExe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Exe): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
