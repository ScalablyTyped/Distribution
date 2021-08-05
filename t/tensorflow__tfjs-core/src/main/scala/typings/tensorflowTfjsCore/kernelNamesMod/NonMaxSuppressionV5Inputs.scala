package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'boxes' | 'scores'> */
trait NonMaxSuppressionV5Inputs extends StObject {
  
  var boxes: js.UndefOr[js.Any] = js.undefined
  
  var scores: js.UndefOr[js.Any] = js.undefined
}
object NonMaxSuppressionV5Inputs {
  
  inline def apply(): NonMaxSuppressionV5Inputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonMaxSuppressionV5Inputs]
  }
  
  extension [Self <: NonMaxSuppressionV5Inputs](x: Self) {
    
    inline def setBoxes(value: js.Any): Self = StObject.set(x, "boxes", value.asInstanceOf[js.Any])
    
    inline def setBoxesUndefined: Self = StObject.set(x, "boxes", js.undefined)
    
    inline def setScores(value: js.Any): Self = StObject.set(x, "scores", value.asInstanceOf[js.Any])
    
    inline def setScoresUndefined: Self = StObject.set(x, "scores", js.undefined)
  }
}
