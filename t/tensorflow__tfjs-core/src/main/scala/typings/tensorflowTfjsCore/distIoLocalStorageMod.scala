package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StringDictionary
import typings.std.Storage
import typings.tensorflowTfjsCore.distIoRouterRegistryMod.IORouter
import typings.tensorflowTfjsCore.distIoTypesMod.IOHandler
import typings.tensorflowTfjsCore.distIoTypesMod.ModelArtifacts
import typings.tensorflowTfjsCore.distIoTypesMod.ModelArtifactsInfo
import typings.tensorflowTfjsCore.distIoTypesMod.ModelStoreManager
import typings.tensorflowTfjsCore.distIoTypesMod.SaveResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIoLocalStorageMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/io/local_storage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/local_storage", "BrowserLocalStorageManager")
  @js.native
  open class BrowserLocalStorageManager ()
    extends StObject
       with ModelStoreManager {
    
    /* private */ val LS: Any = js.native
    
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
  open class BrowserLocalStorage_ protected ()
    extends StObject
       with IOHandler {
    def this(modelPath: String) = this()
    
    /* protected */ val LS: Storage = js.native
    
    /* protected */ val keys: LocalStorageKeys = js.native
    
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
    
    /* protected */ val modelPath: String = js.native
    
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
  
  inline def browserLocalStorage(modelPath: String): IOHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("browserLocalStorage")(modelPath.asInstanceOf[js.Any]).asInstanceOf[IOHandler]
  
  @JSImport("@tensorflow/tfjs-core/dist/io/local_storage", "localStorageRouter")
  @js.native
  val localStorageRouter: IORouter = js.native
  
  inline def purgeLocalStorageArtifacts(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("purgeLocalStorageArtifacts")().asInstanceOf[js.Array[String]]
  
  trait LocalStorageKeys extends StObject {
    
    /** Key of the localStorage entry storing `ModelArtifactsInfo`. */
    var info: String
    
    /**
      * Key of the localStorage entry storing the remaining fields of `model.json`
      * @see {@link ModelMetadata}
      */
    var modelMetadata: String
    
    /**
      * Key of the localStorage entry storing the 'modelTopology' key of
      * `model.json`
      */
    var topology: String
    
    /** Key of the localStorage entry storing the weight data in Base64 */
    var weightData: String
    
    /**
      * Key of the localStorage entry storing the `weightsManifest.weights` entries
      * of `model.json`
      */
    var weightSpecs: String
  }
  object LocalStorageKeys {
    
    inline def apply(info: String, modelMetadata: String, topology: String, weightData: String, weightSpecs: String): LocalStorageKeys = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], modelMetadata = modelMetadata.asInstanceOf[js.Any], topology = topology.asInstanceOf[js.Any], weightData = weightData.asInstanceOf[js.Any], weightSpecs = weightSpecs.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalStorageKeys]
    }
    
    extension [Self <: LocalStorageKeys](x: Self) {
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setModelMetadata(value: String): Self = StObject.set(x, "modelMetadata", value.asInstanceOf[js.Any])
      
      inline def setTopology(value: String): Self = StObject.set(x, "topology", value.asInstanceOf[js.Any])
      
      inline def setWeightData(value: String): Self = StObject.set(x, "weightData", value.asInstanceOf[js.Any])
      
      inline def setWeightSpecs(value: String): Self = StObject.set(x, "weightSpecs", value.asInstanceOf[js.Any])
    }
  }
}
