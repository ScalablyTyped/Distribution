package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tapeMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/tape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def backpropagateGradients(
    tensorAccumulatedGradientMap: NumberDictionary[Tensor[Rank]],
    filteredTape: js.Array[TapeNode],
    tidy: js.Function1[/* f */ js.Function, Tensor[Rank]],
    add: js.Function2[/* a */ Tensor[Rank], /* b */ Tensor[Rank], Tensor[Rank]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("backpropagateGradients")(tensorAccumulatedGradientMap.asInstanceOf[js.Any], filteredTape.asInstanceOf[js.Any], tidy.asInstanceOf[js.Any], add.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getFilteredNodesXToY(tape: js.Array[TapeNode], xs: js.Array[Tensor[Rank]], y: Tensor[Rank]): js.Array[TapeNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilteredNodesXToY")(tape.asInstanceOf[js.Any], xs.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Array[TapeNode]]
  
  type NamedGradientMap = StringDictionary[js.Function0[Tensor[Rank]]]
  
  trait TapeNode extends StObject {
    
    var gradient: js.UndefOr[js.Function1[/* dys */ js.Array[Tensor[Rank]], NamedGradientMap]] = js.undefined
    
    var id: Double
    
    var inputs: NamedTensorMap
    
    var kernelName: String
    
    var outputs: js.Array[Tensor[Rank]]
    
    var saved: js.UndefOr[js.Array[Tensor[Rank]]] = js.undefined
  }
  object TapeNode {
    
    inline def apply(id: Double, inputs: NamedTensorMap, kernelName: String, outputs: js.Array[Tensor[Rank]]): TapeNode = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], kernelName = kernelName.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
      __obj.asInstanceOf[TapeNode]
    }
    
    extension [Self <: TapeNode](x: Self) {
      
      inline def setGradient(value: /* dys */ js.Array[Tensor[Rank]] => NamedGradientMap): Self = StObject.set(x, "gradient", js.Any.fromFunction1(value))
      
      inline def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInputs(value: NamedTensorMap): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setKernelName(value: String): Self = StObject.set(x, "kernelName", value.asInstanceOf[js.Any])
      
      inline def setOutputs(value: js.Array[Tensor[Rank]]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      inline def setOutputsVarargs(value: Tensor[Rank]*): Self = StObject.set(x, "outputs", js.Array(value*))
      
      inline def setSaved(value: js.Array[Tensor[Rank]]): Self = StObject.set(x, "saved", value.asInstanceOf[js.Any])
      
      inline def setSavedUndefined: Self = StObject.set(x, "saved", js.undefined)
      
      inline def setSavedVarargs(value: Tensor[Rank]*): Self = StObject.set(x, "saved", js.Array(value*))
    }
  }
}
