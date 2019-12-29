package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionRequestState with Double] = js.native
  /* 1 */ @js.native
  object Accepted extends TopLevel[Accepted with Double]
  
  /* 0 */ @js.native
  object Open extends TopLevel[Open with Double]
  
  /* 2 */ @js.native
  object Rejected extends TopLevel[Rejected with Double]
  
}

