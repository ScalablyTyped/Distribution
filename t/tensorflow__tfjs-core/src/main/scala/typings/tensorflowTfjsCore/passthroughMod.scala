package typings.tensorflowTfjsCore

import typings.std.ArrayBuffer
import typings.tensorflowTfjsCore.typesMod.IOHandler
import typings.tensorflowTfjsCore.typesMod.ModelArtifacts
import typings.tensorflowTfjsCore.typesMod.SaveResult
import typings.tensorflowTfjsCore.typesMod.TrainingConfig
import typings.tensorflowTfjsCore.typesMod.WeightsManifestEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object passthroughMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/io/passthrough", "fromMemory")
  @js.native
  def fromMemory(modelArtifacts: js.Object): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/passthrough", "fromMemory")
  @js.native
  def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.UndefOr[scala.Nothing],
    weightData: js.UndefOr[scala.Nothing],
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/passthrough", "fromMemory")
  @js.native
  def fromMemory(modelArtifacts: js.Object, weightSpecs: js.UndefOr[scala.Nothing], weightData: ArrayBuffer): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/passthrough", "fromMemory")
  @js.native
  def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.UndefOr[scala.Nothing],
    weightData: ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/passthrough", "fromMemory")
  @js.native
  def fromMemory(modelArtifacts: js.Object, weightSpecs: js.Array[WeightsManifestEntry]): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/passthrough", "fromMemory")
  @js.native
  def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.UndefOr[scala.Nothing],
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/passthrough", "fromMemory")
  @js.native
  def fromMemory(modelArtifacts: js.Object, weightSpecs: js.Array[WeightsManifestEntry], weightData: ArrayBuffer): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/passthrough", "fromMemory")
  @js.native
  def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/passthrough", "fromMemory")
  @js.native
  def fromMemory(modelArtifacts: ModelArtifacts): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/passthrough", "fromMemory")
  @js.native
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.UndefOr[scala.Nothing],
    weightData: js.UndefOr[scala.Nothing],
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/passthrough", "fromMemory")
  @js.native
  def fromMemory(modelArtifacts: ModelArtifacts, weightSpecs: js.UndefOr[scala.Nothing], weightData: ArrayBuffer): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/passthrough", "fromMemory")
  @js.native
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.UndefOr[scala.Nothing],
    weightData: ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/passthrough", "fromMemory")
  @js.native
  def fromMemory(modelArtifacts: ModelArtifacts, weightSpecs: js.Array[WeightsManifestEntry]): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/passthrough", "fromMemory")
  @js.native
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.UndefOr[scala.Nothing],
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/passthrough", "fromMemory")
  @js.native
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: ArrayBuffer
  ): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/passthrough", "fromMemory")
  @js.native
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/passthrough", "withSaveHandler")
  @js.native
  def withSaveHandler(saveHandler: js.Function1[/* artifacts */ ModelArtifacts, js.Promise[SaveResult]]): IOHandler = js.native
}
