package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bpm extends js.Object {
  var bpm: Double = js.native
  var dots: Double = js.native
  var duration: String = js.native
  var name: js.UndefOr[String] = js.native
}

object Bpm {
  @scala.inline
  def apply(bpm: Double, dots: Double, duration: String): Bpm = {
    val __obj = js.Dynamic.literal(bpm = bpm.asInstanceOf[js.Any], dots = dots.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bpm]
  }
  @scala.inline
  implicit class BpmOps[Self <: Bpm] (val x: Self) extends AnyVal {
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
    def setBpm(value: Double): Self = this.set("bpm", value.asInstanceOf[js.Any])
    @scala.inline
    def setDots(value: Double): Self = this.set("dots", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

