package typings.teslajs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vehicle_ extends /* key */ StringDictionary[String | Double | Boolean | Null] {
  var id: String
  var vehicleID: Double
}

object Vehicle_ {
  @scala.inline
  def apply(
    id: String,
    vehicleID: Double,
    StringDictionary: /* key */ StringDictionary[String | Double | Boolean | Null] = null
  ): Vehicle_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], vehicleID = vehicleID.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Vehicle_]
  }
}

