package typings.vegaTypings.transformMod

import typings.vegaTypings.exprMod.ExprRef
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForceLink extends Force {
  var distance: js.UndefOr[Double | SignalRef | ExprRef] = js.native
  var force: link = js.native
  var id: js.UndefOr[FieldRef] = js.native
  var iterations: js.UndefOr[Double | SignalRef] = js.native
  var links: js.UndefOr[DataName] = js.native
  var strength: js.UndefOr[Double | SignalRef | ExprRef] = js.native
}

object ForceLink {
  @scala.inline
  def apply(force: link): ForceLink = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceLink]
  }
  @scala.inline
  implicit class ForceLinkOps[Self <: ForceLink] (val x: Self) extends AnyVal {
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
    def setForce(value: link): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistance(value: Double | SignalRef | ExprRef): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    @scala.inline
    def setId(value: FieldRef): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIterations(value: Double | SignalRef): Self = this.set("iterations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIterations: Self = this.set("iterations", js.undefined)
    @scala.inline
    def setLinks(value: DataName): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    @scala.inline
    def setStrength(value: Double | SignalRef | ExprRef): Self = this.set("strength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrength: Self = this.set("strength", js.undefined)
  }
  
}

