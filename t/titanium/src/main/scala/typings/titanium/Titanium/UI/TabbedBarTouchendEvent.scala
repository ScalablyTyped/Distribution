package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a touch event is completed.
  */
trait TabbedBarTouchendEvent extends TabbedBarBaseEvent {
  /**
    * A value which indicates the stylus angle on the screen. If the stylus is perpendicular to the screen or no stylus is
    * being used, the value will be Pi/2. If the stylus is parallel to the screen, the value will be 0.
    * Note: This property is only available for iOS devices that support 3D-Touch and are 9.1 or later.
    */
  var altitudeAngle: Double
  /**
    * The x value of the unit vector that points in the direction of the azimuth of the stylus.
    * Note: This property is only available for iOS devices that support the Apple Pencil and are 9.1 or later.
    */
  var azimuthUnitVectorInViewX: Double
  /**
    * The y value of the unit vector that points in the direction of the azimuth of the stylus.
    * Note: This property is only available for iOS devices that support the Apple Penciland are 9.1 or later.
    */
  var azimuthUnitVectorInViewY: Double
  /**
    * The current force value of the touch event.
    * Note: This property is only available for iOS devices that support 3D-Touch and run 9.0 or later and on some Android devices.
    */
  var force: Double
  /**
    * Maximum possible value of the force property.
    * Note: This property is only available for iOS devices that support 3D-Touch and run 9.0 or later.
    */
  var maximumPossibleForce: Double
  /**
    * The current size of the touch area. Note: This property is only available on some Android devices.
    */
  var size: Double
  /**
    * The time (in seconds) when the touch was used in correlation with the system start up.
    * Note: This property is only available for iOS devices that support 3D-Touch and run 9.0 or later.
    */
  var timestamp: Double
  /**
    * X coordinate of the event from the `source` view's coordinate system.
    */
  var x: Double
  /**
    * Y coordinate of the event from the `source` view's coordinate system.
    */
  var y: Double
}

object TabbedBarTouchendEvent {
  @scala.inline
  def apply(
    altitudeAngle: Double,
    azimuthUnitVectorInViewX: Double,
    azimuthUnitVectorInViewY: Double,
    force: Double,
    maximumPossibleForce: Double,
    size: Double,
    source: TabbedBar,
    timestamp: Double,
    x: Double,
    y: Double
  ): TabbedBarTouchendEvent = {
    val __obj = js.Dynamic.literal(altitudeAngle = altitudeAngle.asInstanceOf[js.Any], azimuthUnitVectorInViewX = azimuthUnitVectorInViewX.asInstanceOf[js.Any], azimuthUnitVectorInViewY = azimuthUnitVectorInViewY.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], maximumPossibleForce = maximumPossibleForce.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabbedBarTouchendEvent]
  }
}

