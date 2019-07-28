package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank.R3
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank.R4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AlignCorners extends js.Object {
  def resizeBilinear(images: Tensor[R3 | R4], size: js.Tuple2[Double, Double], alignCorners: Boolean): Tensor[R3] = js.native
  def resizeNearestNeighbor(images: Tensor[R3 | R4], size: js.Tuple2[Double, Double], alignCorners: Boolean): Tensor[R3] = js.native
}

