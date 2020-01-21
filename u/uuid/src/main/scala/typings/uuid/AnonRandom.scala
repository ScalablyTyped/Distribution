package typings.uuid

import typings.uuid.interfacesMod.InputBuffer
import typings.uuid.interfacesMod.V4Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRandom extends V4Options {
  var random: InputBuffer
}

object AnonRandom {
  @scala.inline
  def apply(random: InputBuffer): AnonRandom = {
    val __obj = js.Dynamic.literal(random = random.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRandom]
  }
}

