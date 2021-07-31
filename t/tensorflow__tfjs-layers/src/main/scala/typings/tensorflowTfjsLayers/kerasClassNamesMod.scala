package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typings.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typings.tensorflowTfjsLayers.layerSerializationMod.LayerSerialization
import typings.tensorflowTfjsLayers.optimizerConfigMod.OptimizerSerialization
import typings.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kerasClassNamesMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/keras_class_names", "kerasClassNames")
  @js.native
  val kerasClassNames: js.Array[KerasClassName] = js.native
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/keras_class_names.KerasSerialization['class_name'] */
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Flatten
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adagrad
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.InputLayer
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.PReLU
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling1D
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Concatenate
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TruncatedNormal
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling2D
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dropout
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Ones
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Softmax
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Add
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv2DTranspose
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ZeroPadding2D
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Minimum
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Multiply
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Activation
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.BatchNormalization
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Masking
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv2D
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MinMaxNorm
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ReLU
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling1D
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling1D
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Permute
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SGD
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Constant
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling2D
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Reshape
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LeakyReLU
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling1D
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.L1L2
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomNormal
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Orthogonal
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dot
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.DepthwiseConv2D
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SimpleRNN
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ELU
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling2D
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RepeatVector
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomUniform
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv1D
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LSTM
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Maximum
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adadelta
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Identity
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Average
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ThresholdedReLU
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.NonNeg
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling2D
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Embedding
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GRU
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RMSProp
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UpSampling2D
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adam
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UnitNorm
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dense
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Zeros
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxNorm
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adamax
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Momentum
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.VarianceScaling
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Cropping2D
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SeparableConv2D
  */
  trait KerasClassName extends StObject
  object KerasClassName {
    
    @scala.inline
    def Activation: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Activation = "Activation".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Activation]
    
    @scala.inline
    def Adadelta: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adadelta = "Adadelta".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adadelta]
    
    @scala.inline
    def Adagrad: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adagrad = "Adagrad".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adagrad]
    
    @scala.inline
    def Adam: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adam = "Adam".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adam]
    
    @scala.inline
    def Adamax: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adamax = "Adamax".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adamax]
    
    @scala.inline
    def Add: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Add = "Add".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Add]
    
    @scala.inline
    def Average: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Average = "Average".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Average]
    
    @scala.inline
    def AveragePooling1D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling1D = "AveragePooling1D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling1D]
    
    @scala.inline
    def AveragePooling2D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling2D = "AveragePooling2D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling2D]
    
    @scala.inline
    def BatchNormalization: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.BatchNormalization = "BatchNormalization".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.BatchNormalization]
    
    @scala.inline
    def Concatenate: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Concatenate = "Concatenate".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Concatenate]
    
    @scala.inline
    def Constant: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Constant = "Constant".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Constant]
    
    @scala.inline
    def Conv1D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv1D = "Conv1D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv1D]
    
    @scala.inline
    def Conv2D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv2D = "Conv2D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv2D]
    
    @scala.inline
    def Conv2DTranspose: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv2DTranspose = "Conv2DTranspose".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv2DTranspose]
    
    @scala.inline
    def Cropping2D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Cropping2D = "Cropping2D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Cropping2D]
    
    @scala.inline
    def Dense: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dense = "Dense".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dense]
    
    @scala.inline
    def DepthwiseConv2D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.DepthwiseConv2D = "DepthwiseConv2D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.DepthwiseConv2D]
    
    @scala.inline
    def Dot: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dot = "Dot".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dot]
    
    @scala.inline
    def Dropout: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dropout = "Dropout".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dropout]
    
    @scala.inline
    def ELU: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ELU = "ELU".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ELU]
    
    @scala.inline
    def Embedding: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Embedding = "Embedding".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Embedding]
    
    @scala.inline
    def Flatten: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Flatten = "Flatten".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Flatten]
    
    @scala.inline
    def GRU: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GRU = "GRU".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GRU]
    
    @scala.inline
    def GlobalAveragePooling1D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling1D = "GlobalAveragePooling1D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling1D]
    
    @scala.inline
    def GlobalAveragePooling2D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling2D = "GlobalAveragePooling2D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling2D]
    
    @scala.inline
    def GlobalMaxPooling1D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling1D = "GlobalMaxPooling1D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling1D]
    
    @scala.inline
    def GlobalMaxPooling2D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling2D = "GlobalMaxPooling2D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling2D]
    
    @scala.inline
    def Identity: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Identity = "Identity".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Identity]
    
    @scala.inline
    def InputLayer: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.InputLayer = "InputLayer".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.InputLayer]
    
    @scala.inline
    def L1L2: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.L1L2 = "L1L2".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.L1L2]
    
    @scala.inline
    def LSTM: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LSTM = "LSTM".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LSTM]
    
    @scala.inline
    def LeakyReLU: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LeakyReLU = "LeakyReLU".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LeakyReLU]
    
    @scala.inline
    def Masking: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Masking = "Masking".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Masking]
    
    @scala.inline
    def MaxNorm: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxNorm = "MaxNorm".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxNorm]
    
    @scala.inline
    def MaxPooling1D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling1D = "MaxPooling1D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling1D]
    
    @scala.inline
    def MaxPooling2D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling2D = "MaxPooling2D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling2D]
    
    @scala.inline
    def Maximum: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Maximum = "Maximum".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Maximum]
    
    @scala.inline
    def MinMaxNorm: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MinMaxNorm = "MinMaxNorm".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MinMaxNorm]
    
    @scala.inline
    def Minimum: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Minimum = "Minimum".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Minimum]
    
    @scala.inline
    def Momentum: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Momentum = "Momentum".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Momentum]
    
    @scala.inline
    def Multiply: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Multiply = "Multiply".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Multiply]
    
    @scala.inline
    def NonNeg: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.NonNeg = "NonNeg".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.NonNeg]
    
    @scala.inline
    def Ones: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Ones = "Ones".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Ones]
    
    @scala.inline
    def Orthogonal: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Orthogonal = "Orthogonal".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Orthogonal]
    
    @scala.inline
    def PReLU: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.PReLU = "PReLU".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.PReLU]
    
    @scala.inline
    def Permute: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Permute = "Permute".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Permute]
    
    @scala.inline
    def RMSProp: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RMSProp = "RMSProp".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RMSProp]
    
    @scala.inline
    def RandomNormal: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomNormal = "RandomNormal".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomNormal]
    
    @scala.inline
    def RandomUniform: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomUniform = "RandomUniform".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomUniform]
    
    @scala.inline
    def ReLU: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ReLU = "ReLU".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ReLU]
    
    @scala.inline
    def RepeatVector: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RepeatVector = "RepeatVector".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RepeatVector]
    
    @scala.inline
    def Reshape: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Reshape = "Reshape".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Reshape]
    
    @scala.inline
    def SGD: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SGD = "SGD".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SGD]
    
    @scala.inline
    def SeparableConv2D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SeparableConv2D = "SeparableConv2D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SeparableConv2D]
    
    @scala.inline
    def SimpleRNN: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SimpleRNN = "SimpleRNN".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SimpleRNN]
    
    @scala.inline
    def Softmax: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Softmax = "Softmax".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Softmax]
    
    @scala.inline
    def ThresholdedReLU: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ThresholdedReLU = "ThresholdedReLU".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ThresholdedReLU]
    
    @scala.inline
    def TruncatedNormal: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TruncatedNormal = "TruncatedNormal".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TruncatedNormal]
    
    @scala.inline
    def UnitNorm: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UnitNorm = "UnitNorm".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UnitNorm]
    
    @scala.inline
    def UpSampling2D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UpSampling2D = "UpSampling2D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UpSampling2D]
    
    @scala.inline
    def VarianceScaling: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.VarianceScaling = "VarianceScaling".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.VarianceScaling]
    
    @scala.inline
    def ZeroPadding2D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ZeroPadding2D = "ZeroPadding2D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ZeroPadding2D]
    
    @scala.inline
    def Zeros: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Zeros = "Zeros".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Zeros]
  }
  
  type KerasSerialization = LayerSerialization | ConstraintSerialization | InitializerSerialization | RegularizerSerialization | OptimizerSerialization
}
