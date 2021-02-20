package typings.vis.mod

import typings.std.Date
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineEventPropertiesResult extends StObject {
  
  /**
    * The original click event.
    */
  var event: Event = js.native
  
  /**
    *  The id of the clicked group
    */
  var group: js.UndefOr[Double | Null] = js.native
  
  /**
    * The id of the clicked item.
    */
  var item: js.UndefOr[IdType | Null] = js.native
  
  /**
    * Absolute horizontal position of the click event.
    */
  var pageX: Double = js.native
  
  /**
    * Absolute vertical position of the click event.
    */
  var pageY: Double = js.native
  
  /**
    * Date of the clicked event, snapped to a nice value.
    */
  var snappedTime: Date = js.native
  
  /**
    *  Date of the clicked event.
    */
  var time: Date = js.native
  
  /**
    * Name of the clicked thing.
    */
  var what: js.UndefOr[TimelineEventPropertiesResultWhatType] = js.native
  
  /**
    * Relative horizontal position of the click event.
    */
  var x: Double = js.native
  
  /**
    * Relative vertical position of the click event.
    */
  var y: Double = js.native
}
object TimelineEventPropertiesResult {
  
  @scala.inline
  def apply(event: Event, pageX: Double, pageY: Double, snappedTime: Date, time: Date, x: Double, y: Double): TimelineEventPropertiesResult = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], snappedTime = snappedTime.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineEventPropertiesResult]
  }
  
  @scala.inline
  implicit class TimelineEventPropertiesResultMutableBuilder[Self <: TimelineEventPropertiesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: Double): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNull: Self = StObject.set(x, "group", null)
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setItem(value: IdType): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemNull: Self = StObject.set(x, "item", null)
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnappedTime(value: Date): Self = StObject.set(x, "snappedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhat(value: TimelineEventPropertiesResultWhatType): Self = StObject.set(x, "what", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhatUndefined: Self = StObject.set(x, "what", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
