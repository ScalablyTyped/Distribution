package typings
package atTensorflowTfjsDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_ModelTopology extends js.Object {
  def apply(modelTopology: js.Object): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
  def apply(
    modelTopology: js.Object,
    weightSpecs: js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightsManifestEntry]
  ): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
  def apply(
    modelTopology: js.Object,
    weightSpecs: js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightsManifestEntry],
    weightData: stdLib.ArrayBuffer
  ): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
  def apply(
    modelTopology: js.Object,
    weightSpecs: js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightsManifestEntry],
    weightData: stdLib.ArrayBuffer,
    trainingConfig: atTensorflowTfjsDashCoreLib.distIoTypesMod.TrainingConfig
  ): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
}

