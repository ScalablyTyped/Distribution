package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesFailure extends StObject {
  
  var enumValues: Failure = js.native
}
object EnumValuesFailure {
  
  @scala.inline
  def apply(enumValues: Failure): EnumValuesFailure = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFailure]
  }
  
  @scala.inline
  implicit class EnumValuesFailureMutableBuilder[Self <: EnumValuesFailure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Failure): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
