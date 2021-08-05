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
  
  inline def apply(): ForceY = {
    val __obj = js.Dynamic.literal(force = "y")
    __obj.asInstanceOf[ForceY]
  }
  
  extension [Self <: ForceY](x: Self) {
    
    inline def setForce(value: y): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setStrength(value: Double | SignalRef): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    inline def setStrengthUndefined: Self = StObject.set(x, "strength", js.undefined)
    
    inline def setY(value: FieldRef): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
