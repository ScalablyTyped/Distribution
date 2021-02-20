package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionUpdateType extends StObject
@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ExtensionUpdateType")
@js.native
object ExtensionUpdateType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionUpdateType with Double] = js.native
  
  @js.native
  sealed trait ActionRequired extends ExtensionUpdateType
  /* 6 */ val ActionRequired: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionUpdateType.ActionRequired with Double = js.native
  
  @js.native
  sealed trait ActionResolved extends ExtensionUpdateType
  /* 7 */ val ActionResolved: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionUpdateType.ActionResolved with Double = js.native
  
  @js.native
  sealed trait Disabled extends ExtensionUpdateType
  /* 4 */ val Disabled: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionUpdateType.Disabled with Double = js.native
  
  @js.native
  sealed trait Enabled extends ExtensionUpdateType
  /* 3 */ val Enabled: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionUpdateType.Enabled with Double = js.native
  
  @js.native
  sealed trait Installed extends ExtensionUpdateType
  /* 1 */ val Installed: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionUpdateType.Installed with Double = js.native
  
  @js.native
  sealed trait Uninstalled extends ExtensionUpdateType
  /* 2 */ val Uninstalled: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionUpdateType.Uninstalled with Double = js.native
  
  @js.native
  sealed trait VersionUpdated extends ExtensionUpdateType
  /* 5 */ val VersionUpdated: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionUpdateType.VersionUpdated with Double = js.native
}
