package typings.vegaTypings

import typings.vegaTypings.onEventsMod._EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScaleString extends _EventListener {
  var scale: String
}

object AnonScaleString {
  @scala.inline
  def apply(scale: String): AnonScaleString = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScaleString]
  }
}

