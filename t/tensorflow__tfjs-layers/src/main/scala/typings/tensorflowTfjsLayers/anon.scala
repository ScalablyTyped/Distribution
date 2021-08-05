package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.baseCallbacksMod.History
import typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CallbackList extends StObject {
    
    var callbackList: typings.tensorflowTfjsLayers.baseCallbacksMod.CallbackList
    
    var history: History
  }
  object CallbackList {
    
    inline def apply(callbackList: typings.tensorflowTfjsLayers.baseCallbacksMod.CallbackList, history: History): CallbackList = {
      val __obj = js.Dynamic.literal(callbackList = callbackList.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallbackList]
    }
    
    extension [Self <: CallbackList](x: Self) {
      
      inline def setCallbackList(value: typings.tensorflowTfjsLayers.baseCallbacksMod.CallbackList): Self = StObject.set(x, "callbackList", value.asInstanceOf[js.Any])
      
      inline def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    }
  }
  
  trait Constants extends StObject {
    
    var constants: js.Array[SymbolicTensor | Tensor[Rank]]
    
    var initialState: js.Array[SymbolicTensor | Tensor[Rank]]
    
    var inputs: Tensor[Rank] | SymbolicTensor
  }
  object Constants {
    
    inline def apply(
      constants: js.Array[SymbolicTensor | Tensor[Rank]],
      initialState: js.Array[SymbolicTensor | Tensor[Rank]],
      inputs: Tensor[Rank] | SymbolicTensor
    ): Constants = {
      val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], initialState = initialState.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constants]
    }
    
    extension [Self <: Constants](x: Self) {
      
      inline def setConstants(value: js.Array[SymbolicTensor | Tensor[Rank]]): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
      
      inline def setConstantsVarargs(value: (SymbolicTensor | Tensor[Rank])*): Self = StObject.set(x, "constants", js.Array(value :_*))
      
      inline def setInitialState(value: js.Array[SymbolicTensor | Tensor[Rank]]): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateVarargs(value: (SymbolicTensor | Tensor[Rank])*): Self = StObject.set(x, "initialState", js.Array(value :_*))
      
      inline def setInputs(value: Tensor[Rank] | SymbolicTensor): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    }
  }
  
  trait Count extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    def ones(): Tensor[Rank]
    
    var rate: Double
    
    var training: js.UndefOr[Boolean] = js.undefined
  }
  object Count {
    
    inline def apply(ones: () => Tensor[Rank], rate: Double): Count = {
      val __obj = js.Dynamic.literal(ones = js.Any.fromFunction0(ones), rate = rate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Count]
    }
    
    extension [Self <: Count](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setOnes(value: () => Tensor[Rank]): Self = StObject.set(x, "ones", js.Any.fromFunction0(value))
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setTraining(value: Boolean): Self = StObject.set(x, "training", value.asInstanceOf[js.Any])
      
      inline def setTrainingUndefined: Self = StObject.set(x, "training", js.undefined)
    }
  }
  
  trait MaskValue extends StObject {
    
    var maskValue: Double
  }
  object MaskValue {
    
    inline def apply(maskValue: Double): MaskValue = {
      val __obj = js.Dynamic.literal(maskValue = maskValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaskValue]
    }
    
    extension [Self <: MaskValue](x: Self) {
      
      inline def setMaskValue(value: Double): Self = StObject.set(x, "maskValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rate extends StObject {
    
    var rate: Double
  }
  object Rate {
    
    inline def apply(rate: Double): Rate = {
      val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rate]
    }
    
    extension [Self <: Rate](x: Self) {
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    }
  }
  
  trait RecipientMap extends StObject {
    
    var recipientMap: typings.tensorflowTfjsLayers.executorMod.RecipientMap
    
    var sorted: js.Array[SymbolicTensor]
  }
  object RecipientMap {
    
    inline def apply(
      recipientMap: typings.tensorflowTfjsLayers.executorMod.RecipientMap,
      sorted: js.Array[SymbolicTensor]
    ): RecipientMap = {
      val __obj = js.Dynamic.literal(recipientMap = recipientMap.asInstanceOf[js.Any], sorted = sorted.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecipientMap]
    }
    
    extension [Self <: RecipientMap](x: Self) {
      
      inline def setRecipientMap(value: typings.tensorflowTfjsLayers.executorMod.RecipientMap): Self = StObject.set(x, "recipientMap", value.asInstanceOf[js.Any])
      
      inline def setSorted(value: js.Array[SymbolicTensor]): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
      
      inline def setSortedVarargs(value: SymbolicTensor*): Self = StObject.set(x, "sorted", js.Array(value :_*))
    }
  }
  
  trait Stddev extends StObject {
    
    var stddev: Double
  }
  object Stddev {
    
    inline def apply(stddev: Double): Stddev = {
      val __obj = js.Dynamic.literal(stddev = stddev.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stddev]
    }
    
    extension [Self <: Stddev](x: Self) {
      
      inline def setStddev(value: Double): Self = StObject.set(x, "stddev", value.asInstanceOf[js.Any])
    }
  }
}
