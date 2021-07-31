package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'boxes' | 'scores'> */
trait NonMaxSuppressionV3Inputs extends StObject {
  
  var boxes: js.UndefOr[js.Any] = js.undefined
  
  var scores: js.UndefOr[js.Any] = js.undefined
}
object NonMaxSuppressionV3Inputs {
  
  @scala.inline
  def apply(): NonMaxSuppressionV3Inputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonMaxSuppressionV3Inputs]
  }
  
  @scala.inline
  implicit class NonMaxSuppressionV3InputsMutableBuilder[Self <: NonMaxSuppressionV3Inputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoxes(value: js.Any): Self = StObject.set(x, "boxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxesUndefined: Self = StObject.set(x, "boxes", js.undefined)
    
    @scala.inline
    def setScores(value: js.Any): Self = StObject.set(x, "scores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoresUndefined: Self = StObject.set(x, "scores", js.undefined)
  }
}
