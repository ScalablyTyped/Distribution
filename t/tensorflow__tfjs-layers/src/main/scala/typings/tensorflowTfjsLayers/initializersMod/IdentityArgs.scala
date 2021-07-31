package typings.tensorflowTfjsLayers.initializersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityArgs extends StObject {
  
  /**
    * Multiplicative factor to apply to the identity matrix.
    */
  var gain: js.UndefOr[Double] = js.undefined
}
object IdentityArgs {
  
  @scala.inline
  def apply(): IdentityArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityArgs]
  }
  
  @scala.inline
  implicit class IdentityArgsMutableBuilder[Self <: IdentityArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGain(value: Double): Self = StObject.set(x, "gain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGainUndefined: Self = StObject.set(x, "gain", js.undefined)
  }
}
