package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.convUtilMod.ExplicitPadding
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.Rank.R3
import typings.tensorflowTfjsCore.distTypesMod.Rank.R4
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object depthwiseConv2dNativeBackpropFilterMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/depthwise_conv2d_native_backprop_filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dilations: js.Tuple2[Double, Double]
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dilations: js.Tuple2[Double, Double],
    dimRoundingMode: ceil | floor | round
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dilations: Double
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dilations: Double,
    dimRoundingMode: ceil | floor | round
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dilations: Unit,
    dimRoundingMode: ceil | floor | round
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dilations: js.Tuple2[Double, Double]
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dilations: js.Tuple2[Double, Double],
    dimRoundingMode: ceil | floor | round
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dilations: Double
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dilations: Double,
    dimRoundingMode: ceil | floor | round
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dilations: Unit,
    dimRoundingMode: ceil | floor | round
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding,
    dilations: js.Tuple2[Double, Double]
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding,
    dilations: js.Tuple2[Double, Double],
    dimRoundingMode: ceil | floor | round
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding,
    dilations: Double
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding,
    dilations: Double,
    dimRoundingMode: ceil | floor | round
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding,
    dilations: Unit,
    dimRoundingMode: ceil | floor | round
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same_ | valid_
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same_ | valid_,
    dilations: js.Tuple2[Double, Double]
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same_ | valid_,
    dilations: js.Tuple2[Double, Double],
    dimRoundingMode: ceil | floor | round
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same_ | valid_,
    dilations: Double
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same_ | valid_,
    dilations: Double,
    dimRoundingMode: ceil | floor | round
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same_ | valid_,
    dilations: Unit,
    dimRoundingMode: ceil | floor | round
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: Double
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: Double,
    dilations: js.Tuple2[Double, Double]
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: Double,
    dilations: js.Tuple2[Double, Double],
    dimRoundingMode: ceil | floor | round
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: Double,
    dilations: Double
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: Double,
    dilations: Double,
    dimRoundingMode: ceil | floor | round
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: Double,
    dilations: Unit,
    dimRoundingMode: ceil | floor | round
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: ExplicitPadding
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: ExplicitPadding,
    dilations: js.Tuple2[Double, Double]
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: ExplicitPadding,
    dilations: js.Tuple2[Double, Double],
    dimRoundingMode: ceil | floor | round
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: ExplicitPadding,
    dilations: Double
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: ExplicitPadding,
    dilations: Double,
    dimRoundingMode: ceil | floor | round
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def depthwiseConv2dNativeBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: ExplicitPadding,
    dilations: Unit,
    dimRoundingMode: ceil | floor | round
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
}
