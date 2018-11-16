package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

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
  sealed trait Accepted
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionRequestState
  
  /**
       * The request has been opened, but not yet responded to
       */
  @js.native
  sealed trait Open
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionRequestState
  
  /**
       * The request was rejected (extension not installed or license not assigned)
       */
  @js.native
  sealed trait Rejected
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionRequestState
  
  /* 1 */ val Accepted: Accepted with scala.Double = js.native
  /* 0 */ val Open: Open with scala.Double = js.native
  /* 2 */ val Rejected: Rejected with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionRequestState with scala.Double
  ] = js.native
}

