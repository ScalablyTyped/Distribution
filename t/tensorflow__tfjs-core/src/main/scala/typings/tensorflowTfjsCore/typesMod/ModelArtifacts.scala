package typings.tensorflowTfjsCore.typesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelArtifacts extends StObject {
  
  /**
    * What library or tool is responsible for converting the original model
    * to this format, applicable only if the model is output by a converter.
    *
    * Used for debugging purposes.  E.g., 'TensorFlow.js Converter v1.0.0'.
    *
    * A value of `null` means the model artifacts are generated without any
    * conversion process (e.g., saved directly from a TensorFlow.js
    * `tf.LayersModel` instance.)
    */
  var convertedBy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Hard-coded format name for models saved from TensorFlow.js or converted
    * by TensorFlow.js Converter.
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * What library is responsible for originally generating this artifact.
    *
    * Used for debugging purposes. E.g., 'TensorFlow.js v1.0.0'.
    */
  var generatedBy: js.UndefOr[String] = js.undefined
  
  /**
    * Initializer for the model.
    */
  var modelInitializer: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Model topology.
    *
    * For Keras-style `tf.Model`s, this is a JSON object.
    * For TensorFlow-style models (e.g., `SavedModel`), this is the JSON
    * encoding of the `GraphDef` protocol buffer.
    */
  var modelTopology: js.UndefOr[js.Object | js.typedarray.ArrayBuffer] = js.undefined
  
  /**
    * Inputs and outputs signature for saved model.
    */
  var signature: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Serialized configuration for the model's training.
    */
  var trainingConfig: js.UndefOr[TrainingConfig] = js.undefined
  
  /**
    * User-defined metadata about the model.
    */
  var userDefinedMetadata: js.UndefOr[StringDictionary[js.Object]] = js.undefined
  
  /**
    * Binary buffer for all weight values concatenated in the order specified
    * by `weightSpecs`.
    */
  var weightData: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  /**
    * Weight specifications.
    *
    * This corresponds to the weightsData below.
    */
  var weightSpecs: js.UndefOr[js.Array[WeightsManifestEntry]] = js.undefined
}
object ModelArtifacts {
  
  inline def apply(): ModelArtifacts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelArtifacts]
  }
  
  extension [Self <: ModelArtifacts](x: Self) {
    
    inline def setConvertedBy(value: String): Self = StObject.set(x, "convertedBy", value.asInstanceOf[js.Any])
    
    inline def setConvertedByNull: Self = StObject.set(x, "convertedBy", null)
    
    inline def setConvertedByUndefined: Self = StObject.set(x, "convertedBy", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGeneratedBy(value: String): Self = StObject.set(x, "generatedBy", value.asInstanceOf[js.Any])
    
    inline def setGeneratedByUndefined: Self = StObject.set(x, "generatedBy", js.undefined)
    
    inline def setModelInitializer(value: js.Object): Self = StObject.set(x, "modelInitializer", value.asInstanceOf[js.Any])
    
    inline def setModelInitializerUndefined: Self = StObject.set(x, "modelInitializer", js.undefined)
    
    inline def setModelTopology(value: js.Object | js.typedarray.ArrayBuffer): Self = StObject.set(x, "modelTopology", value.asInstanceOf[js.Any])
    
    inline def setModelTopologyUndefined: Self = StObject.set(x, "modelTopology", js.undefined)
    
    inline def setSignature(value: js.Object): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setTrainingConfig(value: TrainingConfig): Self = StObject.set(x, "trainingConfig", value.asInstanceOf[js.Any])
    
    inline def setTrainingConfigUndefined: Self = StObject.set(x, "trainingConfig", js.undefined)
    
    inline def setUserDefinedMetadata(value: StringDictionary[js.Object]): Self = StObject.set(x, "userDefinedMetadata", value.asInstanceOf[js.Any])
    
    inline def setUserDefinedMetadataUndefined: Self = StObject.set(x, "userDefinedMetadata", js.undefined)
    
    inline def setWeightData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "weightData", value.asInstanceOf[js.Any])
    
    inline def setWeightDataUndefined: Self = StObject.set(x, "weightData", js.undefined)
    
    inline def setWeightSpecs(value: js.Array[WeightsManifestEntry]): Self = StObject.set(x, "weightSpecs", value.asInstanceOf[js.Any])
    
    inline def setWeightSpecsUndefined: Self = StObject.set(x, "weightSpecs", js.undefined)
    
    inline def setWeightSpecsVarargs(value: WeightsManifestEntry*): Self = StObject.set(x, "weightSpecs", js.Array(value*))
  }
}
