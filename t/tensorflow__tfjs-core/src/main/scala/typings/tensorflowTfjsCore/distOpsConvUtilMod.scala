package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCDHW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NDHWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.channelsFirst
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.channelsLast
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsConvUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkPadOnDimRoundingMode(opDesc: String, pad: valid_ | same_): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPadOnDimRoundingMode")(opDesc.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkPadOnDimRoundingMode(opDesc: String, pad: valid_ | same_, dimRoundingMode: floor | round | ceil): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPadOnDimRoundingMode")(opDesc.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkPadOnDimRoundingMode(opDesc: String, pad: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPadOnDimRoundingMode")(opDesc.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkPadOnDimRoundingMode(opDesc: String, pad: Double, dimRoundingMode: floor | round | ceil): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPadOnDimRoundingMode")(opDesc.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkPadOnDimRoundingMode(opDesc: String, pad: ExplicitPadding): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPadOnDimRoundingMode")(opDesc.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkPadOnDimRoundingMode(opDesc: String, pad: ExplicitPadding, dimRoundingMode: floor | round | ceil): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPadOnDimRoundingMode")(opDesc.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def computeConv2DInfo(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same_ | valid_ | Double | ExplicitPadding,
    roundingMode: js.UndefOr[floor | round | ceil],
    depthwise: js.UndefOr[Boolean],
    dataFormat: js.UndefOr[channelsFirst | channelsLast]
  ): Conv2DInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("computeConv2DInfo")(inShape.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], roundingMode.asInstanceOf[js.Any], depthwise.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Conv2DInfo]
  
  inline def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double | (js.Tuple3[Double, Double, Double]),
    dilations: Double | (js.Tuple3[Double, Double, Double]),
    pad: same_ | valid_ | Double,
    depthwise: js.UndefOr[Boolean],
    dataFormat: js.UndefOr[channelsFirst | channelsLast],
    roundingMode: js.UndefOr[floor | round | ceil]
  ): Conv3DInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("computeConv3DInfo")(inShape.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], depthwise.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], roundingMode.asInstanceOf[js.Any])).asInstanceOf[Conv3DInfo]
  
  inline def computeDefaultPad(inputShape: js.Tuple2[Double, Double], fieldSize: Double, stride: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDefaultPad")(inputShape.asInstanceOf[js.Any], fieldSize.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def computeDefaultPad(inputShape: js.Tuple2[Double, Double], fieldSize: Double, stride: Double, dilation: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDefaultPad")(inputShape.asInstanceOf[js.Any], fieldSize.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], dilation.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def computeDefaultPad(inputShape: js.Tuple4[Double, Double, Double, Double], fieldSize: Double, stride: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDefaultPad")(inputShape.asInstanceOf[js.Any], fieldSize.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def computeDefaultPad(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    fieldSize: Double,
    stride: Double,
    dilation: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDefaultPad")(inputShape.asInstanceOf[js.Any], fieldSize.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], dilation.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDilation2DInfo")(inputShape.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Conv2DInfo]
  inline def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDilation2DInfo")(inputShape.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Conv2DInfo]
  inline def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: same_ | valid_,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDilation2DInfo")(inputShape.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Conv2DInfo]
  inline def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: same_ | valid_,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDilation2DInfo")(inputShape.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Conv2DInfo]
  
  inline def computeDilation2DInfo_NHWC(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDilation2DInfo")(inputShape.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Conv2DInfo]
  inline def computeDilation2DInfo_NHWC(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDilation2DInfo")(inputShape.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Conv2DInfo]
  inline def computeDilation2DInfo_NHWC(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: Double,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDilation2DInfo")(inputShape.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Conv2DInfo]
  inline def computeDilation2DInfo_NHWC(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: Double,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDilation2DInfo")(inputShape.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Conv2DInfo]
  
  inline def computePool2DInfo(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterSize: (js.Tuple2[Double, Double]) | Double,
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same_ | valid_ | Double | ExplicitPadding,
    roundingMode: js.UndefOr[floor | round | ceil],
    dataFormat: js.UndefOr[channelsFirst | channelsLast]
  ): Conv2DInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("computePool2DInfo")(inShape.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], roundingMode.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Conv2DInfo]
  
  inline def computePool3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterSize: Double | (js.Tuple3[Double, Double, Double]),
    strides: Double | (js.Tuple3[Double, Double, Double]),
    dilations: Double | (js.Tuple3[Double, Double, Double]),
    pad: same_ | valid_ | Double,
    roundingMode: js.UndefOr[floor | round | ceil],
    dataFormat: js.UndefOr[NDHWC | NCDHW]
  ): Conv3DInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("computePool3DInfo")(inShape.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], roundingMode.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Conv3DInfo]
  
  inline def convertConv2DDataFormat(dataFormat: NHWC | NCHW): channelsLast | channelsFirst = ^.asInstanceOf[js.Dynamic].applyDynamic("convertConv2DDataFormat")(dataFormat.asInstanceOf[js.Any]).asInstanceOf[channelsLast | channelsFirst]
  
  inline def eitherStridesOrDilationsAreOne(strides: js.Array[Double], dilations: js.Array[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eitherStridesOrDilationsAreOne")(strides.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def eitherStridesOrDilationsAreOne(strides: js.Array[Double], dilations: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eitherStridesOrDilationsAreOne")(strides.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def eitherStridesOrDilationsAreOne(strides: Double, dilations: js.Array[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eitherStridesOrDilationsAreOne")(strides.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def eitherStridesOrDilationsAreOne(strides: Double, dilations: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eitherStridesOrDilationsAreOne")(strides.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def tupleValuesAreOne(param: js.Array[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("tupleValuesAreOne")(param.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def tupleValuesAreOne(param: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("tupleValuesAreOne")(param.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait Conv2DInfo extends StObject {
    
    var batchSize: Double
    
    var dataFormat: channelsFirst | channelsLast
    
    var dilationHeight: Double
    
    var dilationWidth: Double
    
    var effectiveFilterHeight: Double
    
    var effectiveFilterWidth: Double
    
    var filterHeight: Double
    
    var filterShape: js.Tuple4[Double, Double, Double, Double]
    
    var filterWidth: Double
    
    var inChannels: Double
    
    var inHeight: Double
    
    var inShape: js.Tuple4[Double, Double, Double, Double]
    
    var inWidth: Double
    
    var outChannels: Double
    
    var outHeight: Double
    
    var outShape: js.Tuple4[Double, Double, Double, Double]
    
    var outWidth: Double
    
    var padInfo: PadInfo
    
    var strideHeight: Double
    
    var strideWidth: Double
  }
  object Conv2DInfo {
    
    inline def apply(
      batchSize: Double,
      dataFormat: channelsFirst | channelsLast,
      dilationHeight: Double,
      dilationWidth: Double,
      effectiveFilterHeight: Double,
      effectiveFilterWidth: Double,
      filterHeight: Double,
      filterShape: js.Tuple4[Double, Double, Double, Double],
      filterWidth: Double,
      inChannels: Double,
      inHeight: Double,
      inShape: js.Tuple4[Double, Double, Double, Double],
      inWidth: Double,
      outChannels: Double,
      outHeight: Double,
      outShape: js.Tuple4[Double, Double, Double, Double],
      outWidth: Double,
      padInfo: PadInfo,
      strideHeight: Double,
      strideWidth: Double
    ): Conv2DInfo = {
      val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any], dataFormat = dataFormat.asInstanceOf[js.Any], dilationHeight = dilationHeight.asInstanceOf[js.Any], dilationWidth = dilationWidth.asInstanceOf[js.Any], effectiveFilterHeight = effectiveFilterHeight.asInstanceOf[js.Any], effectiveFilterWidth = effectiveFilterWidth.asInstanceOf[js.Any], filterHeight = filterHeight.asInstanceOf[js.Any], filterShape = filterShape.asInstanceOf[js.Any], filterWidth = filterWidth.asInstanceOf[js.Any], inChannels = inChannels.asInstanceOf[js.Any], inHeight = inHeight.asInstanceOf[js.Any], inShape = inShape.asInstanceOf[js.Any], inWidth = inWidth.asInstanceOf[js.Any], outChannels = outChannels.asInstanceOf[js.Any], outHeight = outHeight.asInstanceOf[js.Any], outShape = outShape.asInstanceOf[js.Any], outWidth = outWidth.asInstanceOf[js.Any], padInfo = padInfo.asInstanceOf[js.Any], strideHeight = strideHeight.asInstanceOf[js.Any], strideWidth = strideWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[Conv2DInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Conv2DInfo] (val x: Self) extends AnyVal {
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setDataFormat(value: channelsFirst | channelsLast): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
      
      inline def setDilationHeight(value: Double): Self = StObject.set(x, "dilationHeight", value.asInstanceOf[js.Any])
      
      inline def setDilationWidth(value: Double): Self = StObject.set(x, "dilationWidth", value.asInstanceOf[js.Any])
      
      inline def setEffectiveFilterHeight(value: Double): Self = StObject.set(x, "effectiveFilterHeight", value.asInstanceOf[js.Any])
      
      inline def setEffectiveFilterWidth(value: Double): Self = StObject.set(x, "effectiveFilterWidth", value.asInstanceOf[js.Any])
      
      inline def setFilterHeight(value: Double): Self = StObject.set(x, "filterHeight", value.asInstanceOf[js.Any])
      
      inline def setFilterShape(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "filterShape", value.asInstanceOf[js.Any])
      
      inline def setFilterWidth(value: Double): Self = StObject.set(x, "filterWidth", value.asInstanceOf[js.Any])
      
      inline def setInChannels(value: Double): Self = StObject.set(x, "inChannels", value.asInstanceOf[js.Any])
      
      inline def setInHeight(value: Double): Self = StObject.set(x, "inHeight", value.asInstanceOf[js.Any])
      
      inline def setInShape(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "inShape", value.asInstanceOf[js.Any])
      
      inline def setInWidth(value: Double): Self = StObject.set(x, "inWidth", value.asInstanceOf[js.Any])
      
      inline def setOutChannels(value: Double): Self = StObject.set(x, "outChannels", value.asInstanceOf[js.Any])
      
      inline def setOutHeight(value: Double): Self = StObject.set(x, "outHeight", value.asInstanceOf[js.Any])
      
      inline def setOutShape(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "outShape", value.asInstanceOf[js.Any])
      
      inline def setOutWidth(value: Double): Self = StObject.set(x, "outWidth", value.asInstanceOf[js.Any])
      
      inline def setPadInfo(value: PadInfo): Self = StObject.set(x, "padInfo", value.asInstanceOf[js.Any])
      
      inline def setStrideHeight(value: Double): Self = StObject.set(x, "strideHeight", value.asInstanceOf[js.Any])
      
      inline def setStrideWidth(value: Double): Self = StObject.set(x, "strideWidth", value.asInstanceOf[js.Any])
    }
  }
  
  trait Conv3DInfo extends StObject {
    
    var batchSize: Double
    
    var dataFormat: channelsFirst | channelsLast
    
    var dilationDepth: Double
    
    var dilationHeight: Double
    
    var dilationWidth: Double
    
    var effectiveFilterDepth: Double
    
    var effectiveFilterHeight: Double
    
    var effectiveFilterWidth: Double
    
    var filterDepth: Double
    
    var filterHeight: Double
    
    var filterShape: js.Tuple5[Double, Double, Double, Double, Double]
    
    var filterWidth: Double
    
    var inChannels: Double
    
    var inDepth: Double
    
    var inHeight: Double
    
    var inShape: js.Tuple5[Double, Double, Double, Double, Double]
    
    var inWidth: Double
    
    var outChannels: Double
    
    var outDepth: Double
    
    var outHeight: Double
    
    var outShape: js.Tuple5[Double, Double, Double, Double, Double]
    
    var outWidth: Double
    
    var padInfo: PadInfo3D
    
    var strideDepth: Double
    
    var strideHeight: Double
    
    var strideWidth: Double
  }
  object Conv3DInfo {
    
    inline def apply(
      batchSize: Double,
      dataFormat: channelsFirst | channelsLast,
      dilationDepth: Double,
      dilationHeight: Double,
      dilationWidth: Double,
      effectiveFilterDepth: Double,
      effectiveFilterHeight: Double,
      effectiveFilterWidth: Double,
      filterDepth: Double,
      filterHeight: Double,
      filterShape: js.Tuple5[Double, Double, Double, Double, Double],
      filterWidth: Double,
      inChannels: Double,
      inDepth: Double,
      inHeight: Double,
      inShape: js.Tuple5[Double, Double, Double, Double, Double],
      inWidth: Double,
      outChannels: Double,
      outDepth: Double,
      outHeight: Double,
      outShape: js.Tuple5[Double, Double, Double, Double, Double],
      outWidth: Double,
      padInfo: PadInfo3D,
      strideDepth: Double,
      strideHeight: Double,
      strideWidth: Double
    ): Conv3DInfo = {
      val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any], dataFormat = dataFormat.asInstanceOf[js.Any], dilationDepth = dilationDepth.asInstanceOf[js.Any], dilationHeight = dilationHeight.asInstanceOf[js.Any], dilationWidth = dilationWidth.asInstanceOf[js.Any], effectiveFilterDepth = effectiveFilterDepth.asInstanceOf[js.Any], effectiveFilterHeight = effectiveFilterHeight.asInstanceOf[js.Any], effectiveFilterWidth = effectiveFilterWidth.asInstanceOf[js.Any], filterDepth = filterDepth.asInstanceOf[js.Any], filterHeight = filterHeight.asInstanceOf[js.Any], filterShape = filterShape.asInstanceOf[js.Any], filterWidth = filterWidth.asInstanceOf[js.Any], inChannels = inChannels.asInstanceOf[js.Any], inDepth = inDepth.asInstanceOf[js.Any], inHeight = inHeight.asInstanceOf[js.Any], inShape = inShape.asInstanceOf[js.Any], inWidth = inWidth.asInstanceOf[js.Any], outChannels = outChannels.asInstanceOf[js.Any], outDepth = outDepth.asInstanceOf[js.Any], outHeight = outHeight.asInstanceOf[js.Any], outShape = outShape.asInstanceOf[js.Any], outWidth = outWidth.asInstanceOf[js.Any], padInfo = padInfo.asInstanceOf[js.Any], strideDepth = strideDepth.asInstanceOf[js.Any], strideHeight = strideHeight.asInstanceOf[js.Any], strideWidth = strideWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[Conv3DInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Conv3DInfo] (val x: Self) extends AnyVal {
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setDataFormat(value: channelsFirst | channelsLast): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
      
      inline def setDilationDepth(value: Double): Self = StObject.set(x, "dilationDepth", value.asInstanceOf[js.Any])
      
      inline def setDilationHeight(value: Double): Self = StObject.set(x, "dilationHeight", value.asInstanceOf[js.Any])
      
      inline def setDilationWidth(value: Double): Self = StObject.set(x, "dilationWidth", value.asInstanceOf[js.Any])
      
      inline def setEffectiveFilterDepth(value: Double): Self = StObject.set(x, "effectiveFilterDepth", value.asInstanceOf[js.Any])
      
      inline def setEffectiveFilterHeight(value: Double): Self = StObject.set(x, "effectiveFilterHeight", value.asInstanceOf[js.Any])
      
      inline def setEffectiveFilterWidth(value: Double): Self = StObject.set(x, "effectiveFilterWidth", value.asInstanceOf[js.Any])
      
      inline def setFilterDepth(value: Double): Self = StObject.set(x, "filterDepth", value.asInstanceOf[js.Any])
      
      inline def setFilterHeight(value: Double): Self = StObject.set(x, "filterHeight", value.asInstanceOf[js.Any])
      
      inline def setFilterShape(value: js.Tuple5[Double, Double, Double, Double, Double]): Self = StObject.set(x, "filterShape", value.asInstanceOf[js.Any])
      
      inline def setFilterWidth(value: Double): Self = StObject.set(x, "filterWidth", value.asInstanceOf[js.Any])
      
      inline def setInChannels(value: Double): Self = StObject.set(x, "inChannels", value.asInstanceOf[js.Any])
      
      inline def setInDepth(value: Double): Self = StObject.set(x, "inDepth", value.asInstanceOf[js.Any])
      
      inline def setInHeight(value: Double): Self = StObject.set(x, "inHeight", value.asInstanceOf[js.Any])
      
      inline def setInShape(value: js.Tuple5[Double, Double, Double, Double, Double]): Self = StObject.set(x, "inShape", value.asInstanceOf[js.Any])
      
      inline def setInWidth(value: Double): Self = StObject.set(x, "inWidth", value.asInstanceOf[js.Any])
      
      inline def setOutChannels(value: Double): Self = StObject.set(x, "outChannels", value.asInstanceOf[js.Any])
      
      inline def setOutDepth(value: Double): Self = StObject.set(x, "outDepth", value.asInstanceOf[js.Any])
      
      inline def setOutHeight(value: Double): Self = StObject.set(x, "outHeight", value.asInstanceOf[js.Any])
      
      inline def setOutShape(value: js.Tuple5[Double, Double, Double, Double, Double]): Self = StObject.set(x, "outShape", value.asInstanceOf[js.Any])
      
      inline def setOutWidth(value: Double): Self = StObject.set(x, "outWidth", value.asInstanceOf[js.Any])
      
      inline def setPadInfo(value: PadInfo3D): Self = StObject.set(x, "padInfo", value.asInstanceOf[js.Any])
      
      inline def setStrideDepth(value: Double): Self = StObject.set(x, "strideDepth", value.asInstanceOf[js.Any])
      
      inline def setStrideHeight(value: Double): Self = StObject.set(x, "strideHeight", value.asInstanceOf[js.Any])
      
      inline def setStrideWidth(value: Double): Self = StObject.set(x, "strideWidth", value.asInstanceOf[js.Any])
    }
  }
  
  type ExplicitPadding = js.Tuple4[
    js.Tuple2[Double, Double], 
    js.Tuple2[Double, Double], 
    js.Tuple2[Double, Double], 
    js.Tuple2[Double, Double]
  ]
  
  trait PadInfo extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
    
    var `type`: PadType
  }
  object PadInfo {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double, `type`: PadType): PadInfo = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PadInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PadInfo] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setType(value: PadType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait PadInfo3D extends StObject {
    
    var back: Double
    
    var bottom: Double
    
    var front: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
    
    var `type`: PadType
  }
  object PadInfo3D {
    
    inline def apply(
      back: Double,
      bottom: Double,
      front: Double,
      left: Double,
      right: Double,
      top: Double,
      `type`: PadType
    ): PadInfo3D = {
      val __obj = js.Dynamic.literal(back = back.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], front = front.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PadInfo3D]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PadInfo3D] (val x: Self) extends AnyVal {
      
      inline def setBack(value: Double): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setFront(value: Double): Self = StObject.set(x, "front", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setType(value: PadType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.SAME
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.VALID
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NUMBER
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.EXPLICIT
  */
  trait PadType extends StObject
  object PadType {
    
    inline def EXPLICIT: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.EXPLICIT = "EXPLICIT".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.EXPLICIT]
    
    inline def NUMBER: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NUMBER = "NUMBER".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NUMBER]
    
    inline def SAME: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.SAME = "SAME".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.SAME]
    
    inline def VALID: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.VALID = "VALID".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.VALID]
  }
}
