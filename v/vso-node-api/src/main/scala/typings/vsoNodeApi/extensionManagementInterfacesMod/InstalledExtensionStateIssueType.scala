package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InstalledExtensionStateIssueType extends StObject
@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "InstalledExtensionStateIssueType")
@js.native
object InstalledExtensionStateIssueType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InstalledExtensionStateIssueType & Double] = js.native
  
  /**
    * Represents an installation error, for example an explicit demand not supported
    */
  @js.native
  sealed trait Error
    extends StObject
       with InstalledExtensionStateIssueType
  /* 1 */ val Error: typings.vsoNodeApi.extensionManagementInterfacesMod.InstalledExtensionStateIssueType.Error & Double = js.native
  
  /**
    * Represents an installation warning, for example an implicit demand not supported
    */
  @js.native
  sealed trait Warning
    extends StObject
       with InstalledExtensionStateIssueType
  /* 0 */ val Warning: typings.vsoNodeApi.extensionManagementInterfacesMod.InstalledExtensionStateIssueType.Warning & Double = js.native
}
