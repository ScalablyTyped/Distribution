package typings.atTensorflowTfjsDashCore

import org.scalablytyped.runtime.StringDictionary
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.indexeddbColonSlashSlash
import typings.atTensorflowTfjsDashCore.distIoRouterUnderscoreRegistryMod.IORouter
import typings.atTensorflowTfjsDashCore.distIoTypesMod.IOHandler
import typings.atTensorflowTfjsDashCore.distIoTypesMod.ModelArtifacts
import typings.atTensorflowTfjsDashCore.distIoTypesMod.ModelArtifactsInfo
import typings.atTensorflowTfjsDashCore.distIoTypesMod.ModelStoreManager
import typings.atTensorflowTfjsDashCore.distIoTypesMod.SaveResult
import typings.std.IDBFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/indexed_db", JSImport.Namespace)
@js.native
object distIoIndexedUnderscoreDbMod extends js.Object {
  @js.native
  class BrowserIndexedDB protected () extends IOHandler {
    def this(modelPath: String) = this()
    /**
      * Perform database action to put model artifacts into or read model artifacts
      * from IndexedDB object store.
      *
      * Whether the action is put or get depends on whether `modelArtifacts` is
      * specified. If it is specified, the action will be put; otherwise the action
      * will be get.
      *
      * @param modelPath A unique string path for the model.
      * @param modelArtifacts If specified, it will be the model artifacts to be
      *   stored in IndexedDB.
      * @returns A `Promise` of `SaveResult`, if the action is put, or a `Promise`
      *   of `ModelArtifacts`, if the action is get.
      */
    var databaseAction: js.Any = js.native
    val indexedDB: IDBFactory = js.native
    val modelPath: String = js.native
    @JSName("load")
    def load_MBrowserIndexedDB(): js.Promise[ModelArtifacts] = js.native
    @JSName("save")
    def save_MBrowserIndexedDB(modelArtifacts: ModelArtifacts): js.Promise[SaveResult] = js.native
  }
  
  @js.native
  class BrowserIndexedDBManager () extends ModelStoreManager {
    var indexedDB: js.Any = js.native
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
  
  val indexedDBRouter: IORouter = js.native
  def browserIndexedDB(modelPath: String): IOHandler = js.native
  def deleteDatabase(): js.Promise[Unit] = js.native
  /* static members */
  @js.native
  object BrowserIndexedDB extends js.Object {
    val URL_SCHEME: indexeddbColonSlashSlash = js.native
  }
  
}

