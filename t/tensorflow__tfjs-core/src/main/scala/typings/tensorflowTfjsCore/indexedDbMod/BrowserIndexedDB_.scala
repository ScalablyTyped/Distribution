package typings.tensorflowTfjsCore.indexedDbMod

import typings.std.IDBFactory
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.indexeddbColonSlashSlash
import typings.tensorflowTfjsCore.typesMod.IOHandler
import typings.tensorflowTfjsCore.typesMod.ModelArtifacts
import typings.tensorflowTfjsCore.typesMod.SaveResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/indexed_db", "BrowserIndexedDB")
@js.native
class BrowserIndexedDB_ protected () extends IOHandler {
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
  def load_MBrowserIndexedDB_(): js.Promise[ModelArtifacts] = js.native
  @JSName("save")
  def save_MBrowserIndexedDB_(modelArtifacts: ModelArtifacts): js.Promise[SaveResult] = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-core/dist/io/indexed_db", "BrowserIndexedDB")
@js.native
object BrowserIndexedDB_ extends js.Object {
  val URL_SCHEME: indexeddbColonSlashSlash = js.native
}

