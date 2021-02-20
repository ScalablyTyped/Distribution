package typings.tensorflowTfjsLayers.recurrentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RNNLayerArgs extends BaseRNNLayerArgs {
  
  @JSName("cell")
  var cell_RNNLayerArgs: RNNCell | js.Array[RNNCell] = js.native
}
object RNNLayerArgs {
  
  @scala.inline
  def apply(cell: RNNCell | js.Array[RNNCell]): RNNLayerArgs = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any])
    __obj.asInstanceOf[RNNLayerArgs]
  }
  
  @scala.inline
  implicit class RNNLayerArgsMutableBuilder[Self <: RNNLayerArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCell(value: RNNCell | js.Array[RNNCell]): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellVarargs(value: RNNCell*): Self = StObject.set(x, "cell", js.Array(value :_*))
  }
}
