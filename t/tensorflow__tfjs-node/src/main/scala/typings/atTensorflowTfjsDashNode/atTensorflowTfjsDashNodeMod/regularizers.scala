package typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typings.atTensorflowTfjsDashLayers.distRegularizersMod.L1Args
import typings.atTensorflowTfjsDashLayers.distRegularizersMod.L1L2Args
import typings.atTensorflowTfjsDashLayers.distRegularizersMod.L2Args
import typings.atTensorflowTfjsDashLayers.distRegularizersMod.Regularizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "regularizers")
@js.native
object regularizers extends js.Object {
  def l1(): Regularizer = js.native
  def l1(config: L1Args): Regularizer = js.native
  def l1l2(): Regularizer = js.native
  def l1l2(config: L1L2Args): Regularizer = js.native
  def l2(): Regularizer = js.native
  def l2(config: L2Args): Regularizer = js.native
}

