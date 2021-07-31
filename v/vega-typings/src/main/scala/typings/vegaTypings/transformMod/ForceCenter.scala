package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
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
  
  @scala.inline
  def apply(): ForceCenter = {
    val __obj = js.Dynamic.literal(force = "center")
    __obj.asInstanceOf[ForceCenter]
  }
  
  @scala.inline
  implicit class ForceCenterMutableBuilder[Self <: ForceCenter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForce(value: center): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double | SignalRef): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double | SignalRef): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
