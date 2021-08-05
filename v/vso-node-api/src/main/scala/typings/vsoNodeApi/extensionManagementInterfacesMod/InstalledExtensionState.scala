package typings.vsoNodeApi.extensionManagementInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstalledExtensionState extends StObject {
  
  /**
    * States of an installed extension
    */
  var flags: ExtensionStateFlags
  
  /**
    * List of installation issues
    */
  var installationIssues: js.Array[InstalledExtensionStateIssue]
  
  /**
    * The time at which this installation was last updated
    */
  var lastUpdated: Date
}
object InstalledExtensionState {
  
  inline def apply(
    flags: ExtensionStateFlags,
    installationIssues: js.Array[InstalledExtensionStateIssue],
    lastUpdated: Date
  ): InstalledExtensionState = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], installationIssues = installationIssues.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstalledExtensionState]
  }
  
  extension [Self <: InstalledExtensionState](x: Self) {
    
    inline def setFlags(value: ExtensionStateFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setInstallationIssues(value: js.Array[InstalledExtensionStateIssue]): Self = StObject.set(x, "installationIssues", value.asInstanceOf[js.Any])
    
    inline def setInstallationIssuesVarargs(value: InstalledExtensionStateIssue*): Self = StObject.set(x, "installationIssues", js.Array(value :_*))
    
    inline def setLastUpdated(value: Date): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
  }
}
