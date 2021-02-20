package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionRequestUpdateType extends StObject
@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ExtensionRequestUpdateType")
@js.native
object ExtensionRequestUpdateType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionRequestUpdateType with Double] = js.native
  
  @js.native
  sealed trait Approved extends ExtensionRequestUpdateType
  /* 2 */ val Approved: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionRequestUpdateType.Approved with Double = js.native
  
  @js.native
  sealed trait Created extends ExtensionRequestUpdateType
  /* 1 */ val Created: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionRequestUpdateType.Created with Double = js.native
  
  @js.native
  sealed trait Deleted extends ExtensionRequestUpdateType
  /* 4 */ val Deleted: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionRequestUpdateType.Deleted with Double = js.native
  
  @js.native
  sealed trait Rejected extends ExtensionRequestUpdateType
  /* 3 */ val Rejected: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionRequestUpdateType.Rejected with Double = js.native
}
