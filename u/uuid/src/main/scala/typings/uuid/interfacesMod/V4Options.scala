package typings.uuid.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.uuid.interfacesMod.RandomOptions
  - typings.uuid.interfacesMod.RngOptions
*/
trait V4Options extends js.Object

object V4Options {
  @scala.inline
  def RandomOptions(random: InputBuffer = null): V4Options = {
    val __obj = js.Dynamic.literal()
    if (random != null) __obj.updateDynamic("random")(random.asInstanceOf[js.Any])
    __obj.asInstanceOf[V4Options]
  }
  @scala.inline
  def RngOptions(rng: () => InputBuffer = null): V4Options = {
    val __obj = js.Dynamic.literal()
    if (rng != null) __obj.updateDynamic("rng")(js.Any.fromFunction0(rng))
    __obj.asInstanceOf[V4Options]
  }
}

