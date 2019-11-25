package typings.uuid

import typings.uuid.interfacesMod.InputBuffer
import typings.uuid.interfacesMod.V4Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Random extends V4Options {
  var random: InputBuffer
}

object Anon_Random {
  @scala.inline
  def apply(random: InputBuffer): Anon_Random = {
    val __obj = js.Dynamic.literal(random = random.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Random]
  }
}

