package typings.vexflow.anon

import typings.vexflow.Vex.Flow.Fraction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Beammiddleonly extends js.Object {
  var beam_middle_only: js.UndefOr[Boolean] = js.native
  var beam_rests: js.UndefOr[Boolean] = js.native
  var groups: js.UndefOr[js.Array[Fraction]] = js.native
  var maintain_stem_directions: js.UndefOr[Boolean] = js.native
  var show_stemlets: js.UndefOr[Boolean] = js.native
  var stem_direction: js.UndefOr[Double] = js.native
}

object Beammiddleonly {
  @scala.inline
  def apply(): Beammiddleonly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Beammiddleonly]
  }
  @scala.inline
  implicit class BeammiddleonlyOps[Self <: Beammiddleonly] (val x: Self) extends AnyVal {
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
    def setBeam_middle_only(value: Boolean): Self = this.set("beam_middle_only", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeam_middle_only: Self = this.set("beam_middle_only", js.undefined)
    @scala.inline
    def setBeam_rests(value: Boolean): Self = this.set("beam_rests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeam_rests: Self = this.set("beam_rests", js.undefined)
    @scala.inline
    def setGroupsVarargs(value: Fraction*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[Fraction]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    @scala.inline
    def setMaintain_stem_directions(value: Boolean): Self = this.set("maintain_stem_directions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaintain_stem_directions: Self = this.set("maintain_stem_directions", js.undefined)
    @scala.inline
    def setShow_stemlets(value: Boolean): Self = this.set("show_stemlets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow_stemlets: Self = this.set("show_stemlets", js.undefined)
    @scala.inline
    def setStem_direction(value: Double): Self = this.set("stem_direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStem_direction: Self = this.set("stem_direction", js.undefined)
  }
  
}

