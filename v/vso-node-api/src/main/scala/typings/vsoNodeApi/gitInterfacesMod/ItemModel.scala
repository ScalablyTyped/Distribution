package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemModel extends StObject {
  
  var _links: js.Any
  
  var contentMetadata: FileContentMetadata
  
  var isFolder: Boolean
  
  var isSymLink: Boolean
  
  var path: String
  
  var url: String
}
object ItemModel {
  
  inline def apply(
    _links: js.Any,
    contentMetadata: FileContentMetadata,
    isFolder: Boolean,
    isSymLink: Boolean,
    path: String,
    url: String
  ): ItemModel = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], contentMetadata = contentMetadata.asInstanceOf[js.Any], isFolder = isFolder.asInstanceOf[js.Any], isSymLink = isSymLink.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemModel]
  }
  
  extension [Self <: ItemModel](x: Self) {
    
    inline def setContentMetadata(value: FileContentMetadata): Self = StObject.set(x, "contentMetadata", value.asInstanceOf[js.Any])
    
    inline def setIsFolder(value: Boolean): Self = StObject.set(x, "isFolder", value.asInstanceOf[js.Any])
    
    inline def setIsSymLink(value: Boolean): Self = StObject.set(x, "isSymLink", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
