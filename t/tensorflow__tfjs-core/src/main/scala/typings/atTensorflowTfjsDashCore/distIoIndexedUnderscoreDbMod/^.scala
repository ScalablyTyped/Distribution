package typings.atTensorflowTfjsDashCore.distIoIndexedUnderscoreDbMod

import typings.atTensorflowTfjsDashCore.distIoRouterUnderscoreRegistryMod.IORouter
import typings.atTensorflowTfjsDashCore.distIoTypesMod.IOHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/indexed_db", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val indexedDBRouter: IORouter = js.native
  def browserIndexedDB(modelPath: String): IOHandler = js.native
  def deleteDatabase(): js.Promise[Unit] = js.native
}

