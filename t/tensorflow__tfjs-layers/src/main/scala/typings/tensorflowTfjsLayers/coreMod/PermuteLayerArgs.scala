package typings.tensorflowTfjsLayers.coreMod

import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermuteLayerArgs extends LayerArgs {
  
  /**
    * Array of integers. Permutation pattern. Does not include the
    * sample (batch) dimension. Index starts at 1.
    * For instance, `[2, 1]` permutes the first and second dimensions
    * of the input.
    */
  var dims: js.Array[Double] = js.native
}
object PermuteLayerArgs {
  
  @scala.inline
  def apply(dims: js.Array[Double]): PermuteLayerArgs = {
    val __obj = js.Dynamic.literal(dims = dims.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermuteLayerArgs]
  }
  
  @scala.inline
  implicit class PermuteLayerArgsMutableBuilder[Self <: PermuteLayerArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDims(value: js.Array[Double]): Self = StObject.set(x, "dims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimsVarargs(value: Double*): Self = StObject.set(x, "dims", js.Array(value :_*))
  }
}
