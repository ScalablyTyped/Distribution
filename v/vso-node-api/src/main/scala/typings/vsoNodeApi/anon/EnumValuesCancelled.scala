package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesCancelled extends StObject {
  
  var enumValues: Cancelled
}
object EnumValuesCancelled {
  
  @scala.inline
  def apply(enumValues: Cancelled): EnumValuesCancelled = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCancelled]
  }
  
  @scala.inline
  implicit class EnumValuesCancelledMutableBuilder[Self <: EnumValuesCancelled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Cancelled): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
