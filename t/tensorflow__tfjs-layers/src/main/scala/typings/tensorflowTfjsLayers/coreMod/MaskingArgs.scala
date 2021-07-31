package typings.tensorflowTfjsLayers.coreMod

import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaskingArgs
  extends StObject
     with LayerArgs {
  
  /**
    * Masking Value. Defaults to `0.0`.
    */
  var maskValue: js.UndefOr[Double] = js.undefined
}
object MaskingArgs {
  
  @scala.inline
  def apply(): MaskingArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaskingArgs]
  }
  
  @scala.inline
  implicit class MaskingArgsMutableBuilder[Self <: MaskingArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaskValue(value: Double): Self = StObject.set(x, "maskValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskValueUndefined: Self = StObject.set(x, "maskValue", js.undefined)
  }
}
