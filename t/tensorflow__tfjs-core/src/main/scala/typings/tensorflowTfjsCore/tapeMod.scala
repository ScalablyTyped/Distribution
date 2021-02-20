package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tapeMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/tape", "backpropagateGradients")
  @js.native
  def backpropagateGradients(
    tensorAccumulatedGradientMap: NumberDictionary[Tensor[Rank]],
    filteredTape: js.Array[TapeNode],
    tidy: js.Function1[/* f */ js.Function, Tensor[Rank]],
    add: js.Function2[/* a */ Tensor[Rank], /* b */ Tensor[Rank], Tensor[Rank]]
  ): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/tape", "getFilteredNodesXToY")
  @js.native
  def getFilteredNodesXToY(tape: js.Array[TapeNode], xs: js.Array[Tensor[Rank]], y: Tensor[Rank]): js.Array[TapeNode] = js.native
  
  type NamedGradientMap = StringDictionary[js.Function0[Tensor[Rank]]]
  
  @js.native
  trait TapeNode extends StObject {
    
    var gradient: js.UndefOr[js.Function1[/* dys */ js.Array[Tensor[Rank]], NamedGradientMap]] = js.native
    
    var id: Double = js.native
    
    var inputs: NamedTensorMap = js.native
    
    var kernelName: String = js.native
    
    var outputs: js.Array[Tensor[Rank]] = js.native
    
    var saved: js.UndefOr[js.Array[Tensor[Rank]]] = js.native
  }
  object TapeNode {
    
    @scala.inline
    def apply(id: Double, inputs: NamedTensorMap, kernelName: String, outputs: js.Array[Tensor[Rank]]): TapeNode = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], kernelName = kernelName.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
      __obj.asInstanceOf[TapeNode]
    }
    
    @scala.inline
    implicit class TapeNodeMutableBuilder[Self <: TapeNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGradient(value: /* dys */ js.Array[Tensor[Rank]] => NamedGradientMap): Self = StObject.set(x, "gradient", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputs(value: NamedTensorMap): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelName(value: String): Self = StObject.set(x, "kernelName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputs(value: js.Array[Tensor[Rank]]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputsVarargs(value: Tensor[Rank]*): Self = StObject.set(x, "outputs", js.Array(value :_*))
      
      @scala.inline
      def setSaved(value: js.Array[Tensor[Rank]]): Self = StObject.set(x, "saved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSavedUndefined: Self = StObject.set(x, "saved", js.undefined)
      
      @scala.inline
      def setSavedVarargs(value: Tensor[Rank]*): Self = StObject.set(x, "saved", js.Array(value :_*))
    }
  }
}
