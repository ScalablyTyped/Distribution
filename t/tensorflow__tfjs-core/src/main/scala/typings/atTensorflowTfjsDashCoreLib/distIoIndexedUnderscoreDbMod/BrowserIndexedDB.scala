package typings
package atTensorflowTfjsDashCoreLib.distIoIndexedUnderscoreDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/indexed_db", "BrowserIndexedDB")
@js.native
class BrowserIndexedDB protected ()
  extends atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler {
  def this(modelPath: java.lang.String) = this()
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
  val indexedDB: stdLib.IDBFactory = js.native
  val modelPath: java.lang.String = js.native
  @JSName("load")
  def load_MBrowserIndexedDB(): js.Promise[atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelArtifacts] = js.native
  @JSName("save")
  def save_MBrowserIndexedDB(modelArtifacts: atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelArtifacts): js.Promise[atTensorflowTfjsDashCoreLib.distIoTypesMod.SaveResult] = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-core/dist/io/indexed_db", "BrowserIndexedDB")
@js.native
object BrowserIndexedDB extends js.Object {
  val URL_SCHEME: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.`indexeddb://` = js.native
}

