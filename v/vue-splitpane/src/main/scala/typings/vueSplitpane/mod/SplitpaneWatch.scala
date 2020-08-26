package typings.vueSplitpane.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitpaneWatch extends js.Object {
  def defaultPercent(`val`: js.Any): Unit = js.native
}

object SplitpaneWatch {
  @scala.inline
  def apply(defaultPercent: js.Any => Unit): SplitpaneWatch = {
    val __obj = js.Dynamic.literal(defaultPercent = js.Any.fromFunction1(defaultPercent))
    __obj.asInstanceOf[SplitpaneWatch]
  }
  @scala.inline
  implicit class SplitpaneWatchOps[Self <: SplitpaneWatch] (val x: Self) extends AnyVal {
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
    def setDefaultPercent(value: js.Any => Unit): Self = this.set("defaultPercent", js.Any.fromFunction1(value))
  }
  
}

