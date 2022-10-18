package typings.vsoNodeApi

import typings.node.NodeJS.ReadableStream
import typings.typedRestClient.restClientMod.IRestResponse
import typings.vsoNodeApi.fileContainerApiBaseMod.FileContainerApiBase
import typings.vsoNodeApi.fileContainerApiBaseMod.IFileContainerApiBase
import typings.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IHeaders
import typings.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typings.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typings.vsoNodeApi.interfacesFileContainerInterfacesMod.FileContainerItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileContainerApiMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.vsoNodeApi.clientApiBasesMod.ClientApiBase because Already inherited
  - typings.vsoNodeApi.fileContainerApiBaseMod.IFileContainerApiBase because Already inherited
  - typings.vsoNodeApi.fileContainerApiMod.IFileContainerApi because var conflicts: baseUrl, http, rest, userAgent, vsoClient. Inlined createItem, getItem, getItem, getItem, getItem, getItem, getItem, getItem, getItem */ @JSImport("vso-node-api/FileContainerApi", "FileContainerApi")
  @js.native
  open class FileContainerApi protected () extends FileContainerApiBase {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
    
    def _createItem(
      customHeaders: IHeaders,
      contentStream: ReadableStream,
      containerId: Double,
      itemPath: String,
      scope: String,
      onResult: js.Function3[/* err */ Any, /* statusCode */ Double, /* Container */ FileContainerItem, Unit]
    ): Unit = js.native
    
    def createItem(
      contentStream: ReadableStream,
      uncompressedLength: Double,
      containerId: Double,
      itemPath: String,
      scope: String,
      options: Any
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
    def getItem(containerId: Double, scope: String, itemPath: Unit, downloadFileName: String): js.Promise[IRestResponse[ReadableStream]] = js.native
    def getItem(containerId: Double, scope: Unit, itemPath: String): js.Promise[IRestResponse[ReadableStream]] = js.native
    def getItem(containerId: Double, scope: Unit, itemPath: String, downloadFileName: String): js.Promise[IRestResponse[ReadableStream]] = js.native
    def getItem(containerId: Double, scope: Unit, itemPath: Unit, downloadFileName: String): js.Promise[IRestResponse[ReadableStream]] = js.native
  }
  
  @js.native
  trait IFileContainerApi extends IFileContainerApiBase {
    
    def createItem(
      contentStream: ReadableStream,
      uncompressedLength: Double,
      containerId: Double,
      itemPath: String,
      scope: String,
      options: Any
    ): js.Promise[FileContainerItem] = js.native
    
    def getItem(containerId: Double): js.Promise[IRestResponse[ReadableStream]] = js.native
    def getItem(containerId: Double, scope: String): js.Promise[IRestResponse[ReadableStream]] = js.native
    def getItem(containerId: Double, scope: String, itemPath: String): js.Promise[IRestResponse[ReadableStream]] = js.native
    def getItem(containerId: Double, scope: String, itemPath: String, downloadFileName: String): js.Promise[IRestResponse[ReadableStream]] = js.native
    def getItem(containerId: Double, scope: String, itemPath: Unit, downloadFileName: String): js.Promise[IRestResponse[ReadableStream]] = js.native
    def getItem(containerId: Double, scope: Unit, itemPath: String): js.Promise[IRestResponse[ReadableStream]] = js.native
    def getItem(containerId: Double, scope: Unit, itemPath: String, downloadFileName: String): js.Promise[IRestResponse[ReadableStream]] = js.native
    def getItem(containerId: Double, scope: Unit, itemPath: Unit, downloadFileName: String): js.Promise[IRestResponse[ReadableStream]] = js.native
  }
}
