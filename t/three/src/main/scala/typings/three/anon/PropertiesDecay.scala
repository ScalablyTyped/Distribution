package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertiesDecay extends js.Object {
  var properties: Decay
  var value: js.Array[_]
}

object PropertiesDecay {
  @scala.inline
  def apply(properties: Decay, value: js.Array[_]): PropertiesDecay = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesDecay]
  }
}

