package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstalledExtensionStateIssue extends StObject {
  
  /**
    * The error message
    */
  var message: String
  
  /**
    * Source of the installation issue, for example  "Demands"
    */
  var source: String
  
  /**
    * Installation issue type (Warning, Error)
    */
  var `type`: InstalledExtensionStateIssueType
}
object InstalledExtensionStateIssue {
  
  inline def apply(message: String, source: String, `type`: InstalledExtensionStateIssueType): InstalledExtensionStateIssue = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstalledExtensionStateIssue]
  }
  
  extension [Self <: InstalledExtensionStateIssue](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: InstalledExtensionStateIssueType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
