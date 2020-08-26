package typings.wordpressDate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AM extends js.Object {
  var AM: String = js.native
  var PM: String = js.native
  var am: String = js.native
  var pm: String = js.native
}

object AM {
  @scala.inline
  def apply(AM: String, PM: String, am: String, pm: String): AM = {
    val __obj = js.Dynamic.literal(AM = AM.asInstanceOf[js.Any], PM = PM.asInstanceOf[js.Any], am = am.asInstanceOf[js.Any], pm = pm.asInstanceOf[js.Any])
    __obj.asInstanceOf[AM]
  }
  @scala.inline
  implicit class AMOps[Self <: AM] (val x: Self) extends AnyVal {
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
    def setAM(value: String): Self = this.set("AM", value.asInstanceOf[js.Any])
    @scala.inline
    def setPM(value: String): Self = this.set("PM", value.asInstanceOf[js.Any])
  }
  
}

