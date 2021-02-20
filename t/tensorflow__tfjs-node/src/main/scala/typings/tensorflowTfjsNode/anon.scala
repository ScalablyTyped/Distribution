package typings.tensorflowTfjsNode

import typings.std.ArrayBuffer
import typings.std.Date
import typings.std.RequestInit
import typings.tensorflowTfjsCore.anon.Data
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensor
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import typings.tensorflowTfjsCore.typesMod.IOHandler
import typings.tensorflowTfjsCore.typesMod.LoadOptions
import typings.tensorflowTfjsCore.typesMod.ModelArtifacts
import typings.tensorflowTfjsCore.typesMod.TrainingConfig
import typings.tensorflowTfjsCore.typesMod.WeightGroup
import typings.tensorflowTfjsCore.typesMod.WeightsManifestConfig
import typings.tensorflowTfjsCore.typesMod.WeightsManifestEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait DateSaved extends StObject {
    
    var dateSaved: Date = js.native
    
    var modelTopologyBytes: Double = js.native
    
    var modelTopologyType: String = js.native
    
    var weightDataBytes: Double = js.native
    
    var weightSpecsBytes: Double = js.native
  }
  object DateSaved {
    
    @scala.inline
    def apply(
      dateSaved: Date,
      modelTopologyBytes: Double,
      modelTopologyType: String,
      weightDataBytes: Double,
      weightSpecsBytes: Double
    ): DateSaved = {
      val __obj = js.Dynamic.literal(dateSaved = dateSaved.asInstanceOf[js.Any], modelTopologyBytes = modelTopologyBytes.asInstanceOf[js.Any], modelTopologyType = modelTopologyType.asInstanceOf[js.Any], weightDataBytes = weightDataBytes.asInstanceOf[js.Any], weightSpecsBytes = weightSpecsBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateSaved]
    }
    
    @scala.inline
    implicit class DateSavedMutableBuilder[Self <: DateSaved] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDateSaved(value: Date): Self = StObject.set(x, "dateSaved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelTopologyBytes(value: Double): Self = StObject.set(x, "modelTopologyBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelTopologyType(value: String): Self = StObject.set(x, "modelTopologyType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightDataBytes(value: Double): Self = StObject.set(x, "weightDataBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightSpecsBytes(value: Double): Self = StObject.set(x, "weightSpecsBytes", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(path: String): IOHandler = js.native
    def apply(path: String, loadOptions: LoadOptions): IOHandler = js.native
  }
  
  @js.native
  trait FnCallManifestFilePathPrefixWeightNamesRequestInit extends StObject {
    
    def apply(manifest: WeightsManifestConfig): js.Promise[NamedTensorMap] = js.native
    def apply(
      manifest: WeightsManifestConfig,
      filePathPrefix: js.UndefOr[scala.Nothing],
      weightNames: js.UndefOr[scala.Nothing],
      requestInit: RequestInit
    ): js.Promise[NamedTensorMap] = js.native
    def apply(
      manifest: WeightsManifestConfig,
      filePathPrefix: js.UndefOr[scala.Nothing],
      weightNames: js.Array[String]
    ): js.Promise[NamedTensorMap] = js.native
    def apply(
      manifest: WeightsManifestConfig,
      filePathPrefix: js.UndefOr[scala.Nothing],
      weightNames: js.Array[String],
      requestInit: RequestInit
    ): js.Promise[NamedTensorMap] = js.native
    def apply(manifest: WeightsManifestConfig, filePathPrefix: String): js.Promise[NamedTensorMap] = js.native
    def apply(
      manifest: WeightsManifestConfig,
      filePathPrefix: String,
      weightNames: js.UndefOr[scala.Nothing],
      requestInit: RequestInit
    ): js.Promise[NamedTensorMap] = js.native
    def apply(manifest: WeightsManifestConfig, filePathPrefix: String, weightNames: js.Array[String]): js.Promise[NamedTensorMap] = js.native
    def apply(
      manifest: WeightsManifestConfig,
      filePathPrefix: String,
      weightNames: js.Array[String],
      requestInit: RequestInit
    ): js.Promise[NamedTensorMap] = js.native
  }
  
  @js.native
  trait FnCallModelArtifactsWeightSpecsWeightDataTrainingConfig extends StObject {
    
    def apply(modelArtifacts: js.Object): IOHandler = js.native
    def apply(
      modelArtifacts: js.Object,
      weightSpecs: js.UndefOr[scala.Nothing],
      weightData: js.UndefOr[scala.Nothing],
      trainingConfig: TrainingConfig
    ): IOHandler = js.native
    def apply(modelArtifacts: js.Object, weightSpecs: js.UndefOr[scala.Nothing], weightData: ArrayBuffer): IOHandler = js.native
    def apply(
      modelArtifacts: js.Object,
      weightSpecs: js.UndefOr[scala.Nothing],
      weightData: ArrayBuffer,
      trainingConfig: TrainingConfig
    ): IOHandler = js.native
    def apply(modelArtifacts: js.Object, weightSpecs: js.Array[WeightsManifestEntry]): IOHandler = js.native
    def apply(
      modelArtifacts: js.Object,
      weightSpecs: js.Array[WeightsManifestEntry],
      weightData: js.UndefOr[scala.Nothing],
      trainingConfig: TrainingConfig
    ): IOHandler = js.native
    def apply(modelArtifacts: js.Object, weightSpecs: js.Array[WeightsManifestEntry], weightData: ArrayBuffer): IOHandler = js.native
    def apply(
      modelArtifacts: js.Object,
      weightSpecs: js.Array[WeightsManifestEntry],
      weightData: ArrayBuffer,
      trainingConfig: TrainingConfig
    ): IOHandler = js.native
    def apply(modelArtifacts: ModelArtifacts): IOHandler = js.native
    def apply(
      modelArtifacts: ModelArtifacts,
      weightSpecs: js.UndefOr[scala.Nothing],
      weightData: js.UndefOr[scala.Nothing],
      trainingConfig: TrainingConfig
    ): IOHandler = js.native
    def apply(modelArtifacts: ModelArtifacts, weightSpecs: js.UndefOr[scala.Nothing], weightData: ArrayBuffer): IOHandler = js.native
    def apply(
      modelArtifacts: ModelArtifacts,
      weightSpecs: js.UndefOr[scala.Nothing],
      weightData: ArrayBuffer,
      trainingConfig: TrainingConfig
    ): IOHandler = js.native
    def apply(modelArtifacts: ModelArtifacts, weightSpecs: js.Array[WeightsManifestEntry]): IOHandler = js.native
    def apply(
      modelArtifacts: ModelArtifacts,
      weightSpecs: js.Array[WeightsManifestEntry],
      weightData: js.UndefOr[scala.Nothing],
      trainingConfig: TrainingConfig
    ): IOHandler = js.native
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
  
  @js.native
  trait FnCallTensorsGroup extends StObject {
    
    def apply(tensors: js.Array[NamedTensor]): js.Promise[Data] = js.native
    def apply(tensors: js.Array[NamedTensor], group: WeightGroup): js.Promise[Data] = js.native
    def apply(tensors: NamedTensorMap): js.Promise[Data] = js.native
    def apply(tensors: NamedTensorMap, group: WeightGroup): js.Promise[Data] = js.native
  }
  
  @js.native
  trait Unreliable extends StObject {
    
    var unreliable: Boolean = js.native
  }
  object Unreliable {
    
    @scala.inline
    def apply(unreliable: Boolean): Unreliable = {
      val __obj = js.Dynamic.literal(unreliable = unreliable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Unreliable]
    }
    
    @scala.inline
    implicit class UnreliableMutableBuilder[Self <: Unreliable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnreliable(value: Boolean): Self = StObject.set(x, "unreliable", value.asInstanceOf[js.Any])
    }
  }
}
