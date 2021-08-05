package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitPathAction extends StObject {
  
  var action: GitPathActions
  
  var base64Content: String
  
  var path: String
  
  var rawTextContent: String
  
  var targetPath: String
}
object GitPathAction {
  
  inline def apply(
    action: GitPathActions,
    base64Content: String,
    path: String,
    rawTextContent: String,
    targetPath: String
  ): GitPathAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], base64Content = base64Content.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], rawTextContent = rawTextContent.asInstanceOf[js.Any], targetPath = targetPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPathAction]
  }
  
  extension [Self <: GitPathAction](x: Self) {
    
    inline def setAction(value: GitPathActions): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setBase64Content(value: String): Self = StObject.set(x, "base64Content", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRawTextContent(value: String): Self = StObject.set(x, "rawTextContent", value.asInstanceOf[js.Any])
    
    inline def setTargetPath(value: String): Self = StObject.set(x, "targetPath", value.asInstanceOf[js.Any])
  }
}
