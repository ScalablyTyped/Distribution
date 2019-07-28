package typings.ydnDashDb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Push extends js.Object {
  def push(value: js.Any): Unit
}

object Anon_Push {
  @scala.inline
  def apply(push: js.Any => Unit): Anon_Push = {
    val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push))
  
    __obj.asInstanceOf[Anon_Push]
  }
}

