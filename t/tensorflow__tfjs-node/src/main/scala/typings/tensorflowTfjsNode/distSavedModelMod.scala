package typings.tensorflowTfjsNode

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.distModelTypesMod.InferenceModel
import typings.tensorflowTfjsCore.distModelTypesMod.MetaGraph
import typings.tensorflowTfjsCore.distModelTypesMod.ModelTensorInfo
import typings.tensorflowTfjsCore.distModelTypesMod.SignatureDefEntry
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorTypesMod.NamedTensorMap
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsNode.distNodejsKernelBackendMod.NodeJSKernelBackend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSavedModelMod {
  
  @JSImport("@tensorflow/tfjs-node/dist/saved_model", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-node/dist/saved_model", "TFSavedModel")
  @js.native
  open class TFSavedModel protected ()
    extends StObject
       with InferenceModel {
    def this(sessionId: Double, jsid: Double, signature: SignatureDefEntry, backend: NodeJSKernelBackend) = this()
    
    /* private */ var backend: Any = js.native
    
    /**
      * Delete the SavedModel from nodeBackend and delete corresponding session in
      * the C++ backend if the session is only used by this TFSavedModel.
      *
      * @doc {heading: 'Models', subheading: 'SavedModel'}
      */
    def dispose(): Unit = js.native
    
    /* private */ var disposed: Any = js.native
    
    /**
      * Return the array of input tensor info.
      *
      * @doc {heading: 'Models', subheading: 'SavedModel'}
      */
    @JSName("inputs")
    def inputs_MTFSavedModel: js.Array[ModelTensorInfo] = js.native
    
    /* private */ var jsid: Any = js.native
    
    def outputNodeNames: StringDictionary[String] = js.native
    
    /* private */ var outputNodeNames_ : Any = js.native
    
    /**
      * Return the array of output tensor info.
      *
      * @doc {heading: 'Models', subheading: 'SavedModel'}
      */
    @JSName("outputs")
    def outputs_MTFSavedModel: js.Array[ModelTensorInfo] = js.native
    
    def predict(inputs: js.Array[Tensor[Rank]]): Tensor[Rank] | js.Array[Tensor[Rank]] | NamedTensorMap = js.native
    /**
      * Execute the inference for the input tensors.
      *
      * @param input The input tensors, when there is single input for the model,
      * inputs param should be a Tensor. For models with multiple inputs, inputs
      * params should be in either Tensor[] if the input order is fixed, or
      * otherwise NamedTensorMap format. The keys in the NamedTensorMap are the
      * name of input tensors in SavedModel signatureDef. It can be found through
      * `tf.node.getMetaGraphsFromSavedModel()`.
      *
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
      *
      * @doc {heading: 'Models', subheading: 'SavedModel'}
      */
    def predict(inputs: Tensor[Rank]): Tensor[Rank] | js.Array[Tensor[Rank]] | NamedTensorMap = js.native
    def predict(inputs: NamedTensorMap): Tensor[Rank] | js.Array[Tensor[Rank]] | NamedTensorMap = js.native
    
    /* private */ var sessionId: Any = js.native
    
    /* private */ var signature: Any = js.native
  }
  
  inline def getEnumKeyFromValue(`object`: Any, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getEnumKeyFromValue")(`object`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getMetaGraphsFromSavedModel(path: String): js.Promise[js.Array[MetaGraph]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetaGraphsFromSavedModel")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[MetaGraph]]]
  
  inline def getNumOfSavedModels(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumOfSavedModels")().asInstanceOf[Double]
  
  inline def getSignatureDefEntryFromMetaGraphInfo(savedModelInfo: js.Array[MetaGraph], tags: js.Array[String], signature: String): SignatureDefEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignatureDefEntryFromMetaGraphInfo")(savedModelInfo.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[SignatureDefEntry]
  
  inline def loadSavedModel(path: String): js.Promise[TFSavedModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSavedModel")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TFSavedModel]]
  inline def loadSavedModel(path: String, tags: js.Array[String]): js.Promise[TFSavedModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSavedModel")(path.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TFSavedModel]]
  inline def loadSavedModel(path: String, tags: js.Array[String], signature: String): js.Promise[TFSavedModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSavedModel")(path.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TFSavedModel]]
  inline def loadSavedModel(path: String, tags: Unit, signature: String): js.Promise[TFSavedModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSavedModel")(path.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TFSavedModel]]
  
  inline def readSavedModelProto(path: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readSavedModelProto")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}
