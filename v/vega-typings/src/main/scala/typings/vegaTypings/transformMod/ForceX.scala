package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.x
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForceX extends Force {
  
  var force: x = js.native
  
  var strength: js.UndefOr[Double | SignalRef] = js.native
  
  var x: js.UndefOr[FieldRef] = js.native
}
object ForceX {
  
  @scala.inline
  def apply(force: x): ForceX = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceX]
  }
  
  @scala.inline
  implicit class ForceXMutableBuilder[Self <: ForceX] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForce(value: typings.vegaTypings.vegaTypingsStrings.x): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrength(value: Double | SignalRef): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrengthUndefined: Self = StObject.set(x, "strength", js.undefined)
    
    @scala.inline
    def setX(value: FieldRef): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
