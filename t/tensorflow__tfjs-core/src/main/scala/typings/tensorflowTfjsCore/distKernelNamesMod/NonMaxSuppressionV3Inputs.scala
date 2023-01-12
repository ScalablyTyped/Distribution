package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'boxes' | 'scores'> */
trait NonMaxSuppressionV3Inputs extends StObject {
  
  var boxes: js.UndefOr[scala.Any] = js.undefined
  
  var scores: js.UndefOr[scala.Any] = js.undefined
}
object NonMaxSuppressionV3Inputs {
  
  inline def apply(): NonMaxSuppressionV3Inputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonMaxSuppressionV3Inputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NonMaxSuppressionV3Inputs] (val x: Self) extends AnyVal {
    
    inline def setBoxes(value: scala.Any): Self = StObject.set(x, "boxes", value.asInstanceOf[js.Any])
    
    inline def setBoxesUndefined: Self = StObject.set(x, "boxes", js.undefined)
    
    inline def setScores(value: scala.Any): Self = StObject.set(x, "scores", value.asInstanceOf[js.Any])
    
    inline def setScoresUndefined: Self = StObject.set(x, "scores", js.undefined)
  }
}
