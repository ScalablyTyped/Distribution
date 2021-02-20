package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.activationConfigMod.ActivationSerialization
import typings.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typings.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typings.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GRU
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GRUCell
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LSTM
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LSTMCell
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SimpleRNN
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SimpleRNNCell
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.StackedRNNCells
import typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization
import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import typings.tensorflowTfjsLayers.typesMod.BaseSerialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recurrentSerializationMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/layers/recurrent_serialization", "recurrentLayerClassNames")
  @js.native
  val recurrentLayerClassNames: js.Array[RecurrentLayerClassName] = js.native
  
  @js.native
  trait BaseRNNLayerConfig extends LayerConfig {
    
    var cell: js.UndefOr[RNNCellSerialization | js.Array[RNNCellSerialization]] = js.native
    
    var go_backwards: js.UndefOr[Boolean] = js.native
    
    var input_dim: js.UndefOr[Double] = js.native
    
    var input_length: js.UndefOr[Double] = js.native
    
    var return_sequences: js.UndefOr[Boolean] = js.native
    
    var return_state: js.UndefOr[Boolean] = js.native
    
    var stateful: js.UndefOr[Boolean] = js.native
    
    var unroll: js.UndefOr[Boolean] = js.native
  }
  object BaseRNNLayerConfig {
    
    @scala.inline
    def apply(): BaseRNNLayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseRNNLayerConfig]
    }
    
    @scala.inline
    implicit class BaseRNNLayerConfigMutableBuilder[Self <: BaseRNNLayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCell(value: RNNCellSerialization | js.Array[RNNCellSerialization]): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      @scala.inline
      def setCellVarargs(value: RNNCellSerialization*): Self = StObject.set(x, "cell", js.Array(value :_*))
      
      @scala.inline
      def setGo_backwards(value: Boolean): Self = StObject.set(x, "go_backwards", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGo_backwardsUndefined: Self = StObject.set(x, "go_backwards", js.undefined)
      
      @scala.inline
      def setInput_dim(value: Double): Self = StObject.set(x, "input_dim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput_dimUndefined: Self = StObject.set(x, "input_dim", js.undefined)
      
      @scala.inline
      def setInput_length(value: Double): Self = StObject.set(x, "input_length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput_lengthUndefined: Self = StObject.set(x, "input_length", js.undefined)
      
      @scala.inline
      def setReturn_sequences(value: Boolean): Self = StObject.set(x, "return_sequences", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturn_sequencesUndefined: Self = StObject.set(x, "return_sequences", js.undefined)
      
      @scala.inline
      def setReturn_state(value: Boolean): Self = StObject.set(x, "return_state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturn_stateUndefined: Self = StObject.set(x, "return_state", js.undefined)
      
      @scala.inline
      def setStateful(value: Boolean): Self = StObject.set(x, "stateful", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatefulUndefined: Self = StObject.set(x, "stateful", js.undefined)
      
      @scala.inline
      def setUnroll(value: Boolean): Self = StObject.set(x, "unroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnrollUndefined: Self = StObject.set(x, "unroll", js.undefined)
    }
  }
  
  @js.native
  trait GRUCellConfig extends SimpleRNNCellConfig {
    
    var implementation: js.UndefOr[Double] = js.native
    
    var recurrent_activation: js.UndefOr[String] = js.native
  }
  object GRUCellConfig {
    
    @scala.inline
    def apply(units: Double): GRUCellConfig = {
      val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
      __obj.asInstanceOf[GRUCellConfig]
    }
    
    @scala.inline
    implicit class GRUCellConfigMutableBuilder[Self <: GRUCellConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImplementation(value: Double): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImplementationUndefined: Self = StObject.set(x, "implementation", js.undefined)
      
      @scala.inline
      def setRecurrent_activation(value: String): Self = StObject.set(x, "recurrent_activation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrent_activationUndefined: Self = StObject.set(x, "recurrent_activation", js.undefined)
    }
  }
  
  type GRUCellSerialization = BaseSerialization[GRUCell, GRUCellConfig]
  
  @js.native
  trait GRULayerConfig extends SimpleRNNLayerConfig {
    
    var implementation: js.UndefOr[Double] = js.native
    
    var recurrent_activation: js.UndefOr[ActivationSerialization] = js.native
  }
  object GRULayerConfig {
    
    @scala.inline
    def apply(units: Double): GRULayerConfig = {
      val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
      __obj.asInstanceOf[GRULayerConfig]
    }
    
    @scala.inline
    implicit class GRULayerConfigMutableBuilder[Self <: GRULayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImplementation(value: Double): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImplementationUndefined: Self = StObject.set(x, "implementation", js.undefined)
      
      @scala.inline
      def setRecurrent_activation(value: ActivationSerialization): Self = StObject.set(x, "recurrent_activation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrent_activationUndefined: Self = StObject.set(x, "recurrent_activation", js.undefined)
    }
  }
  
  type GRULayerSerialization = BaseLayerSerialization[GRU, GRULayerConfig]
  
  @js.native
  trait LSTMCellConfig extends SimpleRNNCellConfig {
    
    var implementation: js.UndefOr[Double] = js.native
    
    var recurrent_activation: js.UndefOr[ActivationSerialization] = js.native
    
    var unit_forget_bias: js.UndefOr[Boolean] = js.native
  }
  object LSTMCellConfig {
    
    @scala.inline
    def apply(units: Double): LSTMCellConfig = {
      val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
      __obj.asInstanceOf[LSTMCellConfig]
    }
    
    @scala.inline
    implicit class LSTMCellConfigMutableBuilder[Self <: LSTMCellConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImplementation(value: Double): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImplementationUndefined: Self = StObject.set(x, "implementation", js.undefined)
      
      @scala.inline
      def setRecurrent_activation(value: ActivationSerialization): Self = StObject.set(x, "recurrent_activation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrent_activationUndefined: Self = StObject.set(x, "recurrent_activation", js.undefined)
      
      @scala.inline
      def setUnit_forget_bias(value: Boolean): Self = StObject.set(x, "unit_forget_bias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnit_forget_biasUndefined: Self = StObject.set(x, "unit_forget_bias", js.undefined)
    }
  }
  
  type LSTMCellSerialization = BaseSerialization[LSTMCell, LSTMCellConfig]
  
  @js.native
  trait LSTMLayerConfig extends SimpleRNNLayerConfig {
    
    var implementation: js.UndefOr[Double] = js.native
    
    var recurrent_activation: js.UndefOr[ActivationSerialization] = js.native
    
    var unit_forget_bias: js.UndefOr[Boolean] = js.native
  }
  object LSTMLayerConfig {
    
    @scala.inline
    def apply(units: Double): LSTMLayerConfig = {
      val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
      __obj.asInstanceOf[LSTMLayerConfig]
    }
    
    @scala.inline
    implicit class LSTMLayerConfigMutableBuilder[Self <: LSTMLayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImplementation(value: Double): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImplementationUndefined: Self = StObject.set(x, "implementation", js.undefined)
      
      @scala.inline
      def setRecurrent_activation(value: ActivationSerialization): Self = StObject.set(x, "recurrent_activation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrent_activationUndefined: Self = StObject.set(x, "recurrent_activation", js.undefined)
      
      @scala.inline
      def setUnit_forget_bias(value: Boolean): Self = StObject.set(x, "unit_forget_bias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnit_forget_biasUndefined: Self = StObject.set(x, "unit_forget_bias", js.undefined)
    }
  }
  
  type LSTMLayerSerialization = BaseLayerSerialization[LSTM, LSTMLayerConfig]
  
  type RNNCellSerialization = SimpleRNNCellSerialization | GRUCellSerialization | LSTMCellSerialization | StackedRNNCellsSerialization
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/recurrent_serialization.RecurrentLayerSerialization['class_name'] */
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SimpleRNN
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LSTM
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GRU
  */
  trait RecurrentLayerClassName extends StObject
  object RecurrentLayerClassName {
    
    @scala.inline
    def GRU: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GRU = "GRU".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GRU]
    
    @scala.inline
    def LSTM: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LSTM = "LSTM".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LSTM]
    
    @scala.inline
    def SimpleRNN: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SimpleRNN = "SimpleRNN".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SimpleRNN]
  }
  
  type RecurrentLayerSerialization = SimpleRNNLayerSerialization | LSTMLayerSerialization | GRULayerSerialization
  
  @js.native
  trait SimpleRNNCellConfig extends LayerConfig {
    
    var activation: js.UndefOr[ActivationSerialization] = js.native
    
    var bias_constraint: js.UndefOr[ConstraintSerialization] = js.native
    
    var bias_initializer: js.UndefOr[InitializerSerialization] = js.native
    
    var bias_regularizer: js.UndefOr[RegularizerSerialization] = js.native
    
    var dropout: js.UndefOr[Double] = js.native
    
    var kernel_constraint: js.UndefOr[ConstraintSerialization] = js.native
    
    var kernel_initializer: js.UndefOr[InitializerSerialization] = js.native
    
    var kernel_regularizer: js.UndefOr[RegularizerSerialization] = js.native
    
    var recurrent_constraint: js.UndefOr[ConstraintSerialization] = js.native
    
    var recurrent_dropout: js.UndefOr[Double] = js.native
    
    var recurrent_initializer: js.UndefOr[InitializerSerialization] = js.native
    
    var recurrent_regularizer: js.UndefOr[RegularizerSerialization] = js.native
    
    var units: Double = js.native
    
    var use_bias: js.UndefOr[Boolean] = js.native
  }
  object SimpleRNNCellConfig {
    
    @scala.inline
    def apply(units: Double): SimpleRNNCellConfig = {
      val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleRNNCellConfig]
    }
    
    @scala.inline
    implicit class SimpleRNNCellConfigMutableBuilder[Self <: SimpleRNNCellConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivation(value: ActivationSerialization): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
      
      @scala.inline
      def setBias_constraint(value: ConstraintSerialization): Self = StObject.set(x, "bias_constraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBias_constraintUndefined: Self = StObject.set(x, "bias_constraint", js.undefined)
      
      @scala.inline
      def setBias_initializer(value: InitializerSerialization): Self = StObject.set(x, "bias_initializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBias_initializerUndefined: Self = StObject.set(x, "bias_initializer", js.undefined)
      
      @scala.inline
      def setBias_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "bias_regularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBias_regularizerUndefined: Self = StObject.set(x, "bias_regularizer", js.undefined)
      
      @scala.inline
      def setDropout(value: Double): Self = StObject.set(x, "dropout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropoutUndefined: Self = StObject.set(x, "dropout", js.undefined)
      
      @scala.inline
      def setKernel_constraint(value: ConstraintSerialization): Self = StObject.set(x, "kernel_constraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernel_constraintUndefined: Self = StObject.set(x, "kernel_constraint", js.undefined)
      
      @scala.inline
      def setKernel_initializer(value: InitializerSerialization): Self = StObject.set(x, "kernel_initializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernel_initializerUndefined: Self = StObject.set(x, "kernel_initializer", js.undefined)
      
      @scala.inline
      def setKernel_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "kernel_regularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernel_regularizerUndefined: Self = StObject.set(x, "kernel_regularizer", js.undefined)
      
      @scala.inline
      def setRecurrent_constraint(value: ConstraintSerialization): Self = StObject.set(x, "recurrent_constraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrent_constraintUndefined: Self = StObject.set(x, "recurrent_constraint", js.undefined)
      
      @scala.inline
      def setRecurrent_dropout(value: Double): Self = StObject.set(x, "recurrent_dropout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrent_dropoutUndefined: Self = StObject.set(x, "recurrent_dropout", js.undefined)
      
      @scala.inline
      def setRecurrent_initializer(value: InitializerSerialization): Self = StObject.set(x, "recurrent_initializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrent_initializerUndefined: Self = StObject.set(x, "recurrent_initializer", js.undefined)
      
      @scala.inline
      def setRecurrent_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "recurrent_regularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrent_regularizerUndefined: Self = StObject.set(x, "recurrent_regularizer", js.undefined)
      
      @scala.inline
      def setUnits(value: Double): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse_bias(value: Boolean): Self = StObject.set(x, "use_bias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse_biasUndefined: Self = StObject.set(x, "use_bias", js.undefined)
    }
  }
  
  type SimpleRNNCellSerialization = BaseSerialization[SimpleRNNCell, SimpleRNNCellConfig]
  
  @js.native
  trait SimpleRNNLayerConfig extends BaseRNNLayerConfig {
    
    var activation: js.UndefOr[ActivationSerialization] = js.native
    
    var bias_constraint: js.UndefOr[ConstraintSerialization] = js.native
    
    var bias_initializer: js.UndefOr[InitializerSerialization] = js.native
    
    var bias_regularizer: js.UndefOr[RegularizerSerialization] = js.native
    
    var dropout: js.UndefOr[Double] = js.native
    
    var kernel_constraint: js.UndefOr[ConstraintSerialization] = js.native
    
    var kernel_initializer: js.UndefOr[InitializerSerialization] = js.native
    
    var kernel_regularizer: js.UndefOr[RegularizerSerialization] = js.native
    
    var recurrent_constraint: js.UndefOr[ConstraintSerialization] = js.native
    
    var recurrent_dropout: js.UndefOr[Double] = js.native
    
    var recurrent_initializer: js.UndefOr[InitializerSerialization] = js.native
    
    var recurrent_regularizer: js.UndefOr[RegularizerSerialization] = js.native
    
    var units: Double = js.native
    
    var use_bias: js.UndefOr[Boolean] = js.native
  }
  object SimpleRNNLayerConfig {
    
    @scala.inline
    def apply(units: Double): SimpleRNNLayerConfig = {
      val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleRNNLayerConfig]
    }
    
    @scala.inline
    implicit class SimpleRNNLayerConfigMutableBuilder[Self <: SimpleRNNLayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivation(value: ActivationSerialization): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
      
      @scala.inline
      def setBias_constraint(value: ConstraintSerialization): Self = StObject.set(x, "bias_constraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBias_constraintUndefined: Self = StObject.set(x, "bias_constraint", js.undefined)
      
      @scala.inline
      def setBias_initializer(value: InitializerSerialization): Self = StObject.set(x, "bias_initializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBias_initializerUndefined: Self = StObject.set(x, "bias_initializer", js.undefined)
      
      @scala.inline
      def setBias_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "bias_regularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBias_regularizerUndefined: Self = StObject.set(x, "bias_regularizer", js.undefined)
      
      @scala.inline
      def setDropout(value: Double): Self = StObject.set(x, "dropout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropoutUndefined: Self = StObject.set(x, "dropout", js.undefined)
      
      @scala.inline
      def setKernel_constraint(value: ConstraintSerialization): Self = StObject.set(x, "kernel_constraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernel_constraintUndefined: Self = StObject.set(x, "kernel_constraint", js.undefined)
      
      @scala.inline
      def setKernel_initializer(value: InitializerSerialization): Self = StObject.set(x, "kernel_initializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernel_initializerUndefined: Self = StObject.set(x, "kernel_initializer", js.undefined)
      
      @scala.inline
      def setKernel_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "kernel_regularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernel_regularizerUndefined: Self = StObject.set(x, "kernel_regularizer", js.undefined)
      
      @scala.inline
      def setRecurrent_constraint(value: ConstraintSerialization): Self = StObject.set(x, "recurrent_constraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrent_constraintUndefined: Self = StObject.set(x, "recurrent_constraint", js.undefined)
      
      @scala.inline
      def setRecurrent_dropout(value: Double): Self = StObject.set(x, "recurrent_dropout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrent_dropoutUndefined: Self = StObject.set(x, "recurrent_dropout", js.undefined)
      
      @scala.inline
      def setRecurrent_initializer(value: InitializerSerialization): Self = StObject.set(x, "recurrent_initializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrent_initializerUndefined: Self = StObject.set(x, "recurrent_initializer", js.undefined)
      
      @scala.inline
      def setRecurrent_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "recurrent_regularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrent_regularizerUndefined: Self = StObject.set(x, "recurrent_regularizer", js.undefined)
      
      @scala.inline
      def setUnits(value: Double): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse_bias(value: Boolean): Self = StObject.set(x, "use_bias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse_biasUndefined: Self = StObject.set(x, "use_bias", js.undefined)
    }
  }
  
  type SimpleRNNLayerSerialization = BaseLayerSerialization[SimpleRNN, SimpleRNNLayerConfig]
  
  @js.native
  trait StackedRNNCellsConfig extends LayerConfig {
    
    var cells: js.Array[RNNCellSerialization] = js.native
  }
  object StackedRNNCellsConfig {
    
    @scala.inline
    def apply(cells: js.Array[RNNCellSerialization]): StackedRNNCellsConfig = {
      val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackedRNNCellsConfig]
    }
    
    @scala.inline
    implicit class StackedRNNCellsConfigMutableBuilder[Self <: StackedRNNCellsConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCells(value: js.Array[RNNCellSerialization]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellsVarargs(value: RNNCellSerialization*): Self = StObject.set(x, "cells", js.Array(value :_*))
    }
  }
  
  type StackedRNNCellsSerialization = BaseSerialization[StackedRNNCells, StackedRNNCellsConfig]
}
