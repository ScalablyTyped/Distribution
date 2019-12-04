package typings.atTensorflowTfjsDashLayers

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/utils/types_utils", JSImport.Namespace)
@js.native
object distUtilsTypesUnderscoreUtilsMod extends js.Object {
  def getExactlyOneShape(shapes: js.Array[Shape] | Shape): Shape = js.native
  def getExactlyOneTensor(xs: js.Array[Tensor[Rank]]): Tensor[Rank] = js.native
  def getExactlyOneTensor(xs: Tensor[Rank]): Tensor[Rank] = js.native
  def isArrayOfShapes(x: js.Array[Shape] | Shape): Boolean = js.native
  def normalizeShapeList(x: js.Array[Shape] | Shape): js.Array[Shape] = js.native
}

