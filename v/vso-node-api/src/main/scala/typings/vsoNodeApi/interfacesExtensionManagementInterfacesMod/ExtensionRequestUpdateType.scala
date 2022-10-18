package typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionRequestUpdateType extends StObject
@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ExtensionRequestUpdateType")
@js.native
object ExtensionRequestUpdateType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionRequestUpdateType & Double] = js.native
  
  @js.native
  sealed trait Approved
    extends StObject
       with ExtensionRequestUpdateType
  /* 2 */ val Approved: typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod.ExtensionRequestUpdateType.Approved & Double = js.native
  
  @js.native
  sealed trait Created
    extends StObject
       with ExtensionRequestUpdateType
  /* 1 */ val Created: typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod.ExtensionRequestUpdateType.Created & Double = js.native
  
  @js.native
  sealed trait Deleted
    extends StObject
       with ExtensionRequestUpdateType
  /* 4 */ val Deleted: typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod.ExtensionRequestUpdateType.Deleted & Double = js.native
  
  @js.native
  sealed trait Rejected
    extends StObject
       with ExtensionRequestUpdateType
  /* 3 */ val Rejected: typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod.ExtensionRequestUpdateType.Rejected & Double = js.native
}
