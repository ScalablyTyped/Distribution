package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

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
  sealed trait Error
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.InstalledExtensionStateIssueType
  
  /**
       * Represents an installation warning, for example an implicit demand not supported
       */
  @js.native
  sealed trait Warning
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.InstalledExtensionStateIssueType
  
  /* 1 */ val Error: Error with scala.Double = js.native
  /* 0 */ val Warning: Warning with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.InstalledExtensionStateIssueType with scala.Double
  ] = js.native
}

