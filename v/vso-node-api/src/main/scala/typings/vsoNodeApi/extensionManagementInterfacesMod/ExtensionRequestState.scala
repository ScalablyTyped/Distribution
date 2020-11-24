package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionRequestState extends js.Object
@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ExtensionRequestState")
@js.native
object ExtensionRequestState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionRequestState with Double] = js.native
  
  /**
    * The request was accepted (extension installed or license assigned)
    */
  @js.native
  sealed trait Accepted extends ExtensionRequestState
  /* 1 */ @js.native
  object Accepted extends TopLevel[Accepted with Double]
  
  /**
    * The request has been opened, but not yet responded to
    */
  @js.native
  sealed trait Open extends ExtensionRequestState
  /* 0 */ @js.native
  object Open extends TopLevel[Open with Double]
  
  /**
    * The request was rejected (extension not installed or license not assigned)
    */
  @js.native
  sealed trait Rejected extends ExtensionRequestState
  /* 2 */ @js.native
  object Rejected extends TopLevel[Rejected with Double]
}
