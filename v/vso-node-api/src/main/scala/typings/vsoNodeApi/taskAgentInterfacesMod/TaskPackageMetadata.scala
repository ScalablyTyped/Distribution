package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskPackageMetadata extends StObject {
  
  /**
    * Gets the name of the package.
    */
  var `type`: String
  
  /**
    * Gets the url of the package.
    */
  var url: String
  
  /**
    * Gets the version of the package.
    */
  var version: String
}
object TaskPackageMetadata {
  
  inline def apply(`type`: String, url: String, version: String): TaskPackageMetadata = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskPackageMetadata]
  }
  
  extension [Self <: TaskPackageMetadata](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
