package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.center
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForceCenter extends Force {
  
  var force: center = js.native
  
  var x: js.UndefOr[Double | SignalRef] = js.native
  
  var y: js.UndefOr[Double | SignalRef] = js.native
}
object ForceCenter {
  
  @scala.inline
  def apply(force: center): ForceCenter = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
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
