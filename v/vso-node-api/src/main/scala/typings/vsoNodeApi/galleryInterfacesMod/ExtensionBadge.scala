package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionBadge extends StObject {
  
  var description: String = js.native
  
  var imgUri: String = js.native
  
  var link: String = js.native
}
object ExtensionBadge {
  
  @scala.inline
  def apply(description: String, imgUri: String, link: String): ExtensionBadge = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], imgUri = imgUri.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionBadge]
  }
  
  @scala.inline
  implicit class ExtensionBadgeMutableBuilder[Self <: ExtensionBadge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImgUri(value: String): Self = StObject.set(x, "imgUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
  }
}
