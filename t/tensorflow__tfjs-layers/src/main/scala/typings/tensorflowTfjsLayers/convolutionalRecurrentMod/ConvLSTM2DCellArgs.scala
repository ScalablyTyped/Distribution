package typings.tensorflowTfjsLayers.convolutionalRecurrentMod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.activationConfigMod.ActivationIdentifier
import typings.tensorflowTfjsLayers.constraintsMod.Constraint
import typings.tensorflowTfjsLayers.constraintsMod.ConstraintIdentifier
import typings.tensorflowTfjsLayers.initializersMod.Initializer
import typings.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.regularizersMod.Regularizer
import typings.tensorflowTfjsLayers.regularizersMod.RegularizerIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<@tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/layers/recurrent.LSTMCellLayerArgs, 'units'> */
/* Inlined parent @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/layers/convolutional_recurrent.ConvRNN2DCellArgs */
@js.native
trait ConvLSTM2DCellArgs extends js.Object {
  
  var activation: js.UndefOr[ActivationIdentifier] = js.native
  
  var batchInputShape: js.UndefOr[Shape] = js.native
  
  var batchSize: js.UndefOr[Double] = js.native
  
  var biasConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
  
  var biasInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
  
  var biasRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  
  /**
    * Format of the data, which determines the ordering of the dimensions in
    * the inputs.
    *
    * `channels_last` corresponds to inputs with shape
    *   `(batch, ..., channels)`
    *
    *  `channels_first` corresponds to inputs with shape `(batch, channels,
    * ...)`.
    *
    * Defaults to `channels_last`.
    */
  var dataFormat: js.UndefOr[DataFormat] = js.native
  
  /**
    * The dilation rate to use for the dilated convolution in each dimension.
    * Should be an integer or array of two or three integers.
    *
    * Currently, specifying any `dilationRate` value != 1 is incompatible with
    * specifying any `strides` value != 1.
    */
  var dilationRate: js.UndefOr[Double | js.Array[Double] | (js.Tuple2[Double, Double])] = js.native
  
  var dropout: js.UndefOr[Double] = js.native
  
  var dtype: js.UndefOr[DataType] = js.native
  
  /**
    * The dimensionality of the output space (i.e. the number of filters in the
    * convolution).
    */
  var filters: Double = js.native
  
  var implementation: js.UndefOr[Double] = js.native
  
  var inputDType: js.UndefOr[DataType] = js.native
  
  var inputShape: js.UndefOr[Shape] = js.native
  
  var kernelConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
  
  var kernelInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
  
  var kernelRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  
  /**
    * The dimensions of the convolution window. If kernelSize is a number, the
    * convolutional window will be square.
    */
  var kernelSize: Double | js.Array[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  /**
    * Padding mode.
    */
  var padding: js.UndefOr[PaddingMode] = js.native
  
  var recurrentActivation: js.UndefOr[ActivationIdentifier] = js.native
  
  var recurrentConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
  
  var recurrentDropout: js.UndefOr[Double] = js.native
  
  var recurrentInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
  
  var recurrentRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  
  /**
    * The strides of the convolution in each dimension. If strides is a number,
    * strides in both dimensions are equal.
    *
    * Specifying any stride value != 1 is incompatible with specifying any
    * `dilationRate` value != 1.
    */
  var strides: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var trainable: js.UndefOr[Boolean] = js.native
  
  var unitForgetBias: js.UndefOr[Boolean] = js.native
  
  var useBias: js.UndefOr[Boolean] = js.native
  
  var weights: js.UndefOr[js.Array[Tensor[Rank]]] = js.native
}
object ConvLSTM2DCellArgs {
  
  @scala.inline
  def apply(filters: Double, kernelSize: Double | js.Array[Double]): ConvLSTM2DCellArgs = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], kernelSize = kernelSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvLSTM2DCellArgs]
  }
  
  @scala.inline
  implicit class ConvLSTM2DCellArgsOps[Self <: ConvLSTM2DCellArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFilters(value: Double): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelSizeVarargs(value: Double*): Self = this.set("kernelSize", js.Array(value :_*))
    
    @scala.inline
    def setKernelSize(value: Double | js.Array[Double]): Self = this.set("kernelSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivation(value: ActivationIdentifier): Self = this.set("activation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivation: Self = this.set("activation", js.undefined)
    
    @scala.inline
    def setBatchInputShapeVarargs(value: (Null | Double)*): Self = this.set("batchInputShape", js.Array(value :_*))
    
    @scala.inline
    def setBatchInputShape(value: Shape): Self = this.set("batchInputShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchInputShape: Self = this.set("batchInputShape", js.undefined)
    
    @scala.inline
    def setBatchSize(value: Double): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchSize: Self = this.set("batchSize", js.undefined)
    
    @scala.inline
    def setBiasConstraint(value: ConstraintIdentifier | Constraint): Self = this.set("biasConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBiasConstraint: Self = this.set("biasConstraint", js.undefined)
    
    @scala.inline
    def setBiasInitializer(value: InitializerIdentifier | Initializer): Self = this.set("biasInitializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBiasInitializer: Self = this.set("biasInitializer", js.undefined)
    
    @scala.inline
    def setBiasRegularizer(value: RegularizerIdentifier | Regularizer): Self = this.set("biasRegularizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBiasRegularizer: Self = this.set("biasRegularizer", js.undefined)
    
    @scala.inline
    def setDataFormat(value: DataFormat): Self = this.set("dataFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataFormat: Self = this.set("dataFormat", js.undefined)
    
    @scala.inline
    def setDilationRateVarargs(value: Double*): Self = this.set("dilationRate", js.Array(value :_*))
    
    @scala.inline
    def setDilationRate(value: Double | js.Array[Double] | (js.Tuple2[Double, Double])): Self = this.set("dilationRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDilationRate: Self = this.set("dilationRate", js.undefined)
    
    @scala.inline
    def setDropout(value: Double): Self = this.set("dropout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropout: Self = this.set("dropout", js.undefined)
    
    @scala.inline
    def setDtype(value: DataType): Self = this.set("dtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDtype: Self = this.set("dtype", js.undefined)
    
    @scala.inline
    def setImplementation(value: Double): Self = this.set("implementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImplementation: Self = this.set("implementation", js.undefined)
    
    @scala.inline
    def setInputDType(value: DataType): Self = this.set("inputDType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputDType: Self = this.set("inputDType", js.undefined)
    
    @scala.inline
    def setInputShapeVarargs(value: (Null | Double)*): Self = this.set("inputShape", js.Array(value :_*))
    
    @scala.inline
    def setInputShape(value: Shape): Self = this.set("inputShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputShape: Self = this.set("inputShape", js.undefined)
    
    @scala.inline
    def setKernelConstraint(value: ConstraintIdentifier | Constraint): Self = this.set("kernelConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernelConstraint: Self = this.set("kernelConstraint", js.undefined)
    
    @scala.inline
    def setKernelInitializer(value: InitializerIdentifier | Initializer): Self = this.set("kernelInitializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernelInitializer: Self = this.set("kernelInitializer", js.undefined)
    
    @scala.inline
    def setKernelRegularizer(value: RegularizerIdentifier | Regularizer): Self = this.set("kernelRegularizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernelRegularizer: Self = this.set("kernelRegularizer", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPadding(value: PaddingMode): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setRecurrentActivation(value: ActivationIdentifier): Self = this.set("recurrentActivation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrentActivation: Self = this.set("recurrentActivation", js.undefined)
    
    @scala.inline
    def setRecurrentConstraint(value: ConstraintIdentifier | Constraint): Self = this.set("recurrentConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrentConstraint: Self = this.set("recurrentConstraint", js.undefined)
    
    @scala.inline
    def setRecurrentDropout(value: Double): Self = this.set("recurrentDropout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrentDropout: Self = this.set("recurrentDropout", js.undefined)
    
    @scala.inline
    def setRecurrentInitializer(value: InitializerIdentifier | Initializer): Self = this.set("recurrentInitializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrentInitializer: Self = this.set("recurrentInitializer", js.undefined)
    
    @scala.inline
    def setRecurrentRegularizer(value: RegularizerIdentifier | Regularizer): Self = this.set("recurrentRegularizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrentRegularizer: Self = this.set("recurrentRegularizer", js.undefined)
    
    @scala.inline
    def setStridesVarargs(value: Double*): Self = this.set("strides", js.Array(value :_*))
    
    @scala.inline
    def setStrides(value: Double | js.Array[Double]): Self = this.set("strides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrides: Self = this.set("strides", js.undefined)
    
    @scala.inline
    def setTrainable(value: Boolean): Self = this.set("trainable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainable: Self = this.set("trainable", js.undefined)
    
    @scala.inline
    def setUnitForgetBias(value: Boolean): Self = this.set("unitForgetBias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitForgetBias: Self = this.set("unitForgetBias", js.undefined)
    
    @scala.inline
    def setUseBias(value: Boolean): Self = this.set("useBias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseBias: Self = this.set("useBias", js.undefined)
    
    @scala.inline
    def setWeightsVarargs(value: Tensor[Rank]*): Self = this.set("weights", js.Array(value :_*))
    
    @scala.inline
    def setWeights(value: js.Array[Tensor[Rank]]): Self = this.set("weights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeights: Self = this.set("weights", js.undefined)
  }
}
