package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.nbody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForceNBody extends Force {
  
  var distanceMax: js.UndefOr[Double | SignalRef] = js.native
  
  var distanceMin: js.UndefOr[Double | SignalRef] = js.native
  
  var force: nbody = js.native
  
  var strength: js.UndefOr[Double | SignalRef] = js.native
  
  var theta: js.UndefOr[Double | SignalRef] = js.native
}
object ForceNBody {
  
  @scala.inline
  def apply(force: nbody): ForceNBody = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceNBody]
  }
  
  @scala.inline
  implicit class ForceNBodyOps[Self <: ForceNBody] (val x: Self) extends AnyVal {
    
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
    def setForce(value: nbody): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceMax(value: Double | SignalRef): Self = this.set("distanceMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistanceMax: Self = this.set("distanceMax", js.undefined)
    
    @scala.inline
    def setDistanceMin(value: Double | SignalRef): Self = this.set("distanceMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistanceMin: Self = this.set("distanceMin", js.undefined)
    
    @scala.inline
    def setStrength(value: Double | SignalRef): Self = this.set("strength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrength: Self = this.set("strength", js.undefined)
    
    @scala.inline
    def setTheta(value: Double | SignalRef): Self = this.set("theta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheta: Self = this.set("theta", js.undefined)
  }
}
