package typings.vegaTypings.anon

import typings.vegaTypings.onEventsMod._EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleString extends _EventListener {
  var scale: String
}

object ScaleString {
  @scala.inline
  def apply(scale: String): ScaleString = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleString]
  }
}

