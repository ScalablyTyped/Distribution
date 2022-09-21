package typings.vis.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineEventPropertiesResult extends StObject {
  
  /**
    * The original click event.
    */
  var event: Event
  
  /**
    *  The id of the clicked group
    */
  var group: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The id of the clicked item.
    */
  var item: js.UndefOr[IdType | Null] = js.undefined
  
  /**
    * Absolute horizontal position of the click event.
    */
  var pageX: Double
  
  /**
    * Absolute vertical position of the click event.
    */
  var pageY: Double
  
  /**
    * Date of the clicked event, snapped to a nice value.
    */
  var snappedTime: js.Date
  
  /**
    *  Date of the clicked event.
    */
  var time: js.Date
  
  /**
    * Name of the clicked thing.
    */
  var what: js.UndefOr[TimelineEventPropertiesResultWhatType] = js.undefined
  
  /**
    * Relative horizontal position of the click event.
    */
  var x: Double
  
  /**
    * Relative vertical position of the click event.
    */
  var y: Double
}
object TimelineEventPropertiesResult {
  
  inline def apply(
    event: Event,
    pageX: Double,
    pageY: Double,
    snappedTime: js.Date,
    time: js.Date,
    x: Double,
    y: Double
  ): TimelineEventPropertiesResult = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], snappedTime = snappedTime.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineEventPropertiesResult]
  }
  
  extension [Self <: TimelineEventPropertiesResult](x: Self) {
    
    inline def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: Double): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupNull: Self = StObject.set(x, "group", null)
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setItem(value: IdType): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemNull: Self = StObject.set(x, "item", null)
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
    
    inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    
    inline def setSnappedTime(value: js.Date): Self = StObject.set(x, "snappedTime", value.asInstanceOf[js.Any])
    
    inline def setTime(value: js.Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setWhat(value: TimelineEventPropertiesResultWhatType): Self = StObject.set(x, "what", value.asInstanceOf[js.Any])
    
    inline def setWhatUndefined: Self = StObject.set(x, "what", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
