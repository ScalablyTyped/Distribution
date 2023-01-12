package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionBadge extends StObject {
  
  var description: String
  
  var imgUri: String
  
  var link: String
}
object ExtensionBadge {
  
  inline def apply(description: String, imgUri: String, link: String): ExtensionBadge = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], imgUri = imgUri.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionBadge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtensionBadge] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setImgUri(value: String): Self = StObject.set(x, "imgUri", value.asInstanceOf[js.Any])
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
  }
}
