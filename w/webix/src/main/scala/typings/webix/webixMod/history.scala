package typings.webix.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait history extends js.Object {
  def push(view: String, url: String, value: js.Any): Unit
  def track(view: String, url: String): Unit
}

object history {
  @scala.inline
  def apply(push: (String, String, js.Any) => Unit, track: (String, String) => Unit): history = {
    val __obj = js.Dynamic.literal(push = js.Any.fromFunction3(push), track = js.Any.fromFunction2(track))
  
    __obj.asInstanceOf[history]
  }
}

