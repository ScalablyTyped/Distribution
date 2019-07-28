package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtensionRequestState extends js.Object

@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ExtensionRequestState")
@js.native
object ExtensionRequestState extends js.Object {
  /**
    * The request was accepted (extension installed or license assigned)
    */
  @js.native
  sealed trait Accepted extends ExtensionRequestState
  
  /**
    * The request has been opened, but not yet responded to
    */
  @js.native
  sealed trait Open extends ExtensionRequestState
  
  /**
    * The request was rejected (extension not installed or license not assigned)
    */
  @js.native
  sealed trait Rejected extends ExtensionRequestState
  
  /* 1 */ val Accepted: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionRequestState.Accepted with Double = js.native
  /* 0 */ val Open: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionRequestState.Open with Double = js.native
  /* 2 */ val Rejected: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionRequestState.Rejected with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionRequestState with Double] = js.native
}

