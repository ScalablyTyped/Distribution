package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InstalledExtensionStateIssueType extends js.Object

@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "InstalledExtensionStateIssueType")
@js.native
object InstalledExtensionStateIssueType extends js.Object {
  /**
    * Represents an installation error, for example an explicit demand not supported
    */
  @js.native
  sealed trait Error extends InstalledExtensionStateIssueType
  
  /**
    * Represents an installation warning, for example an implicit demand not supported
    */
  @js.native
  sealed trait Warning extends InstalledExtensionStateIssueType
  
  /* 1 */ val Error: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.InstalledExtensionStateIssueType.Error with Double = js.native
  /* 0 */ val Warning: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.InstalledExtensionStateIssueType.Warning with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InstalledExtensionStateIssueType with Double] = js.native
}

