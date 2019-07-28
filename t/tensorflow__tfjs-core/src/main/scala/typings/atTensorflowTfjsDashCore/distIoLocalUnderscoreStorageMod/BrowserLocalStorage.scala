package typings.atTensorflowTfjsDashCore.distIoLocalUnderscoreStorageMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`localstorage://`
import typings.atTensorflowTfjsDashCore.distIoTypesMod.IOHandler
import typings.atTensorflowTfjsDashCore.distIoTypesMod.ModelArtifacts
import typings.atTensorflowTfjsDashCore.distIoTypesMod.SaveResult
import typings.std.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/local_storage", "BrowserLocalStorage")
@js.native
class BrowserLocalStorage protected () extends IOHandler {
  def this(modelPath: String) = this()
  val LS: Storage = js.native
  val keys: LocalStorageKeys = js.native
  val modelPath: String = js.native
  /**
    * Load a model from local storage.
    *
    * See the documentation to `browserLocalStorage` for details on the saved
    * artifacts.
    *
    * @returns The loaded model (if loading succeeds).
    */
  @JSName("load")
  def load_MBrowserLocalStorage(): js.Promise[ModelArtifacts] = js.native
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
  def save_MBrowserLocalStorage(modelArtifacts: ModelArtifacts): js.Promise[SaveResult] = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-core/dist/io/local_storage", "BrowserLocalStorage")
@js.native
object BrowserLocalStorage extends js.Object {
  val URL_SCHEME: `localstorage://` = js.native
}

