package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'boxes' | 'scores'> */
trait NonMaxSuppressionV4Inputs extends StObject {
  
  var boxes: js.UndefOr[scala.Any] = js.undefined
  
  var scores: js.UndefOr[scala.Any] = js.undefined
}
object NonMaxSuppressionV4Inputs {
  
  inline def apply(): NonMaxSuppressionV4Inputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonMaxSuppressionV4Inputs]
  }
  
  extension [Self <: NonMaxSuppressionV4Inputs](x: Self) {
    
    inline def setBoxes(value: scala.Any): Self = StObject.set(x, "boxes", value.asInstanceOf[js.Any])
    
    inline def setBoxesUndefined: Self = StObject.set(x, "boxes", js.undefined)
    
    inline def setScores(value: scala.Any): Self = StObject.set(x, "scores", value.asInstanceOf[js.Any])
    
    inline def setScoresUndefined: Self = StObject.set(x, "scores", js.undefined)
  }
}
