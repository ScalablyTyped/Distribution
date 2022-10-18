package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distOpsConvUtilMod.ExplicitPadding
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.Rank.R3
import typings.tensorflowTfjsCore.distTypesMod.Rank.R4
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsConv2dBackpropFilterMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv2d_backprop_filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def conv2DBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def conv2DBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dataFormat: NCHW | NHWC
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def conv2DBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dataFormat: NCHW | NHWC,
    dimRoundingMode: ceil | floor | round
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def conv2DBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dataFormat: Unit,
    dimRoundingMode: ceil | floor | round
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def conv2DBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def conv2DBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dataFormat: NCHW | NHWC
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def conv2DBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dataFormat: NCHW | NHWC,
    dimRoundingMode: ceil | floor | round
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def conv2DBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dataFormat: Unit,
    dimRoundingMode: ceil | floor | round
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def conv2DBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def conv2DBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding,
    dataFormat: NCHW | NHWC
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def conv2DBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding,
    dataFormat: NCHW | NHWC,
    dimRoundingMode: ceil | floor | round
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def conv2DBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding,
    dataFormat: Unit,
    dimRoundingMode: ceil | floor | round
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def conv2DBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same_ | valid_
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def conv2DBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same_ | valid_,
    dataFormat: NCHW | NHWC
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def conv2DBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same_ | valid_,
    dataFormat: NCHW | NHWC,
    dimRoundingMode: ceil | floor | round
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def conv2DBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same_ | valid_,
    dataFormat: Unit,
    dimRoundingMode: ceil | floor | round
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def conv2DBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: Double
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def conv2DBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: Double,
    dataFormat: NCHW | NHWC
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def conv2DBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: Double,
    dataFormat: NCHW | NHWC,
    dimRoundingMode: ceil | floor | round
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def conv2DBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: Double,
    dataFormat: Unit,
    dimRoundingMode: ceil | floor | round
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def conv2DBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: ExplicitPadding
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def conv2DBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: ExplicitPadding,
    dataFormat: NCHW | NHWC
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def conv2DBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: ExplicitPadding,
    dataFormat: NCHW | NHWC,
    dimRoundingMode: ceil | floor | round
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def conv2DBackpropFilter(
    x: Tensor[R3 | R4],
    dy: Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: ExplicitPadding,
    dataFormat: Unit,
    dimRoundingMode: ceil | floor | round
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
}
