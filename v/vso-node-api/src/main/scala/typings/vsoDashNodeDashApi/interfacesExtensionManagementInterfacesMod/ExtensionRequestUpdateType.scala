package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtensionRequestUpdateType extends js.Object

@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ExtensionRequestUpdateType")
@js.native
object ExtensionRequestUpdateType extends js.Object {
  @js.native
  sealed trait Approved extends ExtensionRequestUpdateType
  
  @js.native
  sealed trait Created extends ExtensionRequestUpdateType
  
  @js.native
  sealed trait Deleted extends ExtensionRequestUpdateType
  
  @js.native
  sealed trait Rejected extends ExtensionRequestUpdateType
  
  /* 2 */ val Approved: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionRequestUpdateType.Approved with Double = js.native
  /* 1 */ val Created: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionRequestUpdateType.Created with Double = js.native
  /* 4 */ val Deleted: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionRequestUpdateType.Deleted with Double = js.native
  /* 3 */ val Rejected: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionRequestUpdateType.Rejected with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionRequestUpdateType with Double] = js.native
}

