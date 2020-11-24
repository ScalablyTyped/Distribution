package typings.vegaTypings.transformMod

import typings.vegaTypings.exprMod.ExprRef
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.collide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForceCollide extends Force {
  
  var force: collide = js.native
  
  var iterations: js.UndefOr[Double | SignalRef] = js.native
  
  var radius: js.UndefOr[Double | SignalRef | ExprRef] = js.native
  
  var strength: js.UndefOr[Double | SignalRef] = js.native
}
object ForceCollide {
  
  @scala.inline
  def apply(force: collide): ForceCollide = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceCollide]
  }
  
  @scala.inline
  implicit class ForceCollideOps[Self <: ForceCollide] (val x: Self) extends AnyVal {
    
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
    def setForce(value: collide): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterations(value: Double | SignalRef): Self = this.set("iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIterations: Self = this.set("iterations", js.undefined)
    
    @scala.inline
    def setRadius(value: Double | SignalRef | ExprRef): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setStrength(value: Double | SignalRef): Self = this.set("strength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrength: Self = this.set("strength", js.undefined)
  }
}
