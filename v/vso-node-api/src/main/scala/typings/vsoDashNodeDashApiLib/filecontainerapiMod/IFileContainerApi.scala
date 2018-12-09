package typings
package vsoDashNodeDashApiLib.filecontainerapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileContainerApi
  extends vsoDashNodeDashApiLib.filecontainerapibaseMod.IFileContainerApiBase {
  def createItem(
    contentStream: nodeLib.NodeJSNs.ReadableStream,
    uncompressedLength: scala.Double,
    containerId: scala.Double,
    itemPath: java.lang.String,
    scope: java.lang.String,
    options: js.Any
  ): js.Promise[vsoDashNodeDashApiLib.interfacesFileContainerInterfacesMod.FileContainerItem] = js.native
  def getItem(containerId: scala.Double): js.Promise[
    typedDashRestDashClientLib.restclientMod.IRestResponse[nodeLib.NodeJSNs.ReadableStream]
  ] = js.native
  def getItem(containerId: scala.Double, scope: java.lang.String): js.Promise[
    typedDashRestDashClientLib.restclientMod.IRestResponse[nodeLib.NodeJSNs.ReadableStream]
  ] = js.native
  def getItem(containerId: scala.Double, scope: java.lang.String, itemPath: java.lang.String): js.Promise[
    typedDashRestDashClientLib.restclientMod.IRestResponse[nodeLib.NodeJSNs.ReadableStream]
  ] = js.native
  def getItem(
    containerId: scala.Double,
    scope: java.lang.String,
    itemPath: java.lang.String,
    downloadFileName: java.lang.String
  ): js.Promise[
    typedDashRestDashClientLib.restclientMod.IRestResponse[nodeLib.NodeJSNs.ReadableStream]
  ] = js.native
}

