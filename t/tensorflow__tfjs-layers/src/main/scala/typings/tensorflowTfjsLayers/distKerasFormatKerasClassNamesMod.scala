package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.distKerasFormatConstraintConfigMod.ConstraintSerialization
import typings.tensorflowTfjsLayers.distKerasFormatInitializerConfigMod.InitializerSerialization
import typings.tensorflowTfjsLayers.distKerasFormatLayersLayerSerializationMod.LayerSerialization
import typings.tensorflowTfjsLayers.distKerasFormatOptimizerConfigMod.OptimizerSerialization
import typings.tensorflowTfjsLayers.distKerasFormatRegularizerConfigMod.RegularizerSerialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKerasFormatKerasClassNamesMod {
  
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
    
    inline def Activation: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Activation = "Activation".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Activation]
    
    inline def Adadelta: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adadelta = "Adadelta".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adadelta]
    
    inline def Adagrad: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adagrad = "Adagrad".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adagrad]
    
    inline def Adam: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adam = "Adam".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adam]
    
    inline def Adamax: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adamax = "Adamax".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adamax]
    
    inline def Add: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Add = "Add".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Add]
    
    inline def Average: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Average = "Average".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Average]
    
    inline def AveragePooling1D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling1D = "AveragePooling1D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling1D]
    
    inline def AveragePooling2D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling2D = "AveragePooling2D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling2D]
    
    inline def BatchNormalization: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.BatchNormalization = "BatchNormalization".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.BatchNormalization]
    
    inline def Concatenate: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Concatenate = "Concatenate".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Concatenate]
    
    inline def Constant: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Constant = "Constant".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Constant]
    
    inline def Conv1D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv1D = "Conv1D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv1D]
    
    inline def Conv2D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv2D = "Conv2D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv2D]
    
    inline def Conv2DTranspose: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv2DTranspose = "Conv2DTranspose".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv2DTranspose]
    
    inline def Cropping2D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Cropping2D = "Cropping2D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Cropping2D]
    
    inline def Dense: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dense = "Dense".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dense]
    
    inline def DepthwiseConv2D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.DepthwiseConv2D = "DepthwiseConv2D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.DepthwiseConv2D]
    
    inline def Dot: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dot = "Dot".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dot]
    
    inline def Dropout: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dropout = "Dropout".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dropout]
    
    inline def ELU: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ELU = "ELU".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ELU]
    
    inline def Embedding: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Embedding = "Embedding".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Embedding]
    
    inline def Flatten: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Flatten = "Flatten".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Flatten]
    
    inline def GRU: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GRU = "GRU".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GRU]
    
    inline def GlobalAveragePooling1D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling1D = "GlobalAveragePooling1D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling1D]
    
    inline def GlobalAveragePooling2D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling2D = "GlobalAveragePooling2D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling2D]
    
    inline def GlobalMaxPooling1D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling1D = "GlobalMaxPooling1D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling1D]
    
    inline def GlobalMaxPooling2D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling2D = "GlobalMaxPooling2D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling2D]
    
    inline def Identity: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Identity = "Identity".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Identity]
    
    inline def InputLayer: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.InputLayer = "InputLayer".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.InputLayer]
    
    inline def L1L2: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.L1L2 = "L1L2".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.L1L2]
    
    inline def LSTM: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LSTM = "LSTM".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LSTM]
    
    inline def LeakyReLU: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LeakyReLU = "LeakyReLU".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LeakyReLU]
    
    inline def Masking: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Masking = "Masking".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Masking]
    
    inline def MaxNorm: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxNorm = "MaxNorm".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxNorm]
    
    inline def MaxPooling1D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling1D = "MaxPooling1D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling1D]
    
    inline def MaxPooling2D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling2D = "MaxPooling2D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling2D]
    
    inline def Maximum: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Maximum = "Maximum".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Maximum]
    
    inline def MinMaxNorm: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MinMaxNorm = "MinMaxNorm".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MinMaxNorm]
    
    inline def Minimum: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Minimum = "Minimum".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Minimum]
    
    inline def Momentum: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Momentum = "Momentum".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Momentum]
    
    inline def Multiply: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Multiply = "Multiply".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Multiply]
    
    inline def NonNeg: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.NonNeg = "NonNeg".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.NonNeg]
    
    inline def Ones: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Ones = "Ones".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Ones]
    
    inline def Orthogonal: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Orthogonal = "Orthogonal".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Orthogonal]
    
    inline def PReLU: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.PReLU = "PReLU".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.PReLU]
    
    inline def Permute: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Permute = "Permute".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Permute]
    
    inline def RMSProp: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RMSProp = "RMSProp".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RMSProp]
    
    inline def RandomNormal: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomNormal = "RandomNormal".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomNormal]
    
    inline def RandomUniform: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomUniform = "RandomUniform".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomUniform]
    
    inline def ReLU: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ReLU = "ReLU".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ReLU]
    
    inline def RepeatVector: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RepeatVector = "RepeatVector".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RepeatVector]
    
    inline def Reshape: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Reshape = "Reshape".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Reshape]
    
    inline def SGD: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SGD = "SGD".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SGD]
    
    inline def SeparableConv2D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SeparableConv2D = "SeparableConv2D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SeparableConv2D]
    
    inline def SimpleRNN: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SimpleRNN = "SimpleRNN".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SimpleRNN]
    
    inline def Softmax: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Softmax = "Softmax".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Softmax]
    
    inline def ThresholdedReLU: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ThresholdedReLU = "ThresholdedReLU".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ThresholdedReLU]
    
    inline def TruncatedNormal: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TruncatedNormal = "TruncatedNormal".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TruncatedNormal]
    
    inline def UnitNorm: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UnitNorm = "UnitNorm".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UnitNorm]
    
    inline def UpSampling2D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UpSampling2D = "UpSampling2D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UpSampling2D]
    
    inline def VarianceScaling: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.VarianceScaling = "VarianceScaling".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.VarianceScaling]
    
    inline def ZeroPadding2D: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ZeroPadding2D = "ZeroPadding2D".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ZeroPadding2D]
    
    inline def Zeros: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Zeros = "Zeros".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Zeros]
  }
  
  type KerasSerialization = LayerSerialization | ConstraintSerialization | InitializerSerialization | RegularizerSerialization | OptimizerSerialization
}
