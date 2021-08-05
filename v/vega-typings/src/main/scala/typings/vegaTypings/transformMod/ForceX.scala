package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.x
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceX
  extends StObject
     with Force {
  
  var force: x
  
  var strength: js.UndefOr[Double | SignalRef] = js.undefined
  
  var x: js.UndefOr[FieldRef] = js.undefined
}
object ForceX {
  
  inline def apply(): ForceX = {
    val __obj = js.Dynamic.literal(force = "x")
    __obj.asInstanceOf[ForceX]
  }
  
  extension [Self <: ForceX](x: Self) {
    
    inline def setForce(value: typings.vegaTypings.vegaTypingsStrings.x): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setStrength(value: Double | SignalRef): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    inline def setStrengthUndefined: Self = StObject.set(x, "strength", js.undefined)
    
    inline def setX(value: FieldRef): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
