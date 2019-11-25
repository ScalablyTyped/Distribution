package typings.wolfy87DashEventemitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Listener extends js.Object {
  var listener: js.Function
}

object Anon_Listener {
  @scala.inline
  def apply(listener: js.Function): Anon_Listener = {
    val __obj = js.Dynamic.literal(listener = listener.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Listener]
  }
}

