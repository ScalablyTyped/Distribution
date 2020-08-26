package typings.winjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entrance extends js.Object {
  var entrance: js.Function = js.native
  var exit: js.Function = js.native
}

object Entrance {
  @scala.inline
  def apply(entrance: js.Function, exit: js.Function): Entrance = {
    val __obj = js.Dynamic.literal(entrance = entrance.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entrance]
  }
  @scala.inline
  implicit class EntranceOps[Self <: Entrance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEntrance(value: js.Function): Self = this.set("entrance", value.asInstanceOf[js.Any])
    @scala.inline
    def setExit(value: js.Function): Self = this.set("exit", value.asInstanceOf[js.Any])
  }
  
}

