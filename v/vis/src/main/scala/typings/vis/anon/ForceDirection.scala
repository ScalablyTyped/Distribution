package typings.vis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForceDirection extends js.Object {
  var enabled: Boolean = js.native
  var forceDirection: js.UndefOr[String | Boolean] = js.native
  var roundness: Double = js.native
  var `type`: String = js.native
}

object ForceDirection {
  @scala.inline
  def apply(enabled: Boolean, roundness: Double, `type`: String): ForceDirection = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], roundness = roundness.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceDirection]
  }
  @scala.inline
  implicit class ForceDirectionOps[Self <: ForceDirection] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoundness(value: Double): Self = this.set("roundness", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setForceDirection(value: String | Boolean): Self = this.set("forceDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceDirection: Self = this.set("forceDirection", js.undefined)
  }
  
}

