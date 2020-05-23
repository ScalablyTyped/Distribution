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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object tensorflowTfjsLayersStrings {
  @js.native
  sealed trait Activation
    extends CoreLayerClassName
       with KerasClassName
       with LayerClassName
  
  @js.native
  sealed trait Adadelta
    extends KerasClassName
       with OptimizerClassName
  
  @js.native
  sealed trait Adagrad
    extends KerasClassName
       with OptimizerClassName
  
  @js.native
  sealed trait Adam
    extends KerasClassName
       with OptimizerClassName
  
  @js.native
  sealed trait Adamax
    extends KerasClassName
       with OptimizerClassName
  
  @js.native
  sealed trait Add
    extends KerasClassName
       with LayerClassName
       with MergeLayerClassName
  
  @js.native
  sealed trait Average
    extends KerasClassName
       with LayerClassName
       with MergeLayerClassName
  
  @js.native
  sealed trait AveragePooling1D
    extends KerasClassName
       with LayerClassName
       with PoolingLayerClassName
  
  @js.native
  sealed trait AveragePooling2D
    extends KerasClassName
       with LayerClassName
       with PoolingLayerClassName
  
  @js.native
  sealed trait BatchNormalization
    extends KerasClassName
       with LayerClassName
  
  @js.native
  sealed trait Bidirectional extends WrapperLayerClassName
  
  @js.native
  sealed trait Concatenate
    extends KerasClassName
       with LayerClassName
       with MergeLayerClassName
  
  @js.native
  sealed trait Constant
    extends InitializerClassName
       with KerasClassName
  
  @js.native
  sealed trait Conv1D
    extends ConvolutionalLayerClassName
       with KerasClassName
       with LayerClassName
  
  @js.native
  sealed trait Conv2D
    extends ConvolutionalLayerClassName
       with KerasClassName
       with LayerClassName
  
  @js.native
  sealed trait Conv2DTranspose
    extends ConvolutionalLayerClassName
       with KerasClassName
       with LayerClassName
  
  @js.native
  sealed trait Cropping2D
    extends ConvolutionalLayerClassName
       with KerasClassName
       with LayerClassName
  
  @js.native
  sealed trait Dense
    extends CoreLayerClassName
       with KerasClassName
       with LayerClassName
  
  @js.native
  sealed trait DepthwiseConv2D
    extends KerasClassName
       with LayerClassName
  
  @js.native
  sealed trait Dot
    extends KerasClassName
       with LayerClassName
       with MergeLayerClassName
  
  @js.native
  sealed trait Dropout
    extends CoreLayerClassName
       with KerasClassName
       with LayerClassName
  
  @js.native
  sealed trait ELU
    extends AdvancedActivationLayerClassName
       with KerasClassName
       with LayerClassName
  
  @js.native
  sealed trait Embedding
    extends KerasClassName
       with LayerClassName
  
  @js.native
  sealed trait Flatten
    extends CoreLayerClassName
       with KerasClassName
       with LayerClassName
  
  @js.native
  sealed trait GRU
    extends KerasClassName
       with LayerClassName
       with RecurrentLayerClassName
  
  @js.native
  sealed trait GRUCell extends js.Object
  
  @js.native
  sealed trait GlobalAveragePooling1D
    extends KerasClassName
       with LayerClassName
       with PoolingLayerClassName
  
  @js.native
  sealed trait GlobalAveragePooling2D
    extends KerasClassName
       with LayerClassName
       with PoolingLayerClassName
  
  @js.native
  sealed trait GlobalMaxPooling1D
    extends KerasClassName
       with LayerClassName
       with PoolingLayerClassName
  
  @js.native
  sealed trait GlobalMaxPooling2D
    extends KerasClassName
       with LayerClassName
       with PoolingLayerClassName
  
  @js.native
  sealed trait Identity
    extends InitializerClassName
       with KerasClassName
  
  @js.native
  sealed trait InputLayer
    extends KerasClassName
       with LayerClassName
  
  @js.native
  sealed trait L1L2 extends KerasClassName
  
  @js.native
  sealed trait LSTM
    extends KerasClassName
       with LayerClassName
       with RecurrentLayerClassName
  
  @js.native
  sealed trait LSTMCell extends js.Object
  
  @js.native
  sealed trait LeakyReLU
    extends AdvancedActivationLayerClassName
       with KerasClassName
       with LayerClassName
  
  @js.native
  sealed trait Masking
    extends CoreLayerClassName
       with KerasClassName
       with LayerClassName
  
  @js.native
  sealed trait MaxNorm
    extends ConstraintClassName
       with KerasClassName
  
  @js.native
  sealed trait MaxPooling1D
    extends KerasClassName
       with LayerClassName
       with PoolingLayerClassName
  
  @js.native
  sealed trait MaxPooling2D
    extends KerasClassName
       with LayerClassName
       with PoolingLayerClassName
  
  @js.native
  sealed trait Maximum
    extends KerasClassName
       with LayerClassName
       with MergeLayerClassName
  
  @js.native
  sealed trait MinMaxNorm
    extends ConstraintClassName
       with KerasClassName
  
  @js.native
  sealed trait Minimum
    extends KerasClassName
       with LayerClassName
       with MergeLayerClassName
  
  @js.native
  sealed trait Model extends js.Object
  
  @js.native
  sealed trait Momentum
    extends KerasClassName
       with OptimizerClassName
  
  @js.native
  sealed trait Multiply
    extends KerasClassName
       with LayerClassName
       with MergeLayerClassName
  
  @js.native
  sealed trait NonNeg
    extends ConstraintClassName
       with KerasClassName
  
  @js.native
  sealed trait Ones
    extends InitializerClassName
       with KerasClassName
  
  @js.native
  sealed trait Orthogonal
    extends InitializerClassName
       with KerasClassName
  
  @js.native
  sealed trait PReLU
    extends AdvancedActivationLayerClassName
       with KerasClassName
       with LayerClassName
  
  @js.native
  sealed trait Permute
    extends CoreLayerClassName
       with KerasClassName
       with LayerClassName
  
  @js.native
  sealed trait PyJson extends js.Object
  
  @js.native
  sealed trait RMSProp
    extends KerasClassName
       with OptimizerClassName
  
  @js.native
  sealed trait RandomNormal
    extends InitializerClassName
       with KerasClassName
  
  @js.native
  sealed trait RandomUniform
    extends InitializerClassName
       with KerasClassName
  
  @js.native
  sealed trait ReLU
    extends AdvancedActivationLayerClassName
       with KerasClassName
       with LayerClassName
  
  @js.native
  sealed trait RepeatVector
    extends CoreLayerClassName
       with KerasClassName
       with LayerClassName
  
  @js.native
  sealed trait Reshape
    extends CoreLayerClassName
       with KerasClassName
       with LayerClassName
  
  @js.native
  sealed trait SGD
    extends KerasClassName
       with OptimizerClassName
  
  @js.native
  sealed trait SeparableConv2D
    extends ConvolutionalLayerClassName
       with KerasClassName
       with LayerClassName
  
  @js.native
  sealed trait Sequential extends js.Object
  
  @js.native
  sealed trait SimpleRNN
    extends KerasClassName
       with LayerClassName
       with RecurrentLayerClassName
  
  @js.native
  sealed trait SimpleRNNCell extends js.Object
  
  @js.native
  sealed trait Softmax
    extends AdvancedActivationLayerClassName
       with KerasClassName
       with LayerClassName
  
  @js.native
  sealed trait StackedRNNCells extends js.Object
  
  @js.native
  sealed trait ThresholdedReLU
    extends AdvancedActivationLayerClassName
       with KerasClassName
       with LayerClassName
  
  @js.native
  sealed trait TimeDistributed extends WrapperLayerClassName
  
  @js.native
  sealed trait TruncatedNormal
    extends InitializerClassName
       with KerasClassName
  
  @js.native
  sealed trait UnitNorm
    extends ConstraintClassName
       with KerasClassName
  
  @js.native
  sealed trait UpSampling2D
    extends ConvolutionalLayerClassName
       with KerasClassName
       with LayerClassName
  
  @js.native
  sealed trait VarianceScaling
    extends InitializerClassName
       with KerasClassName
  
  @js.native
  sealed trait ZeroPadding2D
    extends KerasClassName
       with LayerClassName
  
  @js.native
  sealed trait Zeros
    extends InitializerClassName
       with KerasClassName
  
  @js.native
  sealed trait auto extends _YieldEveryOptions
  
  @js.native
  sealed trait ave extends BidirectionalMergeMode
  
  @js.native
  sealed trait avg extends PoolMode
  
  @js.native
  sealed trait batch extends _YieldEveryOptions
  
  @js.native
  sealed trait batch_input_shape extends js.Object
  
  @js.native
  sealed trait batch_size extends js.Object
  
  @js.native
  sealed trait bool extends DataType
  
  @js.native
  sealed trait categorical_crossentropy extends js.Object
  
  @js.native
  sealed trait categorical_hinge extends js.Object
  
  @js.native
  sealed trait causal extends PaddingMode
  
  @js.native
  sealed trait channelsFirst extends DataFormat
  
  @js.native
  sealed trait channelsLast extends DataFormat
  
  @js.native
  sealed trait channels_first extends DataFormatSerialization
  
  @js.native
  sealed trait channels_last extends DataFormatSerialization
  
  @js.native
  sealed trait complex64 extends DataType
  
  @js.native
  sealed trait concat extends BidirectionalMergeMode
  
  @js.native
  sealed trait constant_ extends _InitializerIdentifier
  
  @js.native
  sealed trait cosine_proximity extends js.Object
  
  @js.native
  sealed trait cpu extends js.Object
  
  @js.native
  sealed trait dtype extends js.Object
  
  @js.native
  sealed trait elu_ extends ActivationIdentifier
  
  @js.native
  sealed trait epoch extends _YieldEveryOptions
  
  @js.native
  sealed trait fanAvg extends FanMode
  
  @js.native
  sealed trait fanIn extends FanMode
  
  @js.native
  sealed trait fanOut extends FanMode
  
  @js.native
  sealed trait fan_avg extends FanModeSerialization
  
  @js.native
  sealed trait fan_in extends FanModeSerialization
  
  @js.native
  sealed trait fan_out extends FanModeSerialization
  
  @js.native
  sealed trait float32 extends DataType
  
  @js.native
  sealed trait glorotNormal extends _InitializerIdentifier
  
  @js.native
  sealed trait glorotUniform extends _InitializerIdentifier
  
  @js.native
  sealed trait hardSigmoid extends ActivationIdentifier
  
  @js.native
  sealed trait hard_sigmoid extends js.Object
  
  @js.native
  sealed trait heNormal extends _InitializerIdentifier
  
  @js.native
  sealed trait heUniform extends _InitializerIdentifier
  
  @js.native
  sealed trait hinge extends js.Object
  
  @js.native
  sealed trait identity_ extends _InitializerIdentifier
  
  @js.native
  sealed trait input_dtype extends js.Object
  
  @js.native
  sealed trait input_shape extends js.Object
  
  @js.native
  sealed trait int32 extends DataType
  
  @js.native
  sealed trait kullback_leibler_divergence extends js.Object
  
  @js.native
  sealed trait l1l2_ extends js.Object
  
  @js.native
  sealed trait leCunNormal extends _InitializerIdentifier
  
  @js.native
  sealed trait leCunUniform extends _InitializerIdentifier
  
  @js.native
  sealed trait linear extends ActivationIdentifier
  
  @js.native
  sealed trait logcosh extends js.Object
  
  @js.native
  sealed trait max extends PoolMode
  
  @js.native
  sealed trait maxNorm_ extends _ConstraintIdentifier
  
  @js.native
  sealed trait mean_absolute_error extends js.Object
  
  @js.native
  sealed trait mean_absolute_percentage_error extends js.Object
  
  @js.native
  sealed trait mean_squared_error extends js.Object
  
  @js.native
  sealed trait mean_squared_logarithmic_error extends js.Object
  
  @js.native
  sealed trait min extends js.Object
  
  @js.native
  sealed trait minMaxNorm_ extends _ConstraintIdentifier
  
  @js.native
  sealed trait mul extends BidirectionalMergeMode
  
  @js.native
  sealed trait name extends js.Object
  
  @js.native
  sealed trait never extends _YieldEveryOptions
  
  @js.native
  sealed trait nonNeg_ extends _ConstraintIdentifier
  
  @js.native
  sealed trait normal
    extends Distribution
       with DistributionSerialization
  
  @js.native
  sealed trait ones_ extends _InitializerIdentifier
  
  @js.native
  sealed trait orthogonal_ extends _InitializerIdentifier
  
  @js.native
  sealed trait poisson extends js.Object
  
  @js.native
  sealed trait randomNormal_ extends _InitializerIdentifier
  
  @js.native
  sealed trait randomUniform_ extends _InitializerIdentifier
  
  @js.native
  sealed trait relu6 extends ActivationIdentifier
  
  @js.native
  sealed trait relu_ extends ActivationIdentifier
  
  @js.native
  sealed trait same extends PaddingMode
  
  @js.native
  sealed trait selu extends ActivationIdentifier
  
  @js.native
  sealed trait sigmoid extends ActivationIdentifier
  
  @js.native
  sealed trait softmax_ extends ActivationIdentifier
  
  @js.native
  sealed trait softplus extends ActivationIdentifier
  
  @js.native
  sealed trait softsign extends ActivationIdentifier
  
  @js.native
  sealed trait sparse_categorical_crossentropy extends js.Object
  
  @js.native
  sealed trait squared_hinge extends js.Object
  
  @js.native
  sealed trait string extends DataType
  
  @js.native
  sealed trait sum extends BidirectionalMergeMode
  
  @js.native
  sealed trait tanh extends ActivationIdentifier
  
  @js.native
  sealed trait temporal extends js.Object
  
  @js.native
  sealed trait trainable extends js.Object
  
  @js.native
  sealed trait truncatedNormal_
    extends Distribution
       with _InitializerIdentifier
  
  @js.native
  sealed trait truncated_normal extends DistributionSerialization
  
  @js.native
  sealed trait uniform
    extends Distribution
       with DistributionSerialization
  
  @js.native
  sealed trait unitNorm_ extends _ConstraintIdentifier
  
  @js.native
  sealed trait valid extends PaddingMode
  
  @js.native
  sealed trait varianceScaling_ extends _InitializerIdentifier
  
  @js.native
  sealed trait webgl extends js.Object
  
  @js.native
  sealed trait zeros_ extends _InitializerIdentifier
  
  @scala.inline
  def Activation: Activation = "Activation".asInstanceOf[Activation]
  @scala.inline
  def Adadelta: Adadelta = "Adadelta".asInstanceOf[Adadelta]
  @scala.inline
  def Adagrad: Adagrad = "Adagrad".asInstanceOf[Adagrad]
  @scala.inline
  def Adam: Adam = "Adam".asInstanceOf[Adam]
  @scala.inline
  def Adamax: Adamax = "Adamax".asInstanceOf[Adamax]
  @scala.inline
  def Add: Add = "Add".asInstanceOf[Add]
  @scala.inline
  def Average: Average = "Average".asInstanceOf[Average]
  @scala.inline
  def AveragePooling1D: AveragePooling1D = "AveragePooling1D".asInstanceOf[AveragePooling1D]
  @scala.inline
  def AveragePooling2D: AveragePooling2D = "AveragePooling2D".asInstanceOf[AveragePooling2D]
  @scala.inline
  def BatchNormalization: BatchNormalization = "BatchNormalization".asInstanceOf[BatchNormalization]
  @scala.inline
  def Bidirectional: Bidirectional = "Bidirectional".asInstanceOf[Bidirectional]
  @scala.inline
  def Concatenate: Concatenate = "Concatenate".asInstanceOf[Concatenate]
  @scala.inline
  def Constant: Constant = "Constant".asInstanceOf[Constant]
  @scala.inline
  def Conv1D: Conv1D = "Conv1D".asInstanceOf[Conv1D]
  @scala.inline
  def Conv2D: Conv2D = "Conv2D".asInstanceOf[Conv2D]
  @scala.inline
  def Conv2DTranspose: Conv2DTranspose = "Conv2DTranspose".asInstanceOf[Conv2DTranspose]
  @scala.inline
  def Cropping2D: Cropping2D = "Cropping2D".asInstanceOf[Cropping2D]
  @scala.inline
  def Dense: Dense = "Dense".asInstanceOf[Dense]
  @scala.inline
  def DepthwiseConv2D: DepthwiseConv2D = "DepthwiseConv2D".asInstanceOf[DepthwiseConv2D]
  @scala.inline
  def Dot: Dot = "Dot".asInstanceOf[Dot]
  @scala.inline
  def Dropout: Dropout = "Dropout".asInstanceOf[Dropout]
  @scala.inline
  def ELU: ELU = "ELU".asInstanceOf[ELU]
  @scala.inline
  def Embedding: Embedding = "Embedding".asInstanceOf[Embedding]
  @scala.inline
  def Flatten: Flatten = "Flatten".asInstanceOf[Flatten]
  @scala.inline
  def GRU: GRU = "GRU".asInstanceOf[GRU]
  @scala.inline
  def GRUCell: GRUCell = "GRUCell".asInstanceOf[GRUCell]
  @scala.inline
  def GlobalAveragePooling1D: GlobalAveragePooling1D = "GlobalAveragePooling1D".asInstanceOf[GlobalAveragePooling1D]
  @scala.inline
  def GlobalAveragePooling2D: GlobalAveragePooling2D = "GlobalAveragePooling2D".asInstanceOf[GlobalAveragePooling2D]
  @scala.inline
  def GlobalMaxPooling1D: GlobalMaxPooling1D = "GlobalMaxPooling1D".asInstanceOf[GlobalMaxPooling1D]
  @scala.inline
  def GlobalMaxPooling2D: GlobalMaxPooling2D = "GlobalMaxPooling2D".asInstanceOf[GlobalMaxPooling2D]
  @scala.inline
  def Identity: Identity = "Identity".asInstanceOf[Identity]
  @scala.inline
  def InputLayer: InputLayer = "InputLayer".asInstanceOf[InputLayer]
  @scala.inline
  def L1L2: L1L2 = "L1L2".asInstanceOf[L1L2]
  @scala.inline
  def LSTM: LSTM = "LSTM".asInstanceOf[LSTM]
  @scala.inline
  def LSTMCell: LSTMCell = "LSTMCell".asInstanceOf[LSTMCell]
  @scala.inline
  def LeakyReLU: LeakyReLU = "LeakyReLU".asInstanceOf[LeakyReLU]
  @scala.inline
  def Masking: Masking = "Masking".asInstanceOf[Masking]
  @scala.inline
  def MaxNorm: MaxNorm = "MaxNorm".asInstanceOf[MaxNorm]
  @scala.inline
  def MaxPooling1D: MaxPooling1D = "MaxPooling1D".asInstanceOf[MaxPooling1D]
  @scala.inline
  def MaxPooling2D: MaxPooling2D = "MaxPooling2D".asInstanceOf[MaxPooling2D]
  @scala.inline
  def Maximum: Maximum = "Maximum".asInstanceOf[Maximum]
  @scala.inline
  def MinMaxNorm: MinMaxNorm = "MinMaxNorm".asInstanceOf[MinMaxNorm]
  @scala.inline
  def Minimum: Minimum = "Minimum".asInstanceOf[Minimum]
  @scala.inline
  def Model: Model = "Model".asInstanceOf[Model]
  @scala.inline
  def Momentum: Momentum = "Momentum".asInstanceOf[Momentum]
  @scala.inline
  def Multiply: Multiply = "Multiply".asInstanceOf[Multiply]
  @scala.inline
  def NonNeg: NonNeg = "NonNeg".asInstanceOf[NonNeg]
  @scala.inline
  def Ones: Ones = "Ones".asInstanceOf[Ones]
  @scala.inline
  def Orthogonal: Orthogonal = "Orthogonal".asInstanceOf[Orthogonal]
  @scala.inline
  def PReLU: PReLU = "PReLU".asInstanceOf[PReLU]
  @scala.inline
  def Permute: Permute = "Permute".asInstanceOf[Permute]
  @scala.inline
  def PyJson: PyJson = "PyJson".asInstanceOf[PyJson]
  @scala.inline
  def RMSProp: RMSProp = "RMSProp".asInstanceOf[RMSProp]
  @scala.inline
  def RandomNormal: RandomNormal = "RandomNormal".asInstanceOf[RandomNormal]
  @scala.inline
  def RandomUniform: RandomUniform = "RandomUniform".asInstanceOf[RandomUniform]
  @scala.inline
  def ReLU: ReLU = "ReLU".asInstanceOf[ReLU]
  @scala.inline
  def RepeatVector: RepeatVector = "RepeatVector".asInstanceOf[RepeatVector]
  @scala.inline
  def Reshape: Reshape = "Reshape".asInstanceOf[Reshape]
  @scala.inline
  def SGD: SGD = "SGD".asInstanceOf[SGD]
  @scala.inline
  def SeparableConv2D: SeparableConv2D = "SeparableConv2D".asInstanceOf[SeparableConv2D]
  @scala.inline
  def Sequential: Sequential = "Sequential".asInstanceOf[Sequential]
  @scala.inline
  def SimpleRNN: SimpleRNN = "SimpleRNN".asInstanceOf[SimpleRNN]
  @scala.inline
  def SimpleRNNCell: SimpleRNNCell = "SimpleRNNCell".asInstanceOf[SimpleRNNCell]
  @scala.inline
  def Softmax: Softmax = "Softmax".asInstanceOf[Softmax]
  @scala.inline
  def StackedRNNCells: StackedRNNCells = "StackedRNNCells".asInstanceOf[StackedRNNCells]
  @scala.inline
  def ThresholdedReLU: ThresholdedReLU = "ThresholdedReLU".asInstanceOf[ThresholdedReLU]
  @scala.inline
  def TimeDistributed: TimeDistributed = "TimeDistributed".asInstanceOf[TimeDistributed]
  @scala.inline
  def TruncatedNormal: TruncatedNormal = "TruncatedNormal".asInstanceOf[TruncatedNormal]
  @scala.inline
  def UnitNorm: UnitNorm = "UnitNorm".asInstanceOf[UnitNorm]
  @scala.inline
  def UpSampling2D: UpSampling2D = "UpSampling2D".asInstanceOf[UpSampling2D]
  @scala.inline
  def VarianceScaling: VarianceScaling = "VarianceScaling".asInstanceOf[VarianceScaling]
  @scala.inline
  def ZeroPadding2D: ZeroPadding2D = "ZeroPadding2D".asInstanceOf[ZeroPadding2D]
  @scala.inline
  def Zeros: Zeros = "Zeros".asInstanceOf[Zeros]
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def ave: ave = "ave".asInstanceOf[ave]
  @scala.inline
  def avg: avg = "avg".asInstanceOf[avg]
  @scala.inline
  def batch: batch = "batch".asInstanceOf[batch]
  @scala.inline
  def batch_input_shape: batch_input_shape = "batch_input_shape".asInstanceOf[batch_input_shape]
  @scala.inline
  def batch_size: batch_size = "batch_size".asInstanceOf[batch_size]
  @scala.inline
  def bool: bool = "bool".asInstanceOf[bool]
  @scala.inline
  def categorical_crossentropy: categorical_crossentropy = "categorical_crossentropy".asInstanceOf[categorical_crossentropy]
  @scala.inline
  def categorical_hinge: categorical_hinge = "categorical_hinge".asInstanceOf[categorical_hinge]
  @scala.inline
  def causal: causal = "causal".asInstanceOf[causal]
  @scala.inline
  def channelsFirst: channelsFirst = "channelsFirst".asInstanceOf[channelsFirst]
  @scala.inline
  def channelsLast: channelsLast = "channelsLast".asInstanceOf[channelsLast]
  @scala.inline
  def channels_first: channels_first = "channels_first".asInstanceOf[channels_first]
  @scala.inline
  def channels_last: channels_last = "channels_last".asInstanceOf[channels_last]
  @scala.inline
  def complex64: complex64 = "complex64".asInstanceOf[complex64]
  @scala.inline
  def concat: concat = "concat".asInstanceOf[concat]
  @scala.inline
  def constant_ : constant_ = "constant".asInstanceOf[constant_]
  @scala.inline
  def cosine_proximity: cosine_proximity = "cosine_proximity".asInstanceOf[cosine_proximity]
  @scala.inline
  def cpu: cpu = "cpu".asInstanceOf[cpu]
  @scala.inline
  def dtype: dtype = "dtype".asInstanceOf[dtype]
  @scala.inline
  def elu_ : elu_ = "elu".asInstanceOf[elu_]
  @scala.inline
  def epoch: epoch = "epoch".asInstanceOf[epoch]
  @scala.inline
  def fanAvg: fanAvg = "fanAvg".asInstanceOf[fanAvg]
  @scala.inline
  def fanIn: fanIn = "fanIn".asInstanceOf[fanIn]
  @scala.inline
  def fanOut: fanOut = "fanOut".asInstanceOf[fanOut]
  @scala.inline
  def fan_avg: fan_avg = "fan_avg".asInstanceOf[fan_avg]
  @scala.inline
  def fan_in: fan_in = "fan_in".asInstanceOf[fan_in]
  @scala.inline
  def fan_out: fan_out = "fan_out".asInstanceOf[fan_out]
  @scala.inline
  def float32: float32 = "float32".asInstanceOf[float32]
  @scala.inline
  def glorotNormal: glorotNormal = "glorotNormal".asInstanceOf[glorotNormal]
  @scala.inline
  def glorotUniform: glorotUniform = "glorotUniform".asInstanceOf[glorotUniform]
  @scala.inline
  def hardSigmoid: hardSigmoid = "hardSigmoid".asInstanceOf[hardSigmoid]
  @scala.inline
  def hard_sigmoid: hard_sigmoid = "hard_sigmoid".asInstanceOf[hard_sigmoid]
  @scala.inline
  def heNormal: heNormal = "heNormal".asInstanceOf[heNormal]
  @scala.inline
  def heUniform: heUniform = "heUniform".asInstanceOf[heUniform]
  @scala.inline
  def hinge: hinge = "hinge".asInstanceOf[hinge]
  @scala.inline
  def identity_ : identity_ = "identity".asInstanceOf[identity_]
  @scala.inline
  def input_dtype: input_dtype = "input_dtype".asInstanceOf[input_dtype]
  @scala.inline
  def input_shape: input_shape = "input_shape".asInstanceOf[input_shape]
  @scala.inline
  def int32: int32 = "int32".asInstanceOf[int32]
  @scala.inline
  def kullback_leibler_divergence: kullback_leibler_divergence = "kullback_leibler_divergence".asInstanceOf[kullback_leibler_divergence]
  @scala.inline
  def l1l2_ : l1l2_ = "l1l2".asInstanceOf[l1l2_]
  @scala.inline
  def leCunNormal: leCunNormal = "leCunNormal".asInstanceOf[leCunNormal]
  @scala.inline
  def leCunUniform: leCunUniform = "leCunUniform".asInstanceOf[leCunUniform]
  @scala.inline
  def linear: linear = "linear".asInstanceOf[linear]
  @scala.inline
  def logcosh: logcosh = "logcosh".asInstanceOf[logcosh]
  @scala.inline
  def max: max = "max".asInstanceOf[max]
  @scala.inline
  def maxNorm_ : maxNorm_ = "maxNorm".asInstanceOf[maxNorm_]
  @scala.inline
  def mean_absolute_error: mean_absolute_error = "mean_absolute_error".asInstanceOf[mean_absolute_error]
  @scala.inline
  def mean_absolute_percentage_error: mean_absolute_percentage_error = "mean_absolute_percentage_error".asInstanceOf[mean_absolute_percentage_error]
  @scala.inline
  def mean_squared_error: mean_squared_error = "mean_squared_error".asInstanceOf[mean_squared_error]
  @scala.inline
  def mean_squared_logarithmic_error: mean_squared_logarithmic_error = "mean_squared_logarithmic_error".asInstanceOf[mean_squared_logarithmic_error]
  @scala.inline
  def min: min = "min".asInstanceOf[min]
  @scala.inline
  def minMaxNorm_ : minMaxNorm_ = "minMaxNorm".asInstanceOf[minMaxNorm_]
  @scala.inline
  def mul: mul = "mul".asInstanceOf[mul]
  @scala.inline
  def name: name = "name".asInstanceOf[name]
  @scala.inline
  def never: never = "never".asInstanceOf[never]
  @scala.inline
  def nonNeg_ : nonNeg_ = "nonNeg".asInstanceOf[nonNeg_]
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  @scala.inline
  def ones_ : ones_ = "ones".asInstanceOf[ones_]
  @scala.inline
  def orthogonal_ : orthogonal_ = "orthogonal".asInstanceOf[orthogonal_]
  @scala.inline
  def poisson: poisson = "poisson".asInstanceOf[poisson]
  @scala.inline
  def randomNormal_ : randomNormal_ = "randomNormal".asInstanceOf[randomNormal_]
  @scala.inline
  def randomUniform_ : randomUniform_ = "randomUniform".asInstanceOf[randomUniform_]
  @scala.inline
  def relu6: relu6 = "relu6".asInstanceOf[relu6]
  @scala.inline
  def relu_ : relu_ = "relu".asInstanceOf[relu_]
  @scala.inline
  def same: same = "same".asInstanceOf[same]
  @scala.inline
  def selu: selu = "selu".asInstanceOf[selu]
  @scala.inline
  def sigmoid: sigmoid = "sigmoid".asInstanceOf[sigmoid]
  @scala.inline
  def softmax_ : softmax_ = "softmax".asInstanceOf[softmax_]
  @scala.inline
  def softplus: softplus = "softplus".asInstanceOf[softplus]
  @scala.inline
  def softsign: softsign = "softsign".asInstanceOf[softsign]
  @scala.inline
  def sparse_categorical_crossentropy: sparse_categorical_crossentropy = "sparse_categorical_crossentropy".asInstanceOf[sparse_categorical_crossentropy]
  @scala.inline
  def squared_hinge: squared_hinge = "squared_hinge".asInstanceOf[squared_hinge]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def sum: sum = "sum".asInstanceOf[sum]
  @scala.inline
  def tanh: tanh = "tanh".asInstanceOf[tanh]
  @scala.inline
  def temporal: temporal = "temporal".asInstanceOf[temporal]
  @scala.inline
  def trainable: trainable = "trainable".asInstanceOf[trainable]
  @scala.inline
  def truncatedNormal_ : truncatedNormal_ = "truncatedNormal".asInstanceOf[truncatedNormal_]
  @scala.inline
  def truncated_normal: truncated_normal = "truncated_normal".asInstanceOf[truncated_normal]
  @scala.inline
  def uniform: uniform = "uniform".asInstanceOf[uniform]
  @scala.inline
  def unitNorm_ : unitNorm_ = "unitNorm".asInstanceOf[unitNorm_]
  @scala.inline
  def valid: valid = "valid".asInstanceOf[valid]
  @scala.inline
  def varianceScaling_ : varianceScaling_ = "varianceScaling".asInstanceOf[varianceScaling_]
  @scala.inline
  def webgl: webgl = "webgl".asInstanceOf[webgl]
  @scala.inline
  def zeros_ : zeros_ = "zeros".asInstanceOf[zeros_]
}

