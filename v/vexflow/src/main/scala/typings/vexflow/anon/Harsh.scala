package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Harsh extends js.Object {
  var harsh: Boolean = js.native
  var wave_girth: Double = js.native
  var wave_height: Double = js.native
  var wave_width: Double = js.native
}

object Harsh {
  @scala.inline
  def apply(harsh: Boolean, wave_girth: Double, wave_height: Double, wave_width: Double): Harsh = {
    val __obj = js.Dynamic.literal(harsh = harsh.asInstanceOf[js.Any], wave_girth = wave_girth.asInstanceOf[js.Any], wave_height = wave_height.asInstanceOf[js.Any], wave_width = wave_width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Harsh]
  }
  @scala.inline
  implicit class HarshOps[Self <: Harsh] (val x: Self) extends AnyVal {
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
    def setHarsh(value: Boolean): Self = this.set("harsh", value.asInstanceOf[js.Any])
    @scala.inline
    def setWave_girth(value: Double): Self = this.set("wave_girth", value.asInstanceOf[js.Any])
    @scala.inline
    def setWave_height(value: Double): Self = this.set("wave_height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWave_width(value: Double): Self = this.set("wave_width", value.asInstanceOf[js.Any])
  }
  
}

