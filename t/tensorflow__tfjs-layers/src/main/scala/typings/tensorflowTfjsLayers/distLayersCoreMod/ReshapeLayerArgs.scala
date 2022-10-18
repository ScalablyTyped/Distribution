package typings.tensorflowTfjsLayers.distLayersCoreMod

import typings.tensorflowTfjsLayers.distEngineTopologyMod.LayerArgs
import typings.tensorflowTfjsLayers.distKerasFormatCommonMod.Shape
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
  
  inline def apply(targetShape: Shape): ReshapeLayerArgs = {
    val __obj = js.Dynamic.literal(targetShape = targetShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReshapeLayerArgs]
  }
  
  extension [Self <: ReshapeLayerArgs](x: Self) {
    
    inline def setTargetShape(value: Shape): Self = StObject.set(x, "targetShape", value.asInstanceOf[js.Any])
    
    inline def setTargetShapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "targetShape", js.Array(value*))
  }
}
