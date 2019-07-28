package typings.vsoDashNodeDashApi.fileContainerApiMod

import typings.node.NodeJSNs.ReadableStream
import typings.typedDashRestDashClient.restClientMod.IRestResponse
import typings.vsoDashNodeDashApi.fileContainerApiBaseMod.IFileContainerApiBase
import typings.vsoDashNodeDashApi.interfacesFileContainerInterfacesMod.FileContainerItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileContainerApi extends IFileContainerApiBase {
  def createItem(
    contentStream: ReadableStream,
    uncompressedLength: Double,
    containerId: Double,
    itemPath: String,
    scope: String,
    options: js.Any
  ): js.Promise[FileContainerItem] = js.native
  def getItem(containerId: Double): js.Promise[IRestResponse[ReadableStream]] = js.native
  def getItem(containerId: Double, scope: String): js.Promise[IRestResponse[ReadableStream]] = js.native
  def getItem(containerId: Double, scope: String, itemPath: String): js.Promise[IRestResponse[ReadableStream]] = js.native
  def getItem(containerId: Double, scope: String, itemPath: String, downloadFileName: String): js.Promise[IRestResponse[ReadableStream]] = js.native
}

