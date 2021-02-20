package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAborted extends StObject {
  
  var enumValues: Aborted = js.native
}
object EnumValuesAborted {
  
  @scala.inline
  def apply(enumValues: Aborted): EnumValuesAborted = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAborted]
  }
  
  @scala.inline
  implicit class EnumValuesAbortedMutableBuilder[Self <: EnumValuesAborted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Aborted): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
