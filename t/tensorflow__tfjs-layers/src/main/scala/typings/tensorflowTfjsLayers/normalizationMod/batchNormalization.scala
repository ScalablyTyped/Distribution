package typings.tensorflowTfjsLayers.normalizationMod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/normalization", "batchNormalization")
@js.native
object batchNormalization extends js.Object {
  
  def apply(x: Tensor[Rank], mean: Tensor[Rank], variance: Tensor[Rank]): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    mean: Tensor[Rank],
    variance: Tensor[Rank],
    beta: js.UndefOr[scala.Nothing],
    gamma: js.UndefOr[scala.Nothing],
    epsilon: Double
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    mean: Tensor[Rank],
    variance: Tensor[Rank],
    beta: js.UndefOr[scala.Nothing],
    gamma: Tensor[Rank]
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    mean: Tensor[Rank],
    variance: Tensor[Rank],
    beta: js.UndefOr[scala.Nothing],
    gamma: Tensor[Rank],
    epsilon: Double
  ): Tensor[Rank] = js.native
  def apply(x: Tensor[Rank], mean: Tensor[Rank], variance: Tensor[Rank], beta: Tensor[Rank]): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    mean: Tensor[Rank],
    variance: Tensor[Rank],
    beta: Tensor[Rank],
    gamma: js.UndefOr[scala.Nothing],
    epsilon: Double
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    mean: Tensor[Rank],
    variance: Tensor[Rank],
    beta: Tensor[Rank],
    gamma: Tensor[Rank]
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    mean: Tensor[Rank],
    variance: Tensor[Rank],
    beta: Tensor[Rank],
    gamma: Tensor[Rank],
    epsilon: Double
  ): Tensor[Rank] = js.native
}
