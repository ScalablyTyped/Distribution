package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesFailedInProgress extends StObject {
  
  var enumValues: FailedInProgress = js.native
}
object EnumValuesFailedInProgress {
  
  @scala.inline
  def apply(enumValues: FailedInProgress): EnumValuesFailedInProgress = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFailedInProgress]
  }
  
  @scala.inline
  implicit class EnumValuesFailedInProgressMutableBuilder[Self <: EnumValuesFailedInProgress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: FailedInProgress): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
