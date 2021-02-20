package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesFeedbackDesktop extends StObject {
  
  var enumValues: FeedbackDesktop = js.native
}
object EnumValuesFeedbackDesktop {
  
  @scala.inline
  def apply(enumValues: FeedbackDesktop): EnumValuesFeedbackDesktop = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFeedbackDesktop]
  }
  
  @scala.inline
  implicit class EnumValuesFeedbackDesktopMutableBuilder[Self <: EnumValuesFeedbackDesktop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: FeedbackDesktop): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
