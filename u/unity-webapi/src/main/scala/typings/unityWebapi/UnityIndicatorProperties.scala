package typings.unityWebapi

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnityIndicatorProperties extends js.Object {
  var count: Double
  var iconURI: String
  var onIndicatorActivated: js.Function
  var time: Date
}

object UnityIndicatorProperties {
  @scala.inline
  def apply(count: Double, iconURI: String, onIndicatorActivated: js.Function, time: Date): UnityIndicatorProperties = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], iconURI = iconURI.asInstanceOf[js.Any], onIndicatorActivated = onIndicatorActivated.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnityIndicatorProperties]
  }
}

