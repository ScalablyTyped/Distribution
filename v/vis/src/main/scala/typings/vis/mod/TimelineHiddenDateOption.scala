package typings.vis.mod

import typings.vis.visStrings.daily
import typings.vis.visStrings.monthly
import typings.vis.visStrings.weekly
import typings.vis.visStrings.yearly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineHiddenDateOption extends StObject {
  
  var end: DateType
  
  var repeat: js.UndefOr[daily | weekly | monthly | yearly] = js.undefined
  
  var start: DateType
}
object TimelineHiddenDateOption {
  
  inline def apply(end: DateType, start: DateType): TimelineHiddenDateOption = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineHiddenDateOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimelineHiddenDateOption] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: DateType): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setRepeat(value: daily | weekly | monthly | yearly): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    inline def setStart(value: DateType): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
