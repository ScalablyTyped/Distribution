package typings.tensorflowTfjsLayers.coreMod

import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReshapeLayerArgs
  extends StObject
     with LayerArgs {
  
  /** The target shape. Does not include the batch axis. */
  var targetShape: Shape
}
object ReshapeLayerArgs {
  
  @scala.inline
  def apply(targetShape: Shape): ReshapeLayerArgs = {
    val __obj = js.Dynamic.literal(targetShape = targetShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReshapeLayerArgs]
  }
  
  @scala.inline
  implicit class ReshapeLayerArgsMutableBuilder[Self <: ReshapeLayerArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetShape(value: Shape): Self = StObject.set(x, "targetShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetShapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "targetShape", js.Array(value :_*))
  }
}
