package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Positions extends js.Object {
  var dots: js.UndefOr[Double] = js.native
  var duration: String = js.native
  var positions: js.Array[Fret] = js.native
  var stem_direction: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Positions {
  @scala.inline
  def apply(duration: String, positions: js.Array[Fret]): Positions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Positions]
  }
  @scala.inline
  implicit class PositionsOps[Self <: Positions] (val x: Self) extends AnyVal {
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
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setPositionsVarargs(value: Fret*): Self = this.set("positions", js.Array(value :_*))
    @scala.inline
    def setPositions(value: js.Array[Fret]): Self = this.set("positions", value.asInstanceOf[js.Any])
    @scala.inline
    def setDots(value: Double): Self = this.set("dots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDots: Self = this.set("dots", js.undefined)
    @scala.inline
    def setStem_direction(value: Double): Self = this.set("stem_direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStem_direction: Self = this.set("stem_direction", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

