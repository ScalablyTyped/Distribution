package typings.titanium.Titanium

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarEventMap extends ProxyEventMap {
  
  var change: CalendarChangeEvent = js.native
}
object CalendarEventMap {
  
  @scala.inline
  def apply(change: CalendarChangeEvent): CalendarEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarEventMap]
  }
  
  @scala.inline
  implicit class CalendarEventMapMutableBuilder[Self <: CalendarEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: CalendarChangeEvent): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
  }
}
