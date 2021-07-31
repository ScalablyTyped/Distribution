package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionUpdateType extends StObject
@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ExtensionUpdateType")
@js.native
object ExtensionUpdateType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionUpdateType & Double] = js.native
  
  @js.native
  sealed trait ActionRequired
    extends StObject
       with ExtensionUpdateType
  /* 6 */ val ActionRequired: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionUpdateType.ActionRequired & Double = js.native
  
  @js.native
  sealed trait ActionResolved
    extends StObject
       with ExtensionUpdateType
  /* 7 */ val ActionResolved: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionUpdateType.ActionResolved & Double = js.native
  
  @js.native
  sealed trait Disabled
    extends StObject
       with ExtensionUpdateType
  /* 4 */ val Disabled: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionUpdateType.Disabled & Double = js.native
  
  @js.native
  sealed trait Enabled
    extends StObject
       with ExtensionUpdateType
  /* 3 */ val Enabled: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionUpdateType.Enabled & Double = js.native
  
  @js.native
  sealed trait Installed
    extends StObject
       with ExtensionUpdateType
  /* 1 */ val Installed: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionUpdateType.Installed & Double = js.native
  
  @js.native
  sealed trait Uninstalled
    extends StObject
       with ExtensionUpdateType
  /* 2 */ val Uninstalled: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionUpdateType.Uninstalled & Double = js.native
  
  @js.native
  sealed trait VersionUpdated
    extends StObject
       with ExtensionUpdateType
  /* 5 */ val VersionUpdated: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionUpdateType.VersionUpdated & Double = js.native
}
