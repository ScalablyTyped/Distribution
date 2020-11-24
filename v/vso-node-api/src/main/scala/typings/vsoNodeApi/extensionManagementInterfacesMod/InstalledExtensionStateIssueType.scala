package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InstalledExtensionStateIssueType extends js.Object
@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "InstalledExtensionStateIssueType")
@js.native
object InstalledExtensionStateIssueType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InstalledExtensionStateIssueType with Double] = js.native
  
  /**
    * Represents an installation error, for example an explicit demand not supported
    */
  @js.native
  sealed trait Error extends InstalledExtensionStateIssueType
  /* 1 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /**
    * Represents an installation warning, for example an implicit demand not supported
    */
  @js.native
  sealed trait Warning extends InstalledExtensionStateIssueType
  /* 0 */ @js.native
  object Warning extends TopLevel[Warning with Double]
}
