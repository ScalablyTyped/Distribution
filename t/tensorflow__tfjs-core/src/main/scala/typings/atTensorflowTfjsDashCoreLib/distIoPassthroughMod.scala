package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/passthrough", JSImport.Namespace)
@js.native
object distIoPassthroughMod extends js.Object {
  def fromMemory(modelTopology: js.Object): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
  def fromMemory(
    modelTopology: js.Object,
    weightSpecs: js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightsManifestEntry]
  ): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
  def fromMemory(
    modelTopology: js.Object,
    weightSpecs: js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightsManifestEntry],
    weightData: stdLib.ArrayBuffer
  ): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
  def fromMemory(
    modelTopology: js.Object,
    weightSpecs: js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightsManifestEntry],
    weightData: stdLib.ArrayBuffer,
    trainingConfig: atTensorflowTfjsDashCoreLib.distIoTypesMod.TrainingConfig
  ): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
  def withSaveHandler(
    saveHandler: js.Function1[
      /* artifacts */ atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelArtifacts, 
      js.Promise[atTensorflowTfjsDashCoreLib.distIoTypesMod.SaveResult]
    ]
  ): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
}

