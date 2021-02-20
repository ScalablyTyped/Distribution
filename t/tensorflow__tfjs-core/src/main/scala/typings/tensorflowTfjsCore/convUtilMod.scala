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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "computeConv2DInfo")
  @js.native
  def computeConv2DInfo(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same_ | valid_ | Double | ExplicitPadding,
    roundingMode: js.UndefOr[floor | round | ceil],
    depthwise: js.UndefOr[Boolean],
    dataFormat: js.UndefOr[channelsFirst | channelsLast]
  ): Conv2DInfo = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "computeConv3DInfo")
  @js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double | (js.Tuple3[Double, Double, Double]),
    dilations: Double | (js.Tuple3[Double, Double, Double]),
    pad: same_ | valid_ | Double,
    depthwise: js.UndefOr[Boolean],
    dataFormat: js.UndefOr[channelsFirst | channelsLast],
    roundingMode: js.UndefOr[floor | round | ceil]
  ): Conv3DInfo = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "computeDefaultPad")
  @js.native
  def computeDefaultPad(inputShape: js.Tuple2[Double, Double], fieldSize: Double, stride: Double): Double = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "computeDefaultPad")
  @js.native
  def computeDefaultPad(inputShape: js.Tuple2[Double, Double], fieldSize: Double, stride: Double, dilation: Double): Double = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "computeDefaultPad")
  @js.native
  def computeDefaultPad(inputShape: js.Tuple4[Double, Double, Double, Double], fieldSize: Double, stride: Double): Double = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "computeDefaultPad")
  @js.native
  def computeDefaultPad(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    fieldSize: Double,
    stride: Double,
    dilation: Double
  ): Double = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: valid_,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: valid_,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: same_,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: same_,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: valid_,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: valid_,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo_NHWC(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo_NHWC(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo_NHWC(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: Double,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo_NHWC(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: Double,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "computePool2DInfo")
  @js.native
  def computePool2DInfo(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterSize: (js.Tuple2[Double, Double]) | Double,
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same_ | valid_ | Double,
    roundingMode: js.UndefOr[floor | round | ceil],
    dataFormat: js.UndefOr[channelsFirst | channelsLast]
  ): Conv2DInfo = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "computePool3DInfo")
  @js.native
  def computePool3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterSize: Double | (js.Tuple3[Double, Double, Double]),
    strides: Double | (js.Tuple3[Double, Double, Double]),
    dilations: Double | (js.Tuple3[Double, Double, Double]),
    pad: same_ | valid_ | Double,
    roundingMode: js.UndefOr[floor | round | ceil],
    dataFormat: js.UndefOr[NDHWC | NCDHW]
  ): Conv3DInfo = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "convertConv2DDataFormat")
  @js.native
  def convertConv2DDataFormat_NCHW(dataFormat: NCHW): channelsLast | channelsFirst = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "convertConv2DDataFormat")
  @js.native
  def convertConv2DDataFormat_NHWC(dataFormat: NHWC): channelsLast | channelsFirst = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "eitherStridesOrDilationsAreOne")
  @js.native
  def eitherStridesOrDilationsAreOne(strides: js.Array[Double], dilations: js.Array[Double]): Boolean = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "eitherStridesOrDilationsAreOne")
  @js.native
  def eitherStridesOrDilationsAreOne(strides: js.Array[Double], dilations: Double): Boolean = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "eitherStridesOrDilationsAreOne")
  @js.native
  def eitherStridesOrDilationsAreOne(strides: Double, dilations: js.Array[Double]): Boolean = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "eitherStridesOrDilationsAreOne")
  @js.native
  def eitherStridesOrDilationsAreOne(strides: Double, dilations: Double): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "tupleValuesAreOne")
  @js.native
  def tupleValuesAreOne(param: js.Array[Double]): Boolean = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "tupleValuesAreOne")
  @js.native
  def tupleValuesAreOne(param: Double): Boolean = js.native
  
  @js.native
  trait Conv2DInfo extends StObject {
    
    var batchSize: Double = js.native
    
    var dataFormat: channelsFirst | channelsLast = js.native
    
    var dilationHeight: Double = js.native
    
    var dilationWidth: Double = js.native
    
    var effectiveFilterHeight: Double = js.native
    
    var effectiveFilterWidth: Double = js.native
    
    var filterHeight: Double = js.native
    
    var filterShape: js.Tuple4[Double, Double, Double, Double] = js.native
    
    var filterWidth: Double = js.native
    
    var inChannels: Double = js.native
    
    var inHeight: Double = js.native
    
    var inShape: js.Tuple4[Double, Double, Double, Double] = js.native
    
    var inWidth: Double = js.native
    
    var outChannels: Double = js.native
    
    var outHeight: Double = js.native
    
    var outShape: js.Tuple4[Double, Double, Double, Double] = js.native
    
    var outWidth: Double = js.native
    
    var padInfo: PadInfo = js.native
    
    var strideHeight: Double = js.native
    
    var strideWidth: Double = js.native
  }
  object Conv2DInfo {
    
    @scala.inline
    def apply(
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
    implicit class Conv2DInfoMutableBuilder[Self <: Conv2DInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataFormat(value: channelsFirst | channelsLast): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDilationHeight(value: Double): Self = StObject.set(x, "dilationHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDilationWidth(value: Double): Self = StObject.set(x, "dilationWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectiveFilterHeight(value: Double): Self = StObject.set(x, "effectiveFilterHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectiveFilterWidth(value: Double): Self = StObject.set(x, "effectiveFilterWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterHeight(value: Double): Self = StObject.set(x, "filterHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterShape(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "filterShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterWidth(value: Double): Self = StObject.set(x, "filterWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInChannels(value: Double): Self = StObject.set(x, "inChannels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInHeight(value: Double): Self = StObject.set(x, "inHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInShape(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "inShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInWidth(value: Double): Self = StObject.set(x, "inWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutChannels(value: Double): Self = StObject.set(x, "outChannels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutHeight(value: Double): Self = StObject.set(x, "outHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutShape(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "outShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutWidth(value: Double): Self = StObject.set(x, "outWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadInfo(value: PadInfo): Self = StObject.set(x, "padInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrideHeight(value: Double): Self = StObject.set(x, "strideHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrideWidth(value: Double): Self = StObject.set(x, "strideWidth", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Conv3DInfo extends StObject {
    
    var batchSize: Double = js.native
    
    var dataFormat: channelsFirst | channelsLast = js.native
    
    var dilationDepth: Double = js.native
    
    var dilationHeight: Double = js.native
    
    var dilationWidth: Double = js.native
    
    var effectiveFilterDepth: Double = js.native
    
    var effectiveFilterHeight: Double = js.native
    
    var effectiveFilterWidth: Double = js.native
    
    var filterDepth: Double = js.native
    
    var filterHeight: Double = js.native
    
    var filterShape: js.Tuple5[Double, Double, Double, Double, Double] = js.native
    
    var filterWidth: Double = js.native
    
    var inChannels: Double = js.native
    
    var inDepth: Double = js.native
    
    var inHeight: Double = js.native
    
    var inShape: js.Tuple5[Double, Double, Double, Double, Double] = js.native
    
    var inWidth: Double = js.native
    
    var outChannels: Double = js.native
    
    var outDepth: Double = js.native
    
    var outHeight: Double = js.native
    
    var outShape: js.Tuple5[Double, Double, Double, Double, Double] = js.native
    
    var outWidth: Double = js.native
    
    var padInfo: PadInfo3D = js.native
    
    var strideDepth: Double = js.native
    
    var strideHeight: Double = js.native
    
    var strideWidth: Double = js.native
  }
  object Conv3DInfo {
    
    @scala.inline
    def apply(
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
    implicit class Conv3DInfoMutableBuilder[Self <: Conv3DInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataFormat(value: channelsFirst | channelsLast): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDilationDepth(value: Double): Self = StObject.set(x, "dilationDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDilationHeight(value: Double): Self = StObject.set(x, "dilationHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDilationWidth(value: Double): Self = StObject.set(x, "dilationWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectiveFilterDepth(value: Double): Self = StObject.set(x, "effectiveFilterDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectiveFilterHeight(value: Double): Self = StObject.set(x, "effectiveFilterHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectiveFilterWidth(value: Double): Self = StObject.set(x, "effectiveFilterWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterDepth(value: Double): Self = StObject.set(x, "filterDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterHeight(value: Double): Self = StObject.set(x, "filterHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterShape(value: js.Tuple5[Double, Double, Double, Double, Double]): Self = StObject.set(x, "filterShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterWidth(value: Double): Self = StObject.set(x, "filterWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInChannels(value: Double): Self = StObject.set(x, "inChannels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInDepth(value: Double): Self = StObject.set(x, "inDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInHeight(value: Double): Self = StObject.set(x, "inHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInShape(value: js.Tuple5[Double, Double, Double, Double, Double]): Self = StObject.set(x, "inShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInWidth(value: Double): Self = StObject.set(x, "inWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutChannels(value: Double): Self = StObject.set(x, "outChannels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutDepth(value: Double): Self = StObject.set(x, "outDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutHeight(value: Double): Self = StObject.set(x, "outHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutShape(value: js.Tuple5[Double, Double, Double, Double, Double]): Self = StObject.set(x, "outShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutWidth(value: Double): Self = StObject.set(x, "outWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadInfo(value: PadInfo3D): Self = StObject.set(x, "padInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrideDepth(value: Double): Self = StObject.set(x, "strideDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrideHeight(value: Double): Self = StObject.set(x, "strideHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrideWidth(value: Double): Self = StObject.set(x, "strideWidth", value.asInstanceOf[js.Any])
    }
  }
  
  type ExplicitPadding = js.Tuple4[
    js.Tuple2[Double, Double], 
    js.Tuple2[Double, Double], 
    js.Tuple2[Double, Double], 
    js.Tuple2[Double, Double]
  ]
  
  @js.native
  trait PadInfo extends StObject {
    
    var bottom: Double = js.native
    
    var left: Double = js.native
    
    var right: Double = js.native
    
    var top: Double = js.native
    
    var `type`: PadType = js.native
  }
  object PadInfo {
    
    @scala.inline
    def apply(bottom: Double, left: Double, right: Double, top: Double, `type`: PadType): PadInfo = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PadInfo]
    }
    
    @scala.inline
    implicit class PadInfoMutableBuilder[Self <: PadInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: PadType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PadInfo3D extends StObject {
    
    var back: Double = js.native
    
    var bottom: Double = js.native
    
    var front: Double = js.native
    
    var left: Double = js.native
    
    var right: Double = js.native
    
    var top: Double = js.native
    
    var `type`: PadType = js.native
  }
  object PadInfo3D {
    
    @scala.inline
    def apply(
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
    implicit class PadInfo3DMutableBuilder[Self <: PadInfo3D] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBack(value: Double): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFront(value: Double): Self = StObject.set(x, "front", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: PadType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def EXPLICIT: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.EXPLICIT = "EXPLICIT".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.EXPLICIT]
    
    @scala.inline
    def NUMBER: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NUMBER = "NUMBER".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NUMBER]
    
    @scala.inline
    def SAME: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.SAME = "SAME".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.SAME]
    
    @scala.inline
    def VALID: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.VALID = "VALID".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.VALID]
  }
}
