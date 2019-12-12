package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.InstalledExtensionStateIssueType.Error
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.InstalledExtensionStateIssueType.Warning
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InstalledExtensionStateIssueType with Double] = js.native
  /* 1 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 0 */ @js.native
  object Warning extends TopLevel[Warning with Double]
  
}

