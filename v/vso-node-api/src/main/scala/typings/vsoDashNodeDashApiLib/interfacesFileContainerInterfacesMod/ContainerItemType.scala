package typings
package vsoDashNodeDashApiLib.interfacesFileContainerInterfacesMod

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
  sealed trait Any
    extends vsoDashNodeDashApiLib.interfacesFileContainerInterfacesMod.ContainerItemType
  
  /**
    * Item is a file which is stored in the file service.
    */
  @js.native
  sealed trait File
    extends vsoDashNodeDashApiLib.interfacesFileContainerInterfacesMod.ContainerItemType
  
  /**
    * Item is a folder which can have child items.
    */
  @js.native
  sealed trait Folder
    extends vsoDashNodeDashApiLib.interfacesFileContainerInterfacesMod.ContainerItemType
  
  /* 0 */ val Any: Any with scala.Double = js.native
  /* 2 */ val File: File with scala.Double = js.native
  /* 1 */ val Folder: Folder with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesFileContainerInterfacesMod.ContainerItemType with scala.Double
  ] = js.native
}

