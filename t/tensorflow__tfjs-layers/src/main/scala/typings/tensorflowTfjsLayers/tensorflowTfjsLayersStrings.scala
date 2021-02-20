package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.activationConfigMod.ActivationIdentifier
import typings.tensorflowTfjsLayers.advancedActivationSerializationMod.AdvancedActivationLayerClassName
import typings.tensorflowTfjsLayers.baseCallbacksMod._YieldEveryOptions
import typings.tensorflowTfjsLayers.constraintConfigMod.ConstraintClassName
import typings.tensorflowTfjsLayers.constraintsMod._ConstraintIdentifier
import typings.tensorflowTfjsLayers.convolutionalSerializationMod.ConvolutionalLayerClassName
import typings.tensorflowTfjsLayers.coreSerializationMod.CoreLayerClassName
import typings.tensorflowTfjsLayers.initializerConfigMod.Distribution
import typings.tensorflowTfjsLayers.initializerConfigMod.DistributionSerialization
import typings.tensorflowTfjsLayers.initializerConfigMod.FanMode
import typings.tensorflowTfjsLayers.initializerConfigMod.FanModeSerialization
import typings.tensorflowTfjsLayers.initializerConfigMod.InitializerClassName
import typings.tensorflowTfjsLayers.initializersMod._InitializerIdentifier
import typings.tensorflowTfjsLayers.kerasClassNamesMod.KerasClassName
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.BidirectionalMergeMode
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormatSerialization
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataType
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.PoolMode
import typings.tensorflowTfjsLayers.layerSerializationMod.LayerClassName
import typings.tensorflowTfjsLayers.mergeSerializationMod.MergeLayerClassName
import typings.tensorflowTfjsLayers.optimizerConfigMod.OptimizerClassName
import typings.tensorflowTfjsLayers.poolingSerializationMod.PoolingLayerClassName
import typings.tensorflowTfjsLayers.recurrentSerializationMod.RecurrentLayerClassName
import typings.tensorflowTfjsLayers.wrappersSerializationMod.WrapperLayerClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tensorflowTfjsLayersStrings {
  
  @js.native
  sealed trait Activation
    extends CoreLayerClassName
       with KerasClassName
       with LayerClassName
  @scala.inline
  def Activation: Activation = "Activation".asInstanceOf[Activation]
  
  @js.native
  sealed trait Adadelta
    extends KerasClassName
       with OptimizerClassName
  @scala.inline
  def Adadelta: Adadelta = "Adadelta".asInstanceOf[Adadelta]
  
  @js.native
  sealed trait Adagrad
    extends KerasClassName
       with OptimizerClassName
  @scala.inline
  def Adagrad: Adagrad = "Adagrad".asInstanceOf[Adagrad]
  
  @js.native
  sealed trait Adam
    extends KerasClassName
       with OptimizerClassName
  @scala.inline
  def Adam: Adam = "Adam".asInstanceOf[Adam]
  
  @js.native
  sealed trait Adamax
    extends KerasClassName
       with OptimizerClassName
  @scala.inline
  def Adamax: Adamax = "Adamax".asInstanceOf[Adamax]
  
  @js.native
  sealed trait Add
    extends KerasClassName
       with LayerClassName
       with MergeLayerClassName
  @scala.inline
  def Add: Add = "Add".asInstanceOf[Add]
  
  @js.native
  sealed trait Average
    extends KerasClassName
       with LayerClassName
       with MergeLayerClassName
  @scala.inline
  def Average: Average = "Average".asInstanceOf[Average]
  
  @js.native
  sealed trait AveragePooling1D
    extends KerasClassName
       with LayerClassName
       with PoolingLayerClassName
  @scala.inline
  def AveragePooling1D: AveragePooling1D = "AveragePooling1D".asInstanceOf[AveragePooling1D]
  
  @js.native
  sealed trait AveragePooling2D
    extends KerasClassName
       with LayerClassName
       with PoolingLayerClassName
  @scala.inline
  def AveragePooling2D: AveragePooling2D = "AveragePooling2D".asInstanceOf[AveragePooling2D]
  
  @js.native
  sealed trait BatchNormalization
    extends KerasClassName
       with LayerClassName
  @scala.inline
  def BatchNormalization: BatchNormalization = "BatchNormalization".asInstanceOf[BatchNormalization]
  
  @js.native
  sealed trait Bidirectional extends WrapperLayerClassName
  @scala.inline
  def Bidirectional: Bidirectional = "Bidirectional".asInstanceOf[Bidirectional]
  
  @js.native
  sealed trait Concatenate
    extends KerasClassName
       with LayerClassName
       with MergeLayerClassName
  @scala.inline
  def Concatenate: Concatenate = "Concatenate".asInstanceOf[Concatenate]
  
  @js.native
  sealed trait Constant
    extends InitializerClassName
       with KerasClassName
  @scala.inline
  def Constant: Constant = "Constant".asInstanceOf[Constant]
  
  @js.native
  sealed trait Conv1D
    extends ConvolutionalLayerClassName
       with KerasClassName
       with LayerClassName
  @scala.inline
  def Conv1D: Conv1D = "Conv1D".asInstanceOf[Conv1D]
  
  @js.native
  sealed trait Conv2D
    extends ConvolutionalLayerClassName
       with KerasClassName
       with LayerClassName
  @scala.inline
  def Conv2D: Conv2D = "Conv2D".asInstanceOf[Conv2D]
  
  @js.native
  sealed trait Conv2DTranspose
    extends ConvolutionalLayerClassName
       with KerasClassName
       with LayerClassName
  @scala.inline
  def Conv2DTranspose: Conv2DTranspose = "Conv2DTranspose".asInstanceOf[Conv2DTranspose]
  
  @js.native
  sealed trait Cropping2D
    extends ConvolutionalLayerClassName
       with KerasClassName
       with LayerClassName
  @scala.inline
  def Cropping2D: Cropping2D = "Cropping2D".asInstanceOf[Cropping2D]
  
  @js.native
  sealed trait Dense
    extends CoreLayerClassName
       with KerasClassName
       with LayerClassName
  @scala.inline
  def Dense: Dense = "Dense".asInstanceOf[Dense]
  
  @js.native
  sealed trait DepthwiseConv2D
    extends KerasClassName
       with LayerClassName
  @scala.inline
  def DepthwiseConv2D: DepthwiseConv2D = "DepthwiseConv2D".asInstanceOf[DepthwiseConv2D]
  
  @js.native
  sealed trait Dot
    extends KerasClassName
       with LayerClassName
       with MergeLayerClassName
  @scala.inline
  def Dot: Dot = "Dot".asInstanceOf[Dot]
  
  @js.native
  sealed trait Dropout
    extends CoreLayerClassName
       with KerasClassName
       with LayerClassName
  @scala.inline
  def Dropout: Dropout = "Dropout".asInstanceOf[Dropout]
  
  @js.native
  sealed trait ELU
    extends AdvancedActivationLayerClassName
       with KerasClassName
       with LayerClassName
  @scala.inline
  def ELU: ELU = "ELU".asInstanceOf[ELU]
  
  @js.native
  sealed trait Embedding
    extends KerasClassName
       with LayerClassName
  @scala.inline
  def Embedding: Embedding = "Embedding".asInstanceOf[Embedding]
  
  @js.native
  sealed trait Flatten
    extends CoreLayerClassName
       with KerasClassName
       with LayerClassName
  @scala.inline
  def Flatten: Flatten = "Flatten".asInstanceOf[Flatten]
  
  @js.native
  sealed trait GRU
    extends KerasClassName
       with LayerClassName
       with RecurrentLayerClassName
  @scala.inline
  def GRU: GRU = "GRU".asInstanceOf[GRU]
  
  @js.native
  sealed trait GRUCell extends StObject
  @scala.inline
  def GRUCell: GRUCell = "GRUCell".asInstanceOf[GRUCell]
  
  @js.native
  sealed trait GlobalAveragePooling1D
    extends KerasClassName
       with LayerClassName
       with PoolingLayerClassName
  @scala.inline
  def GlobalAveragePooling1D: GlobalAveragePooling1D = "GlobalAveragePooling1D".asInstanceOf[GlobalAveragePooling1D]
  
  @js.native
  sealed trait GlobalAveragePooling2D
    extends KerasClassName
       with LayerClassName
       with PoolingLayerClassName
  @scala.inline
  def GlobalAveragePooling2D: GlobalAveragePooling2D = "GlobalAveragePooling2D".asInstanceOf[GlobalAveragePooling2D]
  
  @js.native
  sealed trait GlobalMaxPooling1D
    extends KerasClassName
       with LayerClassName
       with PoolingLayerClassName
  @scala.inline
  def GlobalMaxPooling1D: GlobalMaxPooling1D = "GlobalMaxPooling1D".asInstanceOf[GlobalMaxPooling1D]
  
  @js.native
  sealed trait GlobalMaxPooling2D
    extends KerasClassName
       with LayerClassName
       with PoolingLayerClassName
  @scala.inline
  def GlobalMaxPooling2D: GlobalMaxPooling2D = "GlobalMaxPooling2D".asInstanceOf[GlobalMaxPooling2D]
  
  @js.native
  sealed trait Identity
    extends InitializerClassName
       with KerasClassName
  @scala.inline
  def Identity: Identity = "Identity".asInstanceOf[Identity]
  
  @js.native
  sealed trait InputLayer
    extends KerasClassName
       with LayerClassName
  @scala.inline
  def InputLayer: InputLayer = "InputLayer".asInstanceOf[InputLayer]
  
  @js.native
  sealed trait L1L2 extends KerasClassName
  @scala.inline
  def L1L2: L1L2 = "L1L2".asInstanceOf[L1L2]
  
  @js.native
  sealed trait LSTM
    extends KerasClassName
       with LayerClassName
       with RecurrentLayerClassName
  @scala.inline
  def LSTM: LSTM = "LSTM".asInstanceOf[LSTM]
  
  @js.native
  sealed trait LSTMCell extends StObject
  @scala.inline
  def LSTMCell: LSTMCell = "LSTMCell".asInstanceOf[LSTMCell]
  
  @js.native
  sealed trait LeakyReLU
    extends AdvancedActivationLayerClassName
       with KerasClassName
       with LayerClassName
  @scala.inline
  def LeakyReLU: LeakyReLU = "LeakyReLU".asInstanceOf[LeakyReLU]
  
  @js.native
  sealed trait Masking
    extends CoreLayerClassName
       with KerasClassName
       with LayerClassName
  @scala.inline
  def Masking: Masking = "Masking".asInstanceOf[Masking]
  
  @js.native
  sealed trait MaxNorm
    extends ConstraintClassName
       with KerasClassName
  @scala.inline
  def MaxNorm: MaxNorm = "MaxNorm".asInstanceOf[MaxNorm]
  
  @js.native
  sealed trait MaxPooling1D
    extends KerasClassName
       with LayerClassName
       with PoolingLayerClassName
  @scala.inline
  def MaxPooling1D: MaxPooling1D = "MaxPooling1D".asInstanceOf[MaxPooling1D]
  
  @js.native
  sealed trait MaxPooling2D
    extends KerasClassName
       with LayerClassName
       with PoolingLayerClassName
  @scala.inline
  def MaxPooling2D: MaxPooling2D = "MaxPooling2D".asInstanceOf[MaxPooling2D]
  
  @js.native
  sealed trait Maximum
    extends KerasClassName
       with LayerClassName
       with MergeLayerClassName
  @scala.inline
  def Maximum: Maximum = "Maximum".asInstanceOf[Maximum]
  
  @js.native
  sealed trait MinMaxNorm
    extends ConstraintClassName
       with KerasClassName
  @scala.inline
  def MinMaxNorm: MinMaxNorm = "MinMaxNorm".asInstanceOf[MinMaxNorm]
  
  @js.native
  sealed trait Minimum
    extends KerasClassName
       with LayerClassName
       with MergeLayerClassName
  @scala.inline
  def Minimum: Minimum = "Minimum".asInstanceOf[Minimum]
  
  @js.native
  sealed trait Model extends StObject
  @scala.inline
  def Model: Model = "Model".asInstanceOf[Model]
  
  @js.native
  sealed trait Momentum
    extends KerasClassName
       with OptimizerClassName
  @scala.inline
  def Momentum: Momentum = "Momentum".asInstanceOf[Momentum]
  
  @js.native
  sealed trait Multiply
    extends KerasClassName
       with LayerClassName
       with MergeLayerClassName
  @scala.inline
  def Multiply: Multiply = "Multiply".asInstanceOf[Multiply]
  
  @js.native
  sealed trait NonNeg
    extends ConstraintClassName
       with KerasClassName
  @scala.inline
  def NonNeg: NonNeg = "NonNeg".asInstanceOf[NonNeg]
  
  @js.native
  sealed trait Ones
    extends InitializerClassName
       with KerasClassName
  @scala.inline
  def Ones: Ones = "Ones".asInstanceOf[Ones]
  
  @js.native
  sealed trait Orthogonal
    extends InitializerClassName
       with KerasClassName
  @scala.inline
  def Orthogonal: Orthogonal = "Orthogonal".asInstanceOf[Orthogonal]
  
  @js.native
  sealed trait PReLU
    extends AdvancedActivationLayerClassName
       with KerasClassName
       with LayerClassName
  @scala.inline
  def PReLU: PReLU = "PReLU".asInstanceOf[PReLU]
  
  @js.native
  sealed trait Permute
    extends CoreLayerClassName
       with KerasClassName
       with LayerClassName
  @scala.inline
  def Permute: Permute = "Permute".asInstanceOf[Permute]
  
  @js.native
  sealed trait PyJson extends StObject
  @scala.inline
  def PyJson: PyJson = "PyJson".asInstanceOf[PyJson]
  
  @js.native
  sealed trait RMSProp
    extends KerasClassName
       with OptimizerClassName
  @scala.inline
  def RMSProp: RMSProp = "RMSProp".asInstanceOf[RMSProp]
  
  @js.native
  sealed trait RandomNormal
    extends InitializerClassName
       with KerasClassName
  @scala.inline
  def RandomNormal: RandomNormal = "RandomNormal".asInstanceOf[RandomNormal]
  
  @js.native
  sealed trait RandomUniform
    extends InitializerClassName
       with KerasClassName
  @scala.inline
  def RandomUniform: RandomUniform = "RandomUniform".asInstanceOf[RandomUniform]
  
  @js.native
  sealed trait ReLU
    extends AdvancedActivationLayerClassName
       with KerasClassName
       with LayerClassName
  @scala.inline
  def ReLU: ReLU = "ReLU".asInstanceOf[ReLU]
  
  @js.native
  sealed trait RepeatVector
    extends CoreLayerClassName
       with KerasClassName
       with LayerClassName
  @scala.inline
  def RepeatVector: RepeatVector = "RepeatVector".asInstanceOf[RepeatVector]
  
  @js.native
  sealed trait Reshape
    extends CoreLayerClassName
       with KerasClassName
       with LayerClassName
  @scala.inline
  def Reshape: Reshape = "Reshape".asInstanceOf[Reshape]
  
  @js.native
  sealed trait SGD
    extends KerasClassName
       with OptimizerClassName
  @scala.inline
  def SGD: SGD = "SGD".asInstanceOf[SGD]
  
  @js.native
  sealed trait SeparableConv2D
    extends ConvolutionalLayerClassName
       with KerasClassName
       with LayerClassName
  @scala.inline
  def SeparableConv2D: SeparableConv2D = "SeparableConv2D".asInstanceOf[SeparableConv2D]
  
  @js.native
  sealed trait Sequential extends StObject
  @scala.inline
  def Sequential: Sequential = "Sequential".asInstanceOf[Sequential]
  
  @js.native
  sealed trait SimpleRNN
    extends KerasClassName
       with LayerClassName
       with RecurrentLayerClassName
  @scala.inline
  def SimpleRNN: SimpleRNN = "SimpleRNN".asInstanceOf[SimpleRNN]
  
  @js.native
  sealed trait SimpleRNNCell extends StObject
  @scala.inline
  def SimpleRNNCell: SimpleRNNCell = "SimpleRNNCell".asInstanceOf[SimpleRNNCell]
  
  @js.native
  sealed trait Softmax
    extends AdvancedActivationLayerClassName
       with KerasClassName
       with LayerClassName
  @scala.inline
  def Softmax: Softmax = "Softmax".asInstanceOf[Softmax]
  
  @js.native
  sealed trait StackedRNNCells extends StObject
  @scala.inline
  def StackedRNNCells: StackedRNNCells = "StackedRNNCells".asInstanceOf[StackedRNNCells]
  
  @js.native
  sealed trait ThresholdedReLU
    extends AdvancedActivationLayerClassName
       with KerasClassName
       with LayerClassName
  @scala.inline
  def ThresholdedReLU: ThresholdedReLU = "ThresholdedReLU".asInstanceOf[ThresholdedReLU]
  
  @js.native
  sealed trait TimeDistributed extends WrapperLayerClassName
  @scala.inline
  def TimeDistributed: TimeDistributed = "TimeDistributed".asInstanceOf[TimeDistributed]
  
  @js.native
  sealed trait TruncatedNormal
    extends InitializerClassName
       with KerasClassName
  @scala.inline
  def TruncatedNormal: TruncatedNormal = "TruncatedNormal".asInstanceOf[TruncatedNormal]
  
  @js.native
  sealed trait UnitNorm
    extends ConstraintClassName
       with KerasClassName
  @scala.inline
  def UnitNorm: UnitNorm = "UnitNorm".asInstanceOf[UnitNorm]
  
  @js.native
  sealed trait UpSampling2D
    extends ConvolutionalLayerClassName
       with KerasClassName
       with LayerClassName
  @scala.inline
  def UpSampling2D: UpSampling2D = "UpSampling2D".asInstanceOf[UpSampling2D]
  
  @js.native
  sealed trait VarianceScaling
    extends InitializerClassName
       with KerasClassName
  @scala.inline
  def VarianceScaling: VarianceScaling = "VarianceScaling".asInstanceOf[VarianceScaling]
  
  @js.native
  sealed trait ZeroPadding2D
    extends KerasClassName
       with LayerClassName
  @scala.inline
  def ZeroPadding2D: ZeroPadding2D = "ZeroPadding2D".asInstanceOf[ZeroPadding2D]
  
  @js.native
  sealed trait Zeros
    extends InitializerClassName
       with KerasClassName
  @scala.inline
  def Zeros: Zeros = "Zeros".asInstanceOf[Zeros]
  
  @js.native
  sealed trait auto extends _YieldEveryOptions
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait ave extends BidirectionalMergeMode
  @scala.inline
  def ave: ave = "ave".asInstanceOf[ave]
  
  @js.native
  sealed trait avg extends PoolMode
  @scala.inline
  def avg: avg = "avg".asInstanceOf[avg]
  
  @js.native
  sealed trait batch extends _YieldEveryOptions
  @scala.inline
  def batch: batch = "batch".asInstanceOf[batch]
  
  @js.native
  sealed trait batch_input_shape extends StObject
  @scala.inline
  def batch_input_shape: batch_input_shape = "batch_input_shape".asInstanceOf[batch_input_shape]
  
  @js.native
  sealed trait batch_size extends StObject
  @scala.inline
  def batch_size: batch_size = "batch_size".asInstanceOf[batch_size]
  
  @js.native
  sealed trait bool extends DataType
  @scala.inline
  def bool: bool = "bool".asInstanceOf[bool]
  
  @js.native
  sealed trait categorical_crossentropy extends StObject
  @scala.inline
  def categorical_crossentropy: categorical_crossentropy = "categorical_crossentropy".asInstanceOf[categorical_crossentropy]
  
  @js.native
  sealed trait categorical_hinge extends StObject
  @scala.inline
  def categorical_hinge: categorical_hinge = "categorical_hinge".asInstanceOf[categorical_hinge]
  
  @js.native
  sealed trait causal extends PaddingMode
  @scala.inline
  def causal: causal = "causal".asInstanceOf[causal]
  
  @js.native
  sealed trait channelsFirst extends DataFormat
  @scala.inline
  def channelsFirst: channelsFirst = "channelsFirst".asInstanceOf[channelsFirst]
  
  @js.native
  sealed trait channelsLast extends DataFormat
  @scala.inline
  def channelsLast: channelsLast = "channelsLast".asInstanceOf[channelsLast]
  
  @js.native
  sealed trait channels_first extends DataFormatSerialization
  @scala.inline
  def channels_first: channels_first = "channels_first".asInstanceOf[channels_first]
  
  @js.native
  sealed trait channels_last extends DataFormatSerialization
  @scala.inline
  def channels_last: channels_last = "channels_last".asInstanceOf[channels_last]
  
  @js.native
  sealed trait complex64 extends DataType
  @scala.inline
  def complex64: complex64 = "complex64".asInstanceOf[complex64]
  
  @js.native
  sealed trait concat extends BidirectionalMergeMode
  @scala.inline
  def concat: concat = "concat".asInstanceOf[concat]
  
  @js.native
  sealed trait constant_ extends _InitializerIdentifier
  @scala.inline
  def constant_ : constant_ = "constant".asInstanceOf[constant_]
  
  @js.native
  sealed trait cosine_proximity extends StObject
  @scala.inline
  def cosine_proximity: cosine_proximity = "cosine_proximity".asInstanceOf[cosine_proximity]
  
  @js.native
  sealed trait cpu extends StObject
  @scala.inline
  def cpu: cpu = "cpu".asInstanceOf[cpu]
  
  @js.native
  sealed trait dtype extends StObject
  @scala.inline
  def dtype: dtype = "dtype".asInstanceOf[dtype]
  
  @js.native
  sealed trait elu_ extends ActivationIdentifier
  @scala.inline
  def elu_ : elu_ = "elu".asInstanceOf[elu_]
  
  @js.native
  sealed trait epoch extends _YieldEveryOptions
  @scala.inline
  def epoch: epoch = "epoch".asInstanceOf[epoch]
  
  @js.native
  sealed trait fanAvg extends FanMode
  @scala.inline
  def fanAvg: fanAvg = "fanAvg".asInstanceOf[fanAvg]
  
  @js.native
  sealed trait fanIn extends FanMode
  @scala.inline
  def fanIn: fanIn = "fanIn".asInstanceOf[fanIn]
  
  @js.native
  sealed trait fanOut extends FanMode
  @scala.inline
  def fanOut: fanOut = "fanOut".asInstanceOf[fanOut]
  
  @js.native
  sealed trait fan_avg extends FanModeSerialization
  @scala.inline
  def fan_avg: fan_avg = "fan_avg".asInstanceOf[fan_avg]
  
  @js.native
  sealed trait fan_in extends FanModeSerialization
  @scala.inline
  def fan_in: fan_in = "fan_in".asInstanceOf[fan_in]
  
  @js.native
  sealed trait fan_out extends FanModeSerialization
  @scala.inline
  def fan_out: fan_out = "fan_out".asInstanceOf[fan_out]
  
  @js.native
  sealed trait float32 extends DataType
  @scala.inline
  def float32: float32 = "float32".asInstanceOf[float32]
  
  @js.native
  sealed trait glorotNormal extends _InitializerIdentifier
  @scala.inline
  def glorotNormal: glorotNormal = "glorotNormal".asInstanceOf[glorotNormal]
  
  @js.native
  sealed trait glorotUniform extends _InitializerIdentifier
  @scala.inline
  def glorotUniform: glorotUniform = "glorotUniform".asInstanceOf[glorotUniform]
  
  @js.native
  sealed trait hardSigmoid extends ActivationIdentifier
  @scala.inline
  def hardSigmoid: hardSigmoid = "hardSigmoid".asInstanceOf[hardSigmoid]
  
  @js.native
  sealed trait hard_sigmoid extends StObject
  @scala.inline
  def hard_sigmoid: hard_sigmoid = "hard_sigmoid".asInstanceOf[hard_sigmoid]
  
  @js.native
  sealed trait heNormal extends _InitializerIdentifier
  @scala.inline
  def heNormal: heNormal = "heNormal".asInstanceOf[heNormal]
  
  @js.native
  sealed trait heUniform extends _InitializerIdentifier
  @scala.inline
  def heUniform: heUniform = "heUniform".asInstanceOf[heUniform]
  
  @js.native
  sealed trait hinge extends StObject
  @scala.inline
  def hinge: hinge = "hinge".asInstanceOf[hinge]
  
  @js.native
  sealed trait identity_ extends _InitializerIdentifier
  @scala.inline
  def identity_ : identity_ = "identity".asInstanceOf[identity_]
  
  @js.native
  sealed trait input_dtype extends StObject
  @scala.inline
  def input_dtype: input_dtype = "input_dtype".asInstanceOf[input_dtype]
  
  @js.native
  sealed trait input_shape extends StObject
  @scala.inline
  def input_shape: input_shape = "input_shape".asInstanceOf[input_shape]
  
  @js.native
  sealed trait int32 extends DataType
  @scala.inline
  def int32: int32 = "int32".asInstanceOf[int32]
  
  @js.native
  sealed trait kullback_leibler_divergence extends StObject
  @scala.inline
  def kullback_leibler_divergence: kullback_leibler_divergence = "kullback_leibler_divergence".asInstanceOf[kullback_leibler_divergence]
  
  @js.native
  sealed trait l1l2_ extends StObject
  @scala.inline
  def l1l2_ : l1l2_ = "l1l2".asInstanceOf[l1l2_]
  
  @js.native
  sealed trait leCunNormal extends _InitializerIdentifier
  @scala.inline
  def leCunNormal: leCunNormal = "leCunNormal".asInstanceOf[leCunNormal]
  
  @js.native
  sealed trait leCunUniform extends _InitializerIdentifier
  @scala.inline
  def leCunUniform: leCunUniform = "leCunUniform".asInstanceOf[leCunUniform]
  
  @js.native
  sealed trait linear extends ActivationIdentifier
  @scala.inline
  def linear: linear = "linear".asInstanceOf[linear]
  
  @js.native
  sealed trait logcosh extends StObject
  @scala.inline
  def logcosh: logcosh = "logcosh".asInstanceOf[logcosh]
  
  @js.native
  sealed trait max extends PoolMode
  @scala.inline
  def max: max = "max".asInstanceOf[max]
  
  @js.native
  sealed trait maxNorm_ extends _ConstraintIdentifier
  @scala.inline
  def maxNorm_ : maxNorm_ = "maxNorm".asInstanceOf[maxNorm_]
  
  @js.native
  sealed trait mean_absolute_error extends StObject
  @scala.inline
  def mean_absolute_error: mean_absolute_error = "mean_absolute_error".asInstanceOf[mean_absolute_error]
  
  @js.native
  sealed trait mean_absolute_percentage_error extends StObject
  @scala.inline
  def mean_absolute_percentage_error: mean_absolute_percentage_error = "mean_absolute_percentage_error".asInstanceOf[mean_absolute_percentage_error]
  
  @js.native
  sealed trait mean_squared_error extends StObject
  @scala.inline
  def mean_squared_error: mean_squared_error = "mean_squared_error".asInstanceOf[mean_squared_error]
  
  @js.native
  sealed trait mean_squared_logarithmic_error extends StObject
  @scala.inline
  def mean_squared_logarithmic_error: mean_squared_logarithmic_error = "mean_squared_logarithmic_error".asInstanceOf[mean_squared_logarithmic_error]
  
  @js.native
  sealed trait min extends StObject
  @scala.inline
  def min: min = "min".asInstanceOf[min]
  
  @js.native
  sealed trait minMaxNorm_ extends _ConstraintIdentifier
  @scala.inline
  def minMaxNorm_ : minMaxNorm_ = "minMaxNorm".asInstanceOf[minMaxNorm_]
  
  @js.native
  sealed trait mul extends BidirectionalMergeMode
  @scala.inline
  def mul: mul = "mul".asInstanceOf[mul]
  
  @js.native
  sealed trait name extends StObject
  @scala.inline
  def name: name = "name".asInstanceOf[name]
  
  @js.native
  sealed trait never extends _YieldEveryOptions
  @scala.inline
  def never: never = "never".asInstanceOf[never]
  
  @js.native
  sealed trait nonNeg_ extends _ConstraintIdentifier
  @scala.inline
  def nonNeg_ : nonNeg_ = "nonNeg".asInstanceOf[nonNeg_]
  
  @js.native
  sealed trait normal
    extends Distribution
       with DistributionSerialization
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait ones_ extends _InitializerIdentifier
  @scala.inline
  def ones_ : ones_ = "ones".asInstanceOf[ones_]
  
  @js.native
  sealed trait orthogonal_ extends _InitializerIdentifier
  @scala.inline
  def orthogonal_ : orthogonal_ = "orthogonal".asInstanceOf[orthogonal_]
  
  @js.native
  sealed trait poisson extends StObject
  @scala.inline
  def poisson: poisson = "poisson".asInstanceOf[poisson]
  
  @js.native
  sealed trait randomNormal_ extends _InitializerIdentifier
  @scala.inline
  def randomNormal_ : randomNormal_ = "randomNormal".asInstanceOf[randomNormal_]
  
  @js.native
  sealed trait randomUniform_ extends _InitializerIdentifier
  @scala.inline
  def randomUniform_ : randomUniform_ = "randomUniform".asInstanceOf[randomUniform_]
  
  @js.native
  sealed trait relu6 extends ActivationIdentifier
  @scala.inline
  def relu6: relu6 = "relu6".asInstanceOf[relu6]
  
  @js.native
  sealed trait relu_ extends ActivationIdentifier
  @scala.inline
  def relu_ : relu_ = "relu".asInstanceOf[relu_]
  
  @js.native
  sealed trait same extends PaddingMode
  @scala.inline
  def same: same = "same".asInstanceOf[same]
  
  @js.native
  sealed trait selu extends ActivationIdentifier
  @scala.inline
  def selu: selu = "selu".asInstanceOf[selu]
  
  @js.native
  sealed trait sigmoid extends ActivationIdentifier
  @scala.inline
  def sigmoid: sigmoid = "sigmoid".asInstanceOf[sigmoid]
  
  @js.native
  sealed trait softmax_ extends ActivationIdentifier
  @scala.inline
  def softmax_ : softmax_ = "softmax".asInstanceOf[softmax_]
  
  @js.native
  sealed trait softplus extends ActivationIdentifier
  @scala.inline
  def softplus: softplus = "softplus".asInstanceOf[softplus]
  
  @js.native
  sealed trait softsign extends ActivationIdentifier
  @scala.inline
  def softsign: softsign = "softsign".asInstanceOf[softsign]
  
  @js.native
  sealed trait sparse_categorical_crossentropy extends StObject
  @scala.inline
  def sparse_categorical_crossentropy: sparse_categorical_crossentropy = "sparse_categorical_crossentropy".asInstanceOf[sparse_categorical_crossentropy]
  
  @js.native
  sealed trait squared_hinge extends StObject
  @scala.inline
  def squared_hinge: squared_hinge = "squared_hinge".asInstanceOf[squared_hinge]
  
  @js.native
  sealed trait string extends DataType
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait sum extends BidirectionalMergeMode
  @scala.inline
  def sum: sum = "sum".asInstanceOf[sum]
  
  @js.native
  sealed trait tanh extends ActivationIdentifier
  @scala.inline
  def tanh: tanh = "tanh".asInstanceOf[tanh]
  
  @js.native
  sealed trait temporal extends StObject
  @scala.inline
  def temporal: temporal = "temporal".asInstanceOf[temporal]
  
  @js.native
  sealed trait trainable extends StObject
  @scala.inline
  def trainable: trainable = "trainable".asInstanceOf[trainable]
  
  @js.native
  sealed trait truncatedNormal_
    extends Distribution
       with _InitializerIdentifier
  @scala.inline
  def truncatedNormal_ : truncatedNormal_ = "truncatedNormal".asInstanceOf[truncatedNormal_]
  
  @js.native
  sealed trait truncated_normal extends DistributionSerialization
  @scala.inline
  def truncated_normal: truncated_normal = "truncated_normal".asInstanceOf[truncated_normal]
  
  @js.native
  sealed trait uniform
    extends Distribution
       with DistributionSerialization
  @scala.inline
  def uniform: uniform = "uniform".asInstanceOf[uniform]
  
  @js.native
  sealed trait unitNorm_ extends _ConstraintIdentifier
  @scala.inline
  def unitNorm_ : unitNorm_ = "unitNorm".asInstanceOf[unitNorm_]
  
  @js.native
  sealed trait valid extends PaddingMode
  @scala.inline
  def valid: valid = "valid".asInstanceOf[valid]
  
  @js.native
  sealed trait varianceScaling_ extends _InitializerIdentifier
  @scala.inline
  def varianceScaling_ : varianceScaling_ = "varianceScaling".asInstanceOf[varianceScaling_]
  
  @js.native
  sealed trait webgl extends StObject
  @scala.inline
  def webgl: webgl = "webgl".asInstanceOf[webgl]
  
  @js.native
  sealed trait zeros_ extends _InitializerIdentifier
  @scala.inline
  def zeros_ : zeros_ = "zeros".asInstanceOf[zeros_]
}
