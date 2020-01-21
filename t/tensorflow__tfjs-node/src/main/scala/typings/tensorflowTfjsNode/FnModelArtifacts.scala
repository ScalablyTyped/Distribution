package typings.tensorflowTfjsNode

import typings.std.ArrayBuffer
import typings.tensorflowTfjsCore.typesMod.IOHandler
import typings.tensorflowTfjsCore.typesMod.ModelArtifacts
import typings.tensorflowTfjsCore.typesMod.TrainingConfig
import typings.tensorflowTfjsCore.typesMod.WeightsManifestEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnModelArtifacts extends js.Object {
  def apply(modelArtifacts: js.Object): IOHandler = js.native
  def apply(modelArtifacts: js.Object, weightSpecs: js.Array[WeightsManifestEntry]): IOHandler = js.native
  def apply(modelArtifacts: js.Object, weightSpecs: js.Array[WeightsManifestEntry], weightData: ArrayBuffer): IOHandler = js.native
  def apply(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  def apply(modelArtifacts: ModelArtifacts): IOHandler = js.native
  def apply(modelArtifacts: ModelArtifacts, weightSpecs: js.Array[WeightsManifestEntry]): IOHandler = js.native
  def apply(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: ArrayBuffer
  ): IOHandler = js.native
  def apply(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
}

