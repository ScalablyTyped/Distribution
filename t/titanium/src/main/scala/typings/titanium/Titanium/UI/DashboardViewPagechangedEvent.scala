package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the current page of the dashboard view changes.
  */
@js.native
trait DashboardViewPagechangedEvent extends DashboardViewBaseEvent {
  
  /**
    * The current page number.
    */
  var pageNo: Double = js.native
}
object DashboardViewPagechangedEvent {
  
  @scala.inline
  def apply(pageNo: Double, source: DashboardView): DashboardViewPagechangedEvent = {
    val __obj = js.Dynamic.literal(pageNo = pageNo.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardViewPagechangedEvent]
  }
  
  @scala.inline
  implicit class DashboardViewPagechangedEventMutableBuilder[Self <: DashboardViewPagechangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageNo(value: Double): Self = StObject.set(x, "pageNo", value.asInstanceOf[js.Any])
  }
}
