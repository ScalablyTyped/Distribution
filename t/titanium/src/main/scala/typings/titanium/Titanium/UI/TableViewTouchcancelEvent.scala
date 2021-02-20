package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when a touch gesture is interrupted by the device.
  */
@js.native
trait TableViewTouchcancelEvent extends TableViewBaseEvent {
  
  /**
    * A value which indicates the stylus angle on the screen. If the stylus is perpendicular to the screen or no stylus is
    * being used, the value will be Pi/2. If the stylus is parallel to the screen, the value will be 0.
    * Note: This property is only available for iOS devices that support 3D-Touch and are 9.1 or later.
    */
  var altitudeAngle: Double = js.native
  
  /**
    * The current force value of the touch event.
    * Note: This property only available for iOS devices that support 3D-Touch and run 9.0 or later.
    */
  var force: Double = js.native
  
  /**
    * Maximum possible value of the force property.
    * Note: This property is only available for iOS devices that support 3D-Touch and run 9.0 or later.
    */
  var maximumPossibleForce: Double = js.native
  
  /**
    * The time (in seconds) when the touch was used in correlation with the system start up.
    *  Note: This property is only available for iOS devices that support 3D-Touch and run 9.0 or later.
    */
  var timestamp: Double = js.native
  
  /**
    * X coordinate of the event from the `source` view's coordinate system.
    */
  var x: Double = js.native
  
  /**
    * Y coordinate of the event from the `source` view's coordinate system.
    */
  var y: Double = js.native
}
object TableViewTouchcancelEvent {
  
  @scala.inline
  def apply(
    altitudeAngle: Double,
    force: Double,
    maximumPossibleForce: Double,
    source: TableView,
    timestamp: Double,
    x: Double,
    y: Double
  ): TableViewTouchcancelEvent = {
    val __obj = js.Dynamic.literal(altitudeAngle = altitudeAngle.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], maximumPossibleForce = maximumPossibleForce.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewTouchcancelEvent]
  }
  
  @scala.inline
  implicit class TableViewTouchcancelEventMutableBuilder[Self <: TableViewTouchcancelEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitudeAngle(value: Double): Self = StObject.set(x, "altitudeAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForce(value: Double): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumPossibleForce(value: Double): Self = StObject.set(x, "maximumPossibleForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
