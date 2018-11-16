package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtensionRequestUpdateType extends js.Object

@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ExtensionRequestUpdateType")
@js.native
object ExtensionRequestUpdateType extends js.Object {
  @js.native
  sealed trait Approved
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionRequestUpdateType
  
  @js.native
  sealed trait Created
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionRequestUpdateType
  
  @js.native
  sealed trait Deleted
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionRequestUpdateType
  
  @js.native
  sealed trait Rejected
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionRequestUpdateType
  
  /* 2 */ val Approved: Approved with scala.Double = js.native
  /* 1 */ val Created: Created with scala.Double = js.native
  /* 4 */ val Deleted: Deleted with scala.Double = js.native
  /* 3 */ val Rejected: Rejected with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionRequestUpdateType with scala.Double
  ] = js.native
}

