package typings.atTensorflowTfjsDashCore.distIoRouterUnderscoreRegistryMod

import typings.atTensorflowTfjsDashCore.distIoTypesMod.IOHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/router_registry", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getLoadHandlers(url: String): js.Array[IOHandler] = js.native
  def getLoadHandlers(url: String, onProgress: js.Function): js.Array[IOHandler] = js.native
  def getLoadHandlers(url: js.Array[String]): js.Array[IOHandler] = js.native
  def getLoadHandlers(url: js.Array[String], onProgress: js.Function): js.Array[IOHandler] = js.native
  def getSaveHandlers(url: String): js.Array[IOHandler] = js.native
  def getSaveHandlers(url: js.Array[String]): js.Array[IOHandler] = js.native
  def registerLoadRouter(loudRouter: IORouter): Unit = js.native
  def registerSaveRouter(loudRouter: IORouter): Unit = js.native
}

