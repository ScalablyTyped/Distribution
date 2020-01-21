package typings.uuid

import typings.uuid.interfacesMod.InputBuffer
import typings.uuid.interfacesMod.V4Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRng extends V4Options {
  def rng(): InputBuffer
}

object AnonRng {
  @scala.inline
  def apply(rng: () => InputBuffer): AnonRng = {
    val __obj = js.Dynamic.literal(rng = js.Any.fromFunction0(rng))
  
    __obj.asInstanceOf[AnonRng]
  }
}

