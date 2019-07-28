package typings.atTensorflowTfjsDashNode

import typings.atTensorflowTfjsDashCore.distIoTypesMod.IOHandler
import typings.atTensorflowTfjsDashCore.distIoTypesMod.TrainingConfig
import typings.atTensorflowTfjsDashCore.distIoTypesMod.WeightsManifestEntry
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_ModelTopology extends js.Object {
  def apply(modelTopology: js.Object): IOHandler = js.native
  def apply(modelTopology: js.Object, weightSpecs: js.Array[WeightsManifestEntry]): IOHandler = js.native
  def apply(modelTopology: js.Object, weightSpecs: js.Array[WeightsManifestEntry], weightData: ArrayBuffer): IOHandler = js.native
  def apply(
    modelTopology: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
}

