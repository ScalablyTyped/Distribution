package typings.tensorflowTfjsCore.typesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelJSON extends StObject {
  
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
    * Inputs and outputs signature for saved model.
    */
  var signature: js.UndefOr[js.Object] = js.undefined
  
  /** Model training configuration. */
  var trainingConfig: js.UndefOr[TrainingConfig] = js.undefined
  
  /**
    * User-defined metadata about the model.
    */
  var userDefinedMetadata: js.UndefOr[StringDictionary[js.Object]] = js.undefined
  
  /**
    * Weights manifest.
    *
    * The weights manifest consists of an ordered list of weight-manifest
    * groups. Each weight-manifest group consists of a number of weight values
    * stored in a number of paths. See the documentation of
    * `WeightsManifestConfig` for more details.
    */
  var weightsManifest: WeightsManifestConfig
}
object ModelJSON {
  
  inline def apply(weightsManifest: WeightsManifestConfig): ModelJSON = {
    val __obj = js.Dynamic.literal(weightsManifest = weightsManifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelJSON]
  }
  
  extension [Self <: ModelJSON](x: Self) {
    
    inline def setConvertedBy(value: String): Self = StObject.set(x, "convertedBy", value.asInstanceOf[js.Any])
    
    inline def setConvertedByNull: Self = StObject.set(x, "convertedBy", null)
    
    inline def setConvertedByUndefined: Self = StObject.set(x, "convertedBy", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGeneratedBy(value: String): Self = StObject.set(x, "generatedBy", value.asInstanceOf[js.Any])
    
    inline def setGeneratedByUndefined: Self = StObject.set(x, "generatedBy", js.undefined)
    
    inline def setModelInitializer(value: js.Object): Self = StObject.set(x, "modelInitializer", value.asInstanceOf[js.Any])
    
    inline def setModelInitializerUndefined: Self = StObject.set(x, "modelInitializer", js.undefined)
    
    inline def setSignature(value: js.Object): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setTrainingConfig(value: TrainingConfig): Self = StObject.set(x, "trainingConfig", value.asInstanceOf[js.Any])
    
    inline def setTrainingConfigUndefined: Self = StObject.set(x, "trainingConfig", js.undefined)
    
    inline def setUserDefinedMetadata(value: StringDictionary[js.Object]): Self = StObject.set(x, "userDefinedMetadata", value.asInstanceOf[js.Any])
    
    inline def setUserDefinedMetadataUndefined: Self = StObject.set(x, "userDefinedMetadata", js.undefined)
    
    inline def setWeightsManifest(value: WeightsManifestConfig): Self = StObject.set(x, "weightsManifest", value.asInstanceOf[js.Any])
    
    inline def setWeightsManifestVarargs(value: WeightsManifestGroupConfig*): Self = StObject.set(x, "weightsManifest", js.Array(value*))
  }
}
