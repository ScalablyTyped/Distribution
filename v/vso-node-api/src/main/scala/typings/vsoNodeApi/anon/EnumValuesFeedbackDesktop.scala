package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesFeedbackDesktop extends StObject {
  
  var enumValues: FeedbackDesktop
}
object EnumValuesFeedbackDesktop {
  
  inline def apply(enumValues: FeedbackDesktop): EnumValuesFeedbackDesktop = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFeedbackDesktop]
  }
  
  extension [Self <: EnumValuesFeedbackDesktop](x: Self) {
    
    inline def setEnumValues(value: FeedbackDesktop): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
