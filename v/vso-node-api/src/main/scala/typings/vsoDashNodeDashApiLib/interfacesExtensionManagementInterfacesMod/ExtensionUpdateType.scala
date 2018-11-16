package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtensionUpdateType extends js.Object

@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ExtensionUpdateType")
@js.native
object ExtensionUpdateType extends js.Object {
  @js.native
  sealed trait ActionRequired
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionUpdateType
  
  @js.native
  sealed trait ActionResolved
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionUpdateType
  
  @js.native
  sealed trait Disabled
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionUpdateType
  
  @js.native
  sealed trait Enabled
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionUpdateType
  
  @js.native
  sealed trait Installed
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionUpdateType
  
  @js.native
  sealed trait Uninstalled
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionUpdateType
  
  @js.native
  sealed trait VersionUpdated
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionUpdateType
  
  /* 6 */ val ActionRequired: ActionRequired with scala.Double = js.native
  /* 7 */ val ActionResolved: ActionResolved with scala.Double = js.native
  /* 4 */ val Disabled: Disabled with scala.Double = js.native
  /* 3 */ val Enabled: Enabled with scala.Double = js.native
  /* 1 */ val Installed: Installed with scala.Double = js.native
  /* 2 */ val Uninstalled: Uninstalled with scala.Double = js.native
  /* 5 */ val VersionUpdated: VersionUpdated with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionUpdateType with scala.Double
  ] = js.native
}

