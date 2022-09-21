package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.convUtilMod.ExplicitPadding
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

object conv2dBackpropInputMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv2d_backprop_input", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def conv2DBackpropInput(
    xShape: js.Tuple3[Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple3[Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dataFormat: NCHW | NHWC
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple3[Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dataFormat: NCHW | NHWC,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple3[Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dataFormat: Unit,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple3[Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double],
    pad: Double
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple3[Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dataFormat: NCHW | NHWC
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple3[Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dataFormat: NCHW | NHWC,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple3[Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dataFormat: Unit,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple3[Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple3[Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding,
    dataFormat: NCHW | NHWC
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple3[Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding,
    dataFormat: NCHW | NHWC,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple3[Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding,
    dataFormat: Unit,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple3[Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double,
    pad: same_ | valid_
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple3[Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double,
    pad: same_ | valid_,
    dataFormat: NCHW | NHWC
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple3[Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double,
    pad: same_ | valid_,
    dataFormat: NCHW | NHWC,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple3[Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double,
    pad: same_ | valid_,
    dataFormat: Unit,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple3[Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double,
    pad: Double
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple3[Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double,
    pad: Double,
    dataFormat: NCHW | NHWC
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple3[Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double,
    pad: Double,
    dataFormat: NCHW | NHWC,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple3[Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double,
    pad: Double,
    dataFormat: Unit,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple3[Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double,
    pad: ExplicitPadding
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple3[Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double,
    pad: ExplicitPadding,
    dataFormat: NCHW | NHWC
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple3[Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double,
    pad: ExplicitPadding,
    dataFormat: NCHW | NHWC,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple3[Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double,
    pad: ExplicitPadding,
    dataFormat: Unit,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dataFormat: NCHW | NHWC
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dataFormat: NCHW | NHWC,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dataFormat: Unit,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double],
    pad: Double
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dataFormat: NCHW | NHWC
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dataFormat: NCHW | NHWC,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dataFormat: Unit,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding,
    dataFormat: NCHW | NHWC
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding,
    dataFormat: NCHW | NHWC,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding,
    dataFormat: Unit,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double,
    pad: same_ | valid_
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double,
    pad: same_ | valid_,
    dataFormat: NCHW | NHWC
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double,
    pad: same_ | valid_,
    dataFormat: NCHW | NHWC,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double,
    pad: same_ | valid_,
    dataFormat: Unit,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double,
    pad: Double
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double,
    pad: Double,
    dataFormat: NCHW | NHWC
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double,
    pad: Double,
    dataFormat: NCHW | NHWC,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double,
    pad: Double,
    dataFormat: Unit,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double,
    pad: ExplicitPadding
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double,
    pad: ExplicitPadding,
    dataFormat: NCHW | NHWC
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double,
    pad: ExplicitPadding,
    dataFormat: NCHW | NHWC,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def conv2DBackpropInput(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double,
    pad: ExplicitPadding,
    dataFormat: Unit,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
}
