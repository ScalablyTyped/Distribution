package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionRequestState extends StObject
@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ExtensionRequestState")
@js.native
object ExtensionRequestState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionRequestState & Double] = js.native
  
  /**
    * The request was accepted (extension installed or license assigned)
    */
  @js.native
  sealed trait Accepted
    extends StObject
       with ExtensionRequestState
  /* 1 */ val Accepted: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionRequestState.Accepted & Double = js.native
  
  /**
    * The request has been opened, but not yet responded to
    */
  @js.native
  sealed trait Open
    extends StObject
       with ExtensionRequestState
  /* 0 */ val Open: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionRequestState.Open & Double = js.native
  
  /**
    * The request was rejected (extension not installed or license not assigned)
    */
  @js.native
  sealed trait Rejected
    extends StObject
       with ExtensionRequestState
  /* 2 */ val Rejected: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionRequestState.Rejected & Double = js.native
}
