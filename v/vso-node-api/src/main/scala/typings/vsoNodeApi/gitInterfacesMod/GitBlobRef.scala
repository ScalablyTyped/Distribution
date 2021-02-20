package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitBlobRef extends StObject {
  
  var _links: js.Any = js.native
  
  /**
    * SHA1 hash of git object
    */
  var objectId: String = js.native
  
  /**
    * Size of blob content (in bytes)
    */
  var size: Double = js.native
  
  var url: String = js.native
}
object GitBlobRef {
  
  @scala.inline
  def apply(_links: js.Any, objectId: String, size: Double, url: String): GitBlobRef = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitBlobRef]
  }
  
  @scala.inline
  implicit class GitBlobRefMutableBuilder[Self <: GitBlobRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
