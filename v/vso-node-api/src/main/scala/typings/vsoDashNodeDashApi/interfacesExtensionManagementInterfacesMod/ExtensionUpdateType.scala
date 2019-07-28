package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtensionUpdateType extends js.Object

@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ExtensionUpdateType")
@js.native
object ExtensionUpdateType extends js.Object {
  @js.native
  sealed trait ActionRequired extends ExtensionUpdateType
  
  @js.native
  sealed trait ActionResolved extends ExtensionUpdateType
  
  @js.native
  sealed trait Disabled extends ExtensionUpdateType
  
  @js.native
  sealed trait Enabled extends ExtensionUpdateType
  
  @js.native
  sealed trait Installed extends ExtensionUpdateType
  
  @js.native
  sealed trait Uninstalled extends ExtensionUpdateType
  
  @js.native
  sealed trait VersionUpdated extends ExtensionUpdateType
  
  /* 6 */ val ActionRequired: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionUpdateType.ActionRequired with Double = js.native
  /* 7 */ val ActionResolved: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionUpdateType.ActionResolved with Double = js.native
  /* 4 */ val Disabled: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionUpdateType.Disabled with Double = js.native
  /* 3 */ val Enabled: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionUpdateType.Enabled with Double = js.native
  /* 1 */ val Installed: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionUpdateType.Installed with Double = js.native
  /* 2 */ val Uninstalled: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionUpdateType.Uninstalled with Double = js.native
  /* 5 */ val VersionUpdated: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionUpdateType.VersionUpdated with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionUpdateType with Double] = js.native
}

