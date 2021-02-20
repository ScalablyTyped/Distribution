package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor5D
import typings.tensorflowTfjsCore.distTypesMod.Rank.R4
import typings.tensorflowTfjsCore.distTypesMod.Rank.R5
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conv3dBackpropFilterMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv3d_backprop_filter", "conv3DBackpropFilter")
  @js.native
  def conv3DBackpropFilter(
    x: Tensor[R4 | R5],
    dy: Tensor[R4 | R5],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same_
  ): Tensor5D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv3d_backprop_filter", "conv3DBackpropFilter")
  @js.native
  def conv3DBackpropFilter(
    x: Tensor[R4 | R5],
    dy: Tensor[R4 | R5],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: valid_
  ): Tensor5D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv3d_backprop_filter", "conv3DBackpropFilter")
  @js.native
  def conv3DBackpropFilter(
    x: Tensor[R4 | R5],
    dy: Tensor[R4 | R5],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: same_
  ): Tensor5D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv3d_backprop_filter", "conv3DBackpropFilter")
  @js.native
  def conv3DBackpropFilter(
    x: Tensor[R4 | R5],
    dy: Tensor[R4 | R5],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: valid_
  ): Tensor5D = js.native
}
