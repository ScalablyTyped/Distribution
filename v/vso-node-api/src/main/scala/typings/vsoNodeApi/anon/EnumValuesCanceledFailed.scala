package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesCanceledFailed extends StObject {
  
  var enumValues: CanceledFailed = js.native
}
object EnumValuesCanceledFailed {
  
  @scala.inline
  def apply(enumValues: CanceledFailed): EnumValuesCanceledFailed = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCanceledFailed]
  }
  
  @scala.inline
  implicit class EnumValuesCanceledFailedMutableBuilder[Self <: EnumValuesCanceledFailed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: CanceledFailed): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
