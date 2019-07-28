package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accuracy extends js.Object {
  var accuracy: Double
  var altitude: Double
  var horizontalAccuracy: Double
  var latitude: Double
  var longitude: Double
  var speed: Double
  var verticalAccuracy: Double
}

object Anon_Accuracy {
  @scala.inline
  def apply(
    accuracy: Double,
    altitude: Double,
    horizontalAccuracy: Double,
    latitude: Double,
    longitude: Double,
    speed: Double,
    verticalAccuracy: Double
  ): Anon_Accuracy = {
    val __obj = js.Dynamic.literal(accuracy = accuracy, altitude = altitude, horizontalAccuracy = horizontalAccuracy, latitude = latitude, longitude = longitude, speed = speed, verticalAccuracy = verticalAccuracy)
  
    __obj.asInstanceOf[Anon_Accuracy]
  }
}

