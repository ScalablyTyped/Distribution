package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueDailymotion extends StObject {
  
  var label: String
  
  var value: Dailymotion
}
object ValueDailymotion {
  
  @scala.inline
  def apply(label: String, value: Dailymotion): ValueDailymotion = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDailymotion]
  }
  
  @scala.inline
  implicit class ValueDailymotionMutableBuilder[Self <: ValueDailymotion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Dailymotion): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
