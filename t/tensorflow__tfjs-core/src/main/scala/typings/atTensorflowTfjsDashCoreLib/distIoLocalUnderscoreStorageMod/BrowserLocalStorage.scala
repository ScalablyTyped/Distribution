package typings
package atTensorflowTfjsDashCoreLib.distIoLocalUnderscoreStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/local_storage", "BrowserLocalStorage")
@js.native
class BrowserLocalStorage protected ()
  extends atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler {
  def this(modelPath: java.lang.String) = this()
  val LS: stdLib.Storage = js.native
  val keys: LocalStorageKeys = js.native
  val modelPath: java.lang.String = js.native
  /**
    * Load a model from local storage.
    *
    * See the documentation to `browserLocalStorage` for details on the saved
    * artifacts.
    *
    * @returns The loaded model (if loading succeeds).
    */
  @JSName("load")
  def load_MBrowserLocalStorage(): js.Promise[atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelArtifacts] = js.native
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
  def save_MBrowserLocalStorage(modelArtifacts: atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelArtifacts): js.Promise[atTensorflowTfjsDashCoreLib.distIoTypesMod.SaveResult] = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-core/dist/io/local_storage", "BrowserLocalStorage")
@js.native
object BrowserLocalStorage extends js.Object {
  val URL_SCHEME: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.`localstorage://` = js.native
}

