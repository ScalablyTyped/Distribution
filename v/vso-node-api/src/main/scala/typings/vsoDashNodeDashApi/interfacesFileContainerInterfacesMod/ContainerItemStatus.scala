package typings.vsoDashNodeDashApi.interfacesFileContainerInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContainerItemStatus extends js.Object

@JSImport("vso-node-api/interfaces/FileContainerInterfaces", "ContainerItemStatus")
@js.native
object ContainerItemStatus extends js.Object {
  /**
    * Item is created.
    */
  @js.native
  sealed trait Created extends ContainerItemStatus
  
  /**
    * Item is a file pending for upload.
    */
  @js.native
  sealed trait PendingUpload extends ContainerItemStatus
  
  /* 1 */ val Created: typings.vsoDashNodeDashApi.interfacesFileContainerInterfacesMod.ContainerItemStatus.Created with Double = js.native
  /* 2 */ val PendingUpload: typings.vsoDashNodeDashApi.interfacesFileContainerInterfacesMod.ContainerItemStatus.PendingUpload with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContainerItemStatus with Double] = js.native
}

