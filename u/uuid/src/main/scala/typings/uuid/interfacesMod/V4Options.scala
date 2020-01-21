package typings.uuid.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.uuid.AnonRandom
  - typings.uuid.AnonRng
*/
trait V4Options extends js.Object

object V4Options {
  @scala.inline
  def AnonRandom(random: InputBuffer): V4Options = {
    val __obj = js.Dynamic.literal(random = random.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[V4Options]
  }
  @scala.inline
  def AnonRng(rng: () => InputBuffer): V4Options = {
    val __obj = js.Dynamic.literal(rng = js.Any.fromFunction0(rng))
  
    __obj.asInstanceOf[V4Options]
  }
}

