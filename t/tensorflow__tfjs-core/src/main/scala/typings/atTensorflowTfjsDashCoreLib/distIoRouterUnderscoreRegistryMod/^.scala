package typings
package atTensorflowTfjsDashCoreLib.distIoRouterUnderscoreRegistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/router_registry", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getLoadHandlers(url: java.lang.String): js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler] = js.native
  def getLoadHandlers(url: java.lang.String, onProgress: js.Function): js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler] = js.native
  def getLoadHandlers(url: js.Array[java.lang.String]): js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler] = js.native
  def getLoadHandlers(url: js.Array[java.lang.String], onProgress: js.Function): js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler] = js.native
  def getSaveHandlers(url: java.lang.String): js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler] = js.native
  def getSaveHandlers(url: js.Array[java.lang.String]): js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler] = js.native
  def registerLoadRouter(loudRouter: IORouter): scala.Unit = js.native
  def registerSaveRouter(loudRouter: IORouter): scala.Unit = js.native
}

