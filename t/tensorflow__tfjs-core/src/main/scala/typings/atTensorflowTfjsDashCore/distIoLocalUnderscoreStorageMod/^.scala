package typings.atTensorflowTfjsDashCore.distIoLocalUnderscoreStorageMod

import typings.atTensorflowTfjsDashCore.distIoRouterUnderscoreRegistryMod.IORouter
import typings.atTensorflowTfjsDashCore.distIoTypesMod.IOHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/local_storage", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val localStorageRouter: IORouter = js.native
  def browserLocalStorage(modelPath: String): IOHandler = js.native
  def purgeLocalStorageArtifacts(): js.Array[String] = js.native
}

