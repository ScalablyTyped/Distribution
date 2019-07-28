package typings.vsoDashNodeDashApi.interfacesFileContainerInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContainerItemType extends js.Object

@JSImport("vso-node-api/interfaces/FileContainerInterfaces", "ContainerItemType")
@js.native
object ContainerItemType extends js.Object {
  /**
    * Any item type.
    */
  @js.native
  sealed trait Any extends ContainerItemType
  
  /**
    * Item is a file which is stored in the file service.
    */
  @js.native
  sealed trait File extends ContainerItemType
  
  /**
    * Item is a folder which can have child items.
    */
  @js.native
  sealed trait Folder extends ContainerItemType
  
  /* 0 */ val Any: typings.vsoDashNodeDashApi.interfacesFileContainerInterfacesMod.ContainerItemType.Any with Double = js.native
  /* 2 */ val File: typings.vsoDashNodeDashApi.interfacesFileContainerInterfacesMod.ContainerItemType.File with Double = js.native
  /* 1 */ val Folder: typings.vsoDashNodeDashApi.interfacesFileContainerInterfacesMod.ContainerItemType.Folder with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContainerItemType with Double] = js.native
}

