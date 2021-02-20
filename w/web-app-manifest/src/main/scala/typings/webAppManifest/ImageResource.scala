package typings.webAppManifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Each `ImageResource` represents an image that is used as part of a web application, suitable to use in
  * various contexts depending on the semantics of the member that is using the object (e.g., an icon
  * that is part of an application menu, etc.).
  *
  * @see https://w3c.github.io/manifest/#imageresource-and-its-members
  */
@js.native
trait ImageResource extends StObject {
  
  /**
    * The `platform` member represents the platform to which a containing object applies.
    *
    * @see https://w3c.github.io/manifest/#platform-member
    */
  var platform: js.UndefOr[String] = js.native
  
  /**
    * The purpose member is an unordered set of unique space-separated tokens that are ASCII case-
    * insensitive.
    *
    * @see https://w3c.github.io/manifest/#purpose-member
    */
  var purpose: js.UndefOr[String] = js.native
  
  /**
    * The `sizes` member of an ImageResource is a string consisting of an unordered set of unique space-
    * separated tokens which are ASCII case-insensitive that represents the dimensions of an image.
    *
    * @see https://w3c.github.io/manifest/#sizes-member
    */
  var sizes: js.UndefOr[String] = js.native
  
  /**
    * The `src` member of an `ImageResource` is a URL from which a user agent can fetch the image's data.
    *
    * @see https://w3c.github.io/manifest/#src-member
    */
  var src: String = js.native
  
  /**
    * The `type` member of an `ImageResource` is a hint as to the MIME type of the image.
    *
    * @see https://w3c.github.io/manifest/#type-member
    */
  var `type`: js.UndefOr[String] = js.native
}
object ImageResource {
  
  @scala.inline
  def apply(src: String): ImageResource = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageResource]
  }
  
  @scala.inline
  implicit class ImageResourceMutableBuilder[Self <: ImageResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setPurpose(value: String): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    @scala.inline
    def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
