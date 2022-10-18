package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distIoTypesMod.IOHandler
import typings.tensorflowTfjsCore.distIoTypesMod.IOHandlerSync
import typings.tensorflowTfjsCore.distIoTypesMod.ModelArtifacts
import typings.tensorflowTfjsCore.distIoTypesMod.SaveResult
import typings.tensorflowTfjsCore.distIoTypesMod.TrainingConfig
import typings.tensorflowTfjsCore.distIoTypesMod.WeightsManifestEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIoPassthroughMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/io/passthrough", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromMemory(modelArtifacts: js.Object): IOHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any]).asInstanceOf[IOHandler]
  inline def fromMemory(modelArtifacts: js.Object, weightSpecs: js.Array[WeightsManifestEntry]): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.typedarray.ArrayBuffer
  ): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.typedarray.ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: Unit,
    trainingConfig: TrainingConfig
  ): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def fromMemory(modelArtifacts: js.Object, weightSpecs: Unit, weightData: js.typedarray.ArrayBuffer): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: Unit,
    weightData: js.typedarray.ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def fromMemory(modelArtifacts: js.Object, weightSpecs: Unit, weightData: Unit, trainingConfig: TrainingConfig): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def fromMemory(modelArtifacts: ModelArtifacts): IOHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any]).asInstanceOf[IOHandler]
  inline def fromMemory(modelArtifacts: ModelArtifacts, weightSpecs: js.Array[WeightsManifestEntry]): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.typedarray.ArrayBuffer
  ): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.typedarray.ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: Unit,
    trainingConfig: TrainingConfig
  ): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def fromMemory(modelArtifacts: ModelArtifacts, weightSpecs: Unit, weightData: js.typedarray.ArrayBuffer): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: Unit,
    weightData: js.typedarray.ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: Unit,
    weightData: Unit,
    trainingConfig: TrainingConfig
  ): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  
  inline def fromMemorySync(modelArtifacts: js.Object): IOHandlerSync = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any]).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync(modelArtifacts: js.Object, weightSpecs: js.Array[WeightsManifestEntry]): IOHandlerSync = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any])).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.typedarray.ArrayBuffer
  ): IOHandlerSync = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any])).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.typedarray.ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandlerSync = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: Unit,
    trainingConfig: TrainingConfig
  ): IOHandlerSync = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync(modelArtifacts: js.Object, weightSpecs: Unit, weightData: js.typedarray.ArrayBuffer): IOHandlerSync = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any])).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync(
    modelArtifacts: js.Object,
    weightSpecs: Unit,
    weightData: js.typedarray.ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandlerSync = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync(modelArtifacts: js.Object, weightSpecs: Unit, weightData: Unit, trainingConfig: TrainingConfig): IOHandlerSync = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync(modelArtifacts: ModelArtifacts): IOHandlerSync = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any]).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync(modelArtifacts: ModelArtifacts, weightSpecs: js.Array[WeightsManifestEntry]): IOHandlerSync = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any])).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.typedarray.ArrayBuffer
  ): IOHandlerSync = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any])).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.typedarray.ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandlerSync = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: Unit,
    trainingConfig: TrainingConfig
  ): IOHandlerSync = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync(modelArtifacts: ModelArtifacts, weightSpecs: Unit, weightData: js.typedarray.ArrayBuffer): IOHandlerSync = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any])).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync(
    modelArtifacts: ModelArtifacts,
    weightSpecs: Unit,
    weightData: js.typedarray.ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandlerSync = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync(
    modelArtifacts: ModelArtifacts,
    weightSpecs: Unit,
    weightData: Unit,
    trainingConfig: TrainingConfig
  ): IOHandlerSync = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandlerSync]
  
  inline def withSaveHandler(saveHandler: js.Function1[/* artifacts */ ModelArtifacts, js.Promise[SaveResult]]): IOHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("withSaveHandler")(saveHandler.asInstanceOf[js.Any]).asInstanceOf[IOHandler]
  
  inline def withSaveHandlerSync(saveHandler: js.Function1[/* artifacts */ ModelArtifacts, SaveResult]): IOHandlerSync = ^.asInstanceOf[js.Dynamic].applyDynamic("withSaveHandlerSync")(saveHandler.asInstanceOf[js.Any]).asInstanceOf[IOHandlerSync]
}
