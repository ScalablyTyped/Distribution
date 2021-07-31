package typings.vsoNodeApi.extensionManagementInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionState
  extends StObject
     with InstalledExtensionState {
  
  var extensionName: String
  
  /**
    * The time at which the version was last checked
    */
  var lastVersionCheck: Date
  
  var publisherName: String
  
  var version: String
}
object ExtensionState {
  
  @scala.inline
  def apply(
    extensionName: String,
    flags: ExtensionStateFlags,
    installationIssues: js.Array[InstalledExtensionStateIssue],
    lastUpdated: Date,
    lastVersionCheck: Date,
    publisherName: String,
    version: String
  ): ExtensionState = {
    val __obj = js.Dynamic.literal(extensionName = extensionName.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], installationIssues = installationIssues.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any], lastVersionCheck = lastVersionCheck.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionState]
  }
  
  @scala.inline
  implicit class ExtensionStateMutableBuilder[Self <: ExtensionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtensionName(value: String): Self = StObject.set(x, "extensionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastVersionCheck(value: Date): Self = StObject.set(x, "lastVersionCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
