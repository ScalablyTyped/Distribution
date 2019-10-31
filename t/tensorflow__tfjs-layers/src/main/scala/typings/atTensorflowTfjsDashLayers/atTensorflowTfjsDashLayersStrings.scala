package typings.atTensorflowTfjsDashLayers

import typings.atTensorflowTfjsDashLayers.distBaseUnderscoreCallbacksMod._YieldEveryOptions
import typings.atTensorflowTfjsDashLayers.distConstraintsMod._ConstraintIdentifier
import typings.atTensorflowTfjsDashLayers.distInitializersMod._InitializerIdentifier
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatActivationUnderscoreConfigMod.ActivationIdentifier
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.BidirectionalMergeMode
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.DataFormat
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.DataFormatSerialization
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.DataType
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.PaddingMode
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.PoolMode
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatInitializerUnderscoreConfigMod.Distribution
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatInitializerUnderscoreConfigMod.DistributionSerialization
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatInitializerUnderscoreConfigMod.FanMode
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatInitializerUnderscoreConfigMod.FanModeSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atTensorflowTfjsDashLayersStrings {
  @js.native
  sealed trait `1DOT3DOT1` extends js.Object
  
  @js.native
  sealed trait Adadelta extends js.Object
  
  @js.native
  sealed trait Adagrad extends js.Object
  
  @js.native
  sealed trait Adam extends js.Object
  
  @js.native
  sealed trait Adamax extends js.Object
  
  @js.native
  sealed trait Constant extends js.Object
  
  @js.native
  sealed trait Identity extends js.Object
  
  @js.native
  sealed trait InputLayer extends js.Object
  
  @js.native
  sealed trait MaxNorm extends js.Object
  
  @js.native
  sealed trait MinMaxNorm extends js.Object
  
  @js.native
  sealed trait Momentum extends js.Object
  
  @js.native
  sealed trait NonNeg extends js.Object
  
  @js.native
  sealed trait Ones extends js.Object
  
  @js.native
  sealed trait Orthogonal extends js.Object
  
  @js.native
  sealed trait PyJson extends js.Object
  
  @js.native
  sealed trait RMSProp extends js.Object
  
  @js.native
  sealed trait RandomNormal extends js.Object
  
  @js.native
  sealed trait RandomUniform extends js.Object
  
  @js.native
  sealed trait SGD extends js.Object
  
  @js.native
  sealed trait TruncatedNormal extends js.Object
  
  @js.native
  sealed trait UnitNorm extends js.Object
  
  @js.native
  sealed trait VarianceScaling extends js.Object
  
  @js.native
  sealed trait Zeros extends js.Object
  
  @js.native
  sealed trait auto extends _YieldEveryOptions
  
  @js.native
  sealed trait ave extends BidirectionalMergeMode
  
  @js.native
  sealed trait avg extends PoolMode
  
  @js.native
  sealed trait batch extends _YieldEveryOptions
  
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
  sealed trait constant extends _InitializerIdentifier
  
  @js.native
  sealed trait cosine_proximity extends js.Object
  
  @js.native
  sealed trait elu extends ActivationIdentifier
  
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
  sealed trait identity extends _InitializerIdentifier
  
  @js.native
  sealed trait int32 extends DataType
  
  @js.native
  sealed trait kullback_leibler_divergence extends js.Object
  
  @js.native
  sealed trait l1l2 extends js.Object
  
  @js.native
  sealed trait leCunNormal extends _InitializerIdentifier
  
  @js.native
  sealed trait leCunUniform extends _InitializerIdentifier
  
  @js.native
  sealed trait linear extends ActivationIdentifier
  
  @js.native
  sealed trait logSoftmax extends js.Object
  
  @js.native
  sealed trait logcosh extends js.Object
  
  @js.native
  sealed trait max extends PoolMode
  
  @js.native
  sealed trait maxNorm extends _ConstraintIdentifier
  
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
  sealed trait minMaxNorm extends _ConstraintIdentifier
  
  @js.native
  sealed trait mul extends BidirectionalMergeMode
  
  @js.native
  sealed trait never extends _YieldEveryOptions
  
  @js.native
  sealed trait nonNeg extends _ConstraintIdentifier
  
  @js.native
  sealed trait normal
    extends Distribution
       with DistributionSerialization
  
  @js.native
  sealed trait ones extends _InitializerIdentifier
  
  @js.native
  sealed trait orthogonal extends _InitializerIdentifier
  
  @js.native
  sealed trait poisson extends js.Object
  
  @js.native
  sealed trait randomNormal extends _InitializerIdentifier
  
  @js.native
  sealed trait randomUniform extends _InitializerIdentifier
  
  @js.native
  sealed trait relu extends ActivationIdentifier
  
  @js.native
  sealed trait relu6 extends ActivationIdentifier
  
  @js.native
  sealed trait same extends PaddingMode
  
  @js.native
  sealed trait selu extends ActivationIdentifier
  
  @js.native
  sealed trait sigmoid extends ActivationIdentifier
  
  @js.native
  sealed trait softmax extends ActivationIdentifier
  
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
  sealed trait truncatedNormal
    extends Distribution
       with _InitializerIdentifier
  
  @js.native
  sealed trait truncated_normal extends DistributionSerialization
  
  @js.native
  sealed trait uniform
    extends Distribution
       with DistributionSerialization
  
  @js.native
  sealed trait unitNorm extends _ConstraintIdentifier
  
  @js.native
  sealed trait valid extends PaddingMode
  
  @js.native
  sealed trait varianceScaling extends _InitializerIdentifier
  
  @js.native
  sealed trait zeros extends _InitializerIdentifier
  
  @scala.inline
  def `1DOT3DOT1`: `1DOT3DOT1` = "1.3.1".asInstanceOf[`1DOT3DOT1`]
  @scala.inline
  def Adadelta: Adadelta = "Adadelta".asInstanceOf[Adadelta]
  @scala.inline
  def Adagrad: Adagrad = "Adagrad".asInstanceOf[Adagrad]
  @scala.inline
  def Adam: Adam = "Adam".asInstanceOf[Adam]
  @scala.inline
  def Adamax: Adamax = "Adamax".asInstanceOf[Adamax]
  @scala.inline
  def Constant: Constant = "Constant".asInstanceOf[Constant]
  @scala.inline
  def Identity: Identity = "Identity".asInstanceOf[Identity]
  @scala.inline
  def InputLayer: InputLayer = "InputLayer".asInstanceOf[InputLayer]
  @scala.inline
  def MaxNorm: MaxNorm = "MaxNorm".asInstanceOf[MaxNorm]
  @scala.inline
  def MinMaxNorm: MinMaxNorm = "MinMaxNorm".asInstanceOf[MinMaxNorm]
  @scala.inline
  def Momentum: Momentum = "Momentum".asInstanceOf[Momentum]
  @scala.inline
  def NonNeg: NonNeg = "NonNeg".asInstanceOf[NonNeg]
  @scala.inline
  def Ones: Ones = "Ones".asInstanceOf[Ones]
  @scala.inline
  def Orthogonal: Orthogonal = "Orthogonal".asInstanceOf[Orthogonal]
  @scala.inline
  def PyJson: PyJson = "PyJson".asInstanceOf[PyJson]
  @scala.inline
  def RMSProp: RMSProp = "RMSProp".asInstanceOf[RMSProp]
  @scala.inline
  def RandomNormal: RandomNormal = "RandomNormal".asInstanceOf[RandomNormal]
  @scala.inline
  def RandomUniform: RandomUniform = "RandomUniform".asInstanceOf[RandomUniform]
  @scala.inline
  def SGD: SGD = "SGD".asInstanceOf[SGD]
  @scala.inline
  def TruncatedNormal: TruncatedNormal = "TruncatedNormal".asInstanceOf[TruncatedNormal]
  @scala.inline
  def UnitNorm: UnitNorm = "UnitNorm".asInstanceOf[UnitNorm]
  @scala.inline
  def VarianceScaling: VarianceScaling = "VarianceScaling".asInstanceOf[VarianceScaling]
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
  def constant: constant = "constant".asInstanceOf[constant]
  @scala.inline
  def cosine_proximity: cosine_proximity = "cosine_proximity".asInstanceOf[cosine_proximity]
  @scala.inline
  def elu: elu = "elu".asInstanceOf[elu]
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
  def identity: identity = "identity".asInstanceOf[identity]
  @scala.inline
  def int32: int32 = "int32".asInstanceOf[int32]
  @scala.inline
  def kullback_leibler_divergence: kullback_leibler_divergence = "kullback_leibler_divergence".asInstanceOf[kullback_leibler_divergence]
  @scala.inline
  def l1l2: l1l2 = "l1l2".asInstanceOf[l1l2]
  @scala.inline
  def leCunNormal: leCunNormal = "leCunNormal".asInstanceOf[leCunNormal]
  @scala.inline
  def leCunUniform: leCunUniform = "leCunUniform".asInstanceOf[leCunUniform]
  @scala.inline
  def linear: linear = "linear".asInstanceOf[linear]
  @scala.inline
  def logSoftmax: logSoftmax = "logSoftmax".asInstanceOf[logSoftmax]
  @scala.inline
  def logcosh: logcosh = "logcosh".asInstanceOf[logcosh]
  @scala.inline
  def max: max = "max".asInstanceOf[max]
  @scala.inline
  def maxNorm: maxNorm = "maxNorm".asInstanceOf[maxNorm]
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
  def minMaxNorm: minMaxNorm = "minMaxNorm".asInstanceOf[minMaxNorm]
  @scala.inline
  def mul: mul = "mul".asInstanceOf[mul]
  @scala.inline
  def never: never = "never".asInstanceOf[never]
  @scala.inline
  def nonNeg: nonNeg = "nonNeg".asInstanceOf[nonNeg]
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  @scala.inline
  def ones: ones = "ones".asInstanceOf[ones]
  @scala.inline
  def orthogonal: orthogonal = "orthogonal".asInstanceOf[orthogonal]
  @scala.inline
  def poisson: poisson = "poisson".asInstanceOf[poisson]
  @scala.inline
  def randomNormal: randomNormal = "randomNormal".asInstanceOf[randomNormal]
  @scala.inline
  def randomUniform: randomUniform = "randomUniform".asInstanceOf[randomUniform]
  @scala.inline
  def relu: relu = "relu".asInstanceOf[relu]
  @scala.inline
  def relu6: relu6 = "relu6".asInstanceOf[relu6]
  @scala.inline
  def same: same = "same".asInstanceOf[same]
  @scala.inline
  def selu: selu = "selu".asInstanceOf[selu]
  @scala.inline
  def sigmoid: sigmoid = "sigmoid".asInstanceOf[sigmoid]
  @scala.inline
  def softmax: softmax = "softmax".asInstanceOf[softmax]
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
  def truncatedNormal: truncatedNormal = "truncatedNormal".asInstanceOf[truncatedNormal]
  @scala.inline
  def truncated_normal: truncated_normal = "truncated_normal".asInstanceOf[truncated_normal]
  @scala.inline
  def uniform: uniform = "uniform".asInstanceOf[uniform]
  @scala.inline
  def unitNorm: unitNorm = "unitNorm".asInstanceOf[unitNorm]
  @scala.inline
  def valid: valid = "valid".asInstanceOf[valid]
  @scala.inline
  def varianceScaling: varianceScaling = "varianceScaling".asInstanceOf[varianceScaling]
  @scala.inline
  def zeros: zeros = "zeros".asInstanceOf[zeros]
}

