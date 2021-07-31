package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesCancellingCompleted extends StObject {
  
  var enumValues: CancellingCompleted
}
object EnumValuesCancellingCompleted {
  
  @scala.inline
  def apply(enumValues: CancellingCompleted): EnumValuesCancellingCompleted = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCancellingCompleted]
  }
  
  @scala.inline
  implicit class EnumValuesCancellingCompletedMutableBuilder[Self <: EnumValuesCancellingCompleted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: CancellingCompleted): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
