package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StringDictionary
import typings.std.Storage
import typings.tensorflowTfjsCore.routerRegistryMod.IORouter
import typings.tensorflowTfjsCore.typesMod.IOHandler
import typings.tensorflowTfjsCore.typesMod.ModelArtifacts
import typings.tensorflowTfjsCore.typesMod.ModelArtifactsInfo
import typings.tensorflowTfjsCore.typesMod.ModelStoreManager
import typings.tensorflowTfjsCore.typesMod.SaveResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localStorageMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/io/local_storage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/local_storage", "BrowserLocalStorageManager")
  @js.native
  class BrowserLocalStorageManager ()
    extends StObject
       with ModelStoreManager {
    
    val LS: js.Any = js.native
    
    /**
      * List all models in the model store.
      *
      * @returns A dictionary mapping paths of existing models to their
      *   model artifacts info. Model artifacts info include type of the model's
      *   topology, byte sizes of the topology, weights, etc.
      */
    /* CompleteClass */
    override def listModels(): js.Promise[StringDictionary[ModelArtifactsInfo]] = js.native
    
    /**
      * Remove a model specified by `path`.
      *
      * @param path
      * @returns ModelArtifactsInfo of the deleted model (if and only if deletion
      *   is successful).
      * @throws Error if deletion fails, e.g., if no model exists at `path`.
      */
    /* CompleteClass */
    override def removeModel(path: String): js.Promise[ModelArtifactsInfo] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/io/local_storage", "BrowserLocalStorage")
  @js.native
  class BrowserLocalStorage_ protected ()
    extends StObject
       with IOHandler {
    def this(modelPath: String) = this()
    
    val LS: Storage = js.native
    
    val keys: LocalStorageKeys = js.native
    
    /**
      * Load a model from local storage.
      *
      * See the documentation to `browserLocalStorage` for details on the saved
      * artifacts.
      *
      * @returns The loaded model (if loading succeeds).
      */
    @JSName("load")
    def load_MBrowserLocalStorage_(): js.Promise[ModelArtifacts] = js.native
    
    val modelPath: String = js.native
    
    /**
      * Save model artifacts to browser local storage.
      *
      * See the documentation to `browserLocalStorage` for details on the saved
      * artifacts.
      *
      * @param modelArtifacts The model artifacts to be stored.
      * @returns An instance of SaveResult.
      */
    @JSName("save")
    def save_MBrowserLocalStorage_(modelArtifacts: ModelArtifacts): js.Promise[SaveResult] = js.native
  }
  /* static members */
  object BrowserLocalStorage_ {
    
    @JSImport("@tensorflow/tfjs-core/dist/io/local_storage", "BrowserLocalStorage.URL_SCHEME")
    @js.native
    val URL_SCHEME: /* "localstorage://" */ String = js.native
  }
  
  @scala.inline
  def browserLocalStorage(modelPath: String): IOHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("browserLocalStorage")(modelPath.asInstanceOf[js.Any]).asInstanceOf[IOHandler]
  
  @JSImport("@tensorflow/tfjs-core/dist/io/local_storage", "localStorageRouter")
  @js.native
  val localStorageRouter: IORouter = js.native
  
  @scala.inline
  def purgeLocalStorageArtifacts(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("purgeLocalStorageArtifacts")().asInstanceOf[js.Array[String]]
  
  trait LocalStorageKeys extends StObject {
    
    var info: String
    
    var modelMetadata: String
    
    var topology: String
    
    var weightData: String
    
    var weightSpecs: String
  }
  object LocalStorageKeys {
    
    @scala.inline
    def apply(info: String, modelMetadata: String, topology: String, weightData: String, weightSpecs: String): LocalStorageKeys = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], modelMetadata = modelMetadata.asInstanceOf[js.Any], topology = topology.asInstanceOf[js.Any], weightData = weightData.asInstanceOf[js.Any], weightSpecs = weightSpecs.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalStorageKeys]
    }
    
    @scala.inline
    implicit class LocalStorageKeysMutableBuilder[Self <: LocalStorageKeys] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelMetadata(value: String): Self = StObject.set(x, "modelMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopology(value: String): Self = StObject.set(x, "topology", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightData(value: String): Self = StObject.set(x, "weightData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightSpecs(value: String): Self = StObject.set(x, "weightSpecs", value.asInstanceOf[js.Any])
    }
  }
}
