package typings.vegaTypings.typesSpecTransformMod

import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.center
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceCenter
  extends StObject
     with Force {
  
  var force: center
  
  var x: js.UndefOr[Double | SignalRef] = js.undefined
  
  var y: js.UndefOr[Double | SignalRef] = js.undefined
}
object ForceCenter {
  
  inline def apply(): ForceCenter = {
    val __obj = js.Dynamic.literal(force = "center")
    __obj.asInstanceOf[ForceCenter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForceCenter] (val x: Self) extends AnyVal {
    
    inline def setForce(value: center): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double | SignalRef): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double | SignalRef): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
