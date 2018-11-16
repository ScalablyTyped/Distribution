package typings
package vsoDashNodeDashApiLib.filecontainerapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(vsoDashNodeDashApiLib.filecontainerapiMod.IFileContainerApi because Would inherit conflicting mutable fields List(rest, vsoClient, userAgent, baseUrl, http))*/
@JSImport("vso-node-api/FileContainerApi", "FileContainerApi")
@js.native
class FileContainerApi protected ()
  extends vsoDashNodeDashApiLib.filecontainerapibaseMod.FileContainerApiBase {
  def this(baseUrl: java.lang.String, handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]) = this()
  def this(baseUrl: java.lang.String, handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler], options: vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestOptions) = this()
  def _createItem(
    customHeaders: vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IHeaders,
    contentStream: nodeLib.NodeJSNs.ReadableStream,
    containerId: scala.Double,
    itemPath: java.lang.String,
    scope: java.lang.String,
    onResult: js.Function3[
      /* err */ js.Any, 
      /* statusCode */ scala.Double, 
      /* Container */ vsoDashNodeDashApiLib.interfacesFileContainerInterfacesMod.FileContainerItem, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def createItem(
    contentStream: nodeLib.NodeJSNs.ReadableStream,
    uncompressedLength: scala.Double,
    containerId: scala.Double,
    itemPath: java.lang.String,
    scope: java.lang.String,
    options: js.Any
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesFileContainerInterfacesMod.FileContainerItem] = js.native
  /**
       * @param {number} containerId
       * @param {string} scope
       * @param {string} itemPath
       * @param {string} downloadFileName
       */
  def getItem(containerId: scala.Double): stdLib.Promise[
    typedDashRestDashClientLib.restclientMod.IRestResponse[nodeLib.NodeJSNs.ReadableStream]
  ] = js.native
  /**
       * @param {number} containerId
       * @param {string} scope
       * @param {string} itemPath
       * @param {string} downloadFileName
       */
  def getItem(containerId: scala.Double, scope: java.lang.String): stdLib.Promise[
    typedDashRestDashClientLib.restclientMod.IRestResponse[nodeLib.NodeJSNs.ReadableStream]
  ] = js.native
  /**
       * @param {number} containerId
       * @param {string} scope
       * @param {string} itemPath
       * @param {string} downloadFileName
       */
  def getItem(containerId: scala.Double, scope: java.lang.String, itemPath: java.lang.String): stdLib.Promise[
    typedDashRestDashClientLib.restclientMod.IRestResponse[nodeLib.NodeJSNs.ReadableStream]
  ] = js.native
  /**
       * @param {number} containerId
       * @param {string} scope
       * @param {string} itemPath
       * @param {string} downloadFileName
       */
  def getItem(
    containerId: scala.Double,
    scope: java.lang.String,
    itemPath: java.lang.String,
    downloadFileName: java.lang.String
  ): stdLib.Promise[
    typedDashRestDashClientLib.restclientMod.IRestResponse[nodeLib.NodeJSNs.ReadableStream]
  ] = js.native
}

