package typings
package vsoDashNodeDashApiLib.interfacesFileContainerInterfacesMod

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
  sealed trait Created
    extends vsoDashNodeDashApiLib.interfacesFileContainerInterfacesMod.ContainerItemStatus
  
  /**
    * Item is a file pending for upload.
    */
  @js.native
  sealed trait PendingUpload
    extends vsoDashNodeDashApiLib.interfacesFileContainerInterfacesMod.ContainerItemStatus
  
  /* 1 */ val Created: Created with scala.Double = js.native
  /* 2 */ val PendingUpload: PendingUpload with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesFileContainerInterfacesMod.ContainerItemStatus with scala.Double
  ] = js.native
}

