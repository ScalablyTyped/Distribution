package typings.vegaTypings.transformMod

import typings.vegaTypings.exprMod.ExprRef
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.collide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceCollide
  extends StObject
     with Force {
  
  var force: collide
  
  var iterations: js.UndefOr[Double | SignalRef] = js.undefined
  
  var radius: js.UndefOr[Double | SignalRef | ExprRef] = js.undefined
  
  var strength: js.UndefOr[Double | SignalRef] = js.undefined
}
object ForceCollide {
  
  @scala.inline
  def apply(): ForceCollide = {
    val __obj = js.Dynamic.literal(force = "collide")
    __obj.asInstanceOf[ForceCollide]
  }
  
  @scala.inline
  implicit class ForceCollideMutableBuilder[Self <: ForceCollide] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForce(value: collide): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterations(value: Double | SignalRef): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
    
    @scala.inline
    def setRadius(value: Double | SignalRef | ExprRef): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setStrength(value: Double | SignalRef): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrengthUndefined: Self = StObject.set(x, "strength", js.undefined)
  }
}
