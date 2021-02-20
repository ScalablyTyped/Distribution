package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.nbody
import org.scalablytyped.runtime.StObject
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
  implicit class ForceNBodyMutableBuilder[Self <: ForceNBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistanceMax(value: Double | SignalRef): Self = StObject.set(x, "distanceMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceMaxUndefined: Self = StObject.set(x, "distanceMax", js.undefined)
    
    @scala.inline
    def setDistanceMin(value: Double | SignalRef): Self = StObject.set(x, "distanceMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceMinUndefined: Self = StObject.set(x, "distanceMin", js.undefined)
    
    @scala.inline
    def setForce(value: nbody): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrength(value: Double | SignalRef): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrengthUndefined: Self = StObject.set(x, "strength", js.undefined)
    
    @scala.inline
    def setTheta(value: Double | SignalRef): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThetaUndefined: Self = StObject.set(x, "theta", js.undefined)
  }
}
