package typings.vsoDashNodeDashApi.fileContainerApiMod

import typings.node.NodeJSNs.ReadableStream
import typings.typedDashRestDashClient.restClientMod.IRestResponse
import typings.vsoDashNodeDashApi.fileContainerApiBaseMod.FileContainerApiBase
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IHeaders
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typings.vsoDashNodeDashApi.interfacesFileContainerInterfacesMod.FileContainerItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.vsoDashNodeDashApi.fileContainerApiMod.IFileContainerApi because var conflicts: baseUrl, http, rest, userAgent, vsoClient. Inlined createItem, getItem, getItem, getItem, getItem */ @JSImport("vso-node-api/FileContainerApi", "FileContainerApi")
@js.native
class FileContainerApi protected () extends FileContainerApiBase {
  def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
  def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  def _createItem(
    customHeaders: IHeaders,
    contentStream: ReadableStream,
    containerId: Double,
    itemPath: String,
    scope: String,
    onResult: js.Function3[/* err */ js.Any, /* statusCode */ Double, /* Container */ FileContainerItem, Unit]
  ): Unit = js.native
  def createItem(
    contentStream: ReadableStream,
    uncompressedLength: Double,
    containerId: Double,
    itemPath: String,
    scope: String,
    options: js.Any
  ): js.Promise[FileContainerItem] = js.native
  /**
    * @param {number} containerId
    * @param {string} scope
    * @param {string} itemPath
    * @param {string} downloadFileName
    */
  def getItem(containerId: Double): js.Promise[IRestResponse[ReadableStream]] = js.native
  def getItem(containerId: Double, scope: String): js.Promise[IRestResponse[ReadableStream]] = js.native
  def getItem(containerId: Double, scope: String, itemPath: String): js.Promise[IRestResponse[ReadableStream]] = js.native
  def getItem(containerId: Double, scope: String, itemPath: String, downloadFileName: String): js.Promise[IRestResponse[ReadableStream]] = js.native
}

