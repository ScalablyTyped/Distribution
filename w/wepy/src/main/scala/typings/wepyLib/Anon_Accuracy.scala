package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accuracy extends js.Object {
  var accuracy: scala.Double
  var altitude: scala.Double
  var horizontalAccuracy: scala.Double
  var latitude: scala.Double
  var longitude: scala.Double
  var speed: scala.Double
  var verticalAccuracy: scala.Double
}

object Anon_Accuracy {
  @scala.inline
  def apply(
    accuracy: scala.Double,
    altitude: scala.Double,
    horizontalAccuracy: scala.Double,
    latitude: scala.Double,
    longitude: scala.Double,
    speed: scala.Double,
    verticalAccuracy: scala.Double
  ): Anon_Accuracy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accuracy")(accuracy)
    __obj.updateDynamic("altitude")(altitude)
    __obj.updateDynamic("horizontalAccuracy")(horizontalAccuracy)
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    __obj.updateDynamic("speed")(speed)
    __obj.updateDynamic("verticalAccuracy")(verticalAccuracy)
    __obj.asInstanceOf[Anon_Accuracy]
  }
}

