package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstalledExtensionStateIssue extends StObject {
  
  /**
    * The error message
    */
  var message: String = js.native
  
  /**
    * Source of the installation issue, for example  "Demands"
    */
  var source: String = js.native
  
  /**
    * Installation issue type (Warning, Error)
    */
  var `type`: InstalledExtensionStateIssueType = js.native
}
object InstalledExtensionStateIssue {
  
  @scala.inline
  def apply(message: String, source: String, `type`: InstalledExtensionStateIssueType): InstalledExtensionStateIssue = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstalledExtensionStateIssue]
  }
  
  @scala.inline
  implicit class InstalledExtensionStateIssueMutableBuilder[Self <: InstalledExtensionStateIssue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: InstalledExtensionStateIssueType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
