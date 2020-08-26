package typings.uirouterCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NOWAIT extends js.Object {
  var NOWAIT: String = js.native
  var WAIT: String = js.native
}

object NOWAIT {
  @scala.inline
  def apply(NOWAIT: String, WAIT: String): NOWAIT = {
    val __obj = js.Dynamic.literal(NOWAIT = NOWAIT.asInstanceOf[js.Any], WAIT = WAIT.asInstanceOf[js.Any])
    __obj.asInstanceOf[NOWAIT]
  }
  @scala.inline
  implicit class NOWAITOps[Self <: NOWAIT] (val x: Self) extends AnyVal {
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
    def setNOWAIT(value: String): Self = this.set("NOWAIT", value.asInstanceOf[js.Any])
    @scala.inline
    def setWAIT(value: String): Self = this.set("WAIT", value.asInstanceOf[js.Any])
  }
  
}

