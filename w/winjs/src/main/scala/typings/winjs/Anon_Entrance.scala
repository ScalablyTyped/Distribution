package typings.winjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Entrance extends js.Object {
  var entrance: js.Function
  var exit: js.Function
}

object Anon_Entrance {
  @scala.inline
  def apply(entrance: js.Function, exit: js.Function): Anon_Entrance = {
    val __obj = js.Dynamic.literal(entrance = entrance, exit = exit)
  
    __obj.asInstanceOf[Anon_Entrance]
  }
}

