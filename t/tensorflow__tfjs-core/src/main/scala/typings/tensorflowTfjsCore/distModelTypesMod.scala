package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.anon.Inputs
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorTypesMod.NamedTensorMap
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModelTypesMod {
  
  @js.native
  trait InferenceModel extends StObject {
    
    def execute(inputs: js.Array[Tensor[Rank]], outputs: String): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
    def execute(inputs: js.Array[Tensor[Rank]], outputs: js.Array[String]): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
    /**
      * Single Execute the inference for the input tensors and return activation
      * values for specified output node names without batching.
      *
      * @param input The input tensors, when there is single input for the model,
      * inputs param should be a Tensor. For models with multiple inputs, inputs
      * params should be in either Tensor[] if the input order is fixed, or
      * otherwise NamedTensorMap format.
      *
      * @param outputs string|string[]. List of output node names to retrieve
      * activation from.
      *
      * @returns Activation values for the output nodes result tensors. The return
      * type matches specified parameter outputs type. The output would be single
      * Tensor if single output is specified, otherwise Tensor[] for multiple
      * outputs.
      */
    def execute(inputs: Tensor[Rank], outputs: String): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
    def execute(inputs: Tensor[Rank], outputs: js.Array[String]): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
    def execute(inputs: NamedTensorMap, outputs: String): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
    def execute(inputs: NamedTensorMap, outputs: js.Array[String]): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
    
    /**
      * Return the array of input tensor info.
      */
    val inputs: js.Array[ModelTensorInfo] = js.native
    
    /**
      * Return the array of output tensor info.
      */
    val outputs: js.Array[ModelTensorInfo] = js.native
    
    def predict(inputs: js.Array[Tensor[Rank]], config: ModelPredictConfig): Tensor[Rank] | js.Array[Tensor[Rank]] | NamedTensorMap = js.native
    /**
      * Execute the inference for the input tensors.
      *
      * @param input The input tensors, when there is single input for the model,
      * inputs param should be a Tensor. For models with multiple inputs, inputs
      * params should be in either Tensor[] if the input order is fixed, or
      * otherwise NamedTensorMap format.
      * For batch inference execution, the tensors for each input need to be
      * concatenated together. For example with mobilenet, the required input shape
      * is [1, 244, 244, 3], which represents the [batch, height, width, channel].
      * If we are provide a batched data of 100 images, the input tensor should be
      * in the shape of [100, 244, 244, 3].
      *
      * @param config Prediction configuration for specifying the batch size.
      *
      * @returns Inference result tensors. The output would be single Tensor if
      * model has single output node, otherwise Tensor[] or NamedTensorMap[] will
      * be returned for model with multiple outputs.
      */
    def predict(inputs: Tensor[Rank], config: ModelPredictConfig): Tensor[Rank] | js.Array[Tensor[Rank]] | NamedTensorMap = js.native
    def predict(inputs: NamedTensorMap, config: ModelPredictConfig): Tensor[Rank] | js.Array[Tensor[Rank]] | NamedTensorMap = js.native
  }
  
  trait MetaGraph extends StObject {
    
    var signatureDefs: SignatureDef
    
    var tags: js.Array[String]
  }
  object MetaGraph {
    
    inline def apply(signatureDefs: SignatureDef, tags: js.Array[String]): MetaGraph = {
      val __obj = js.Dynamic.literal(signatureDefs = signatureDefs.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaGraph]
    }
    
    extension [Self <: MetaGraph](x: Self) {
      
      inline def setSignatureDefs(value: SignatureDef): Self = StObject.set(x, "signatureDefs", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
  
  trait MetaGraphInfo extends StObject {
    
    var signatureDefs: SignatureDefInfo
    
    var tags: js.Array[String]
  }
  object MetaGraphInfo {
    
    inline def apply(signatureDefs: SignatureDefInfo, tags: js.Array[String]): MetaGraphInfo = {
      val __obj = js.Dynamic.literal(signatureDefs = signatureDefs.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaGraphInfo]
    }
    
    extension [Self <: MetaGraphInfo](x: Self) {
      
      inline def setSignatureDefs(value: SignatureDefInfo): Self = StObject.set(x, "signatureDefs", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
  
  trait ModelPredictConfig extends StObject {
    
    /**
      * Optional. Batch size (Integer). If unspecified, it will default to 32.
      */
    var batchSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional. Verbosity mode. Defaults to false.
      */
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object ModelPredictConfig {
    
    inline def apply(): ModelPredictConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModelPredictConfig]
    }
    
    extension [Self <: ModelPredictConfig](x: Self) {
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait ModelTensorInfo extends StObject {
    
    var dtype: DataType
    
    var name: String
    
    var shape: js.UndefOr[js.Array[Double]] = js.undefined
    
    var tfDtype: js.UndefOr[String] = js.undefined
  }
  object ModelTensorInfo {
    
    inline def apply(dtype: DataType, name: String): ModelTensorInfo = {
      val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelTensorInfo]
    }
    
    extension [Self <: ModelTensorInfo](x: Self) {
      
      inline def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value*))
      
      inline def setTfDtype(value: String): Self = StObject.set(x, "tfDtype", value.asInstanceOf[js.Any])
      
      inline def setTfDtypeUndefined: Self = StObject.set(x, "tfDtype", js.undefined)
    }
  }
  
  trait SavedModelTensorInfo extends StObject {
    
    var dtype: String
    
    var name: String
    
    var shape: js.Array[Double]
  }
  object SavedModelTensorInfo {
    
    inline def apply(dtype: String, name: String, shape: js.Array[Double]): SavedModelTensorInfo = {
      val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[SavedModelTensorInfo]
    }
    
    extension [Self <: SavedModelTensorInfo](x: Self) {
      
      inline def setDtype(value: String): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value*))
    }
  }
  
  type SignatureDef = StringDictionary[SignatureDefEntry]
  
  trait SignatureDefEntry extends StObject {
    
    var inputs: StringDictionary[ModelTensorInfo]
    
    var outputs: StringDictionary[ModelTensorInfo]
  }
  object SignatureDefEntry {
    
    inline def apply(inputs: StringDictionary[ModelTensorInfo], outputs: StringDictionary[ModelTensorInfo]): SignatureDefEntry = {
      val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignatureDefEntry]
    }
    
    extension [Self <: SignatureDefEntry](x: Self) {
      
      inline def setInputs(value: StringDictionary[ModelTensorInfo]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setOutputs(value: StringDictionary[ModelTensorInfo]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    }
  }
  
  type SignatureDefInfo = StringDictionary[Inputs]
}
