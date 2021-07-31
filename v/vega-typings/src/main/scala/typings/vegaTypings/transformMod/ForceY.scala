package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceY
  extends StObject
     with Force {
  
  var force: y
  
  var strength: js.UndefOr[Double | SignalRef] = js.undefined
  
  var y: js.UndefOr[FieldRef] = js.undefined
}
object ForceY {
  
  @scala.inline
  def apply(): ForceY = {
    val __obj = js.Dynamic.literal(force = "y")
    __obj.asInstanceOf[ForceY]
  }
  
  @scala.inline
  implicit class ForceYMutableBuilder[Self <: ForceY] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForce(value: y): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrength(value: Double | SignalRef): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrengthUndefined: Self = StObject.set(x, "strength", js.undefined)
    
    @scala.inline
    def setY(value: FieldRef): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
