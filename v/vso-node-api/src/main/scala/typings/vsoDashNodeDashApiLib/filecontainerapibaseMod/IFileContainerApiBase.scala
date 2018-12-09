package typings
package vsoDashNodeDashApiLib.filecontainerapibaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileContainerApiBase
  extends vsoDashNodeDashApiLib.clientapibasesMod.ClientApiBase {
  def createItems(
    items: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.VssJsonCollectionWrapperV[
      js.Array[vsoDashNodeDashApiLib.interfacesFileContainerInterfacesMod.FileContainerItem]
    ],
    containerId: scala.Double
  ): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesFileContainerInterfacesMod.FileContainerItem]
  ] = js.native
  def createItems(
    items: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.VssJsonCollectionWrapperV[
      js.Array[vsoDashNodeDashApiLib.interfacesFileContainerInterfacesMod.FileContainerItem]
    ],
    containerId: scala.Double,
    scope: java.lang.String
  ): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesFileContainerInterfacesMod.FileContainerItem]
  ] = js.native
  def deleteItem(containerId: scala.Double, itemPath: java.lang.String): js.Promise[scala.Unit] = js.native
  def deleteItem(containerId: scala.Double, itemPath: java.lang.String, scope: java.lang.String): js.Promise[scala.Unit] = js.native
  def getContainers(): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesFileContainerInterfacesMod.FileContainer]
  ] = js.native
  def getContainers(scope: java.lang.String): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesFileContainerInterfacesMod.FileContainer]
  ] = js.native
  def getContainers(scope: java.lang.String, artifactUris: java.lang.String): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesFileContainerInterfacesMod.FileContainer]
  ] = js.native
  def getItems(
    containerId: scala.Double,
    scope: js.UndefOr[java.lang.String],
    itemPath: js.UndefOr[java.lang.String],
    metadata: js.UndefOr[scala.Boolean],
    format: js.UndefOr[java.lang.String],
    downloadFileName: js.UndefOr[java.lang.String],
    includeDownloadTickets: js.UndefOr[scala.Boolean],
    isShallow: js.UndefOr[scala.Boolean]
  ): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesFileContainerInterfacesMod.FileContainerItem]
  ] = js.native
}

