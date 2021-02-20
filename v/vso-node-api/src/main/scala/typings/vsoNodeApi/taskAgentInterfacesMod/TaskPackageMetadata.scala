package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskPackageMetadata extends StObject {
  
  /**
    * Gets the name of the package.
    */
  var `type`: String = js.native
  
  /**
    * Gets the url of the package.
    */
  var url: String = js.native
  
  /**
    * Gets the version of the package.
    */
  var version: String = js.native
}
object TaskPackageMetadata {
  
  @scala.inline
  def apply(`type`: String, url: String, version: String): TaskPackageMetadata = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskPackageMetadata]
  }
  
  @scala.inline
  implicit class TaskPackageMetadataMutableBuilder[Self <: TaskPackageMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
