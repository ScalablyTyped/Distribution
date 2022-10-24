package typings.wixStyleReact.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<wix-style-react.wix-style-react/dist/types/SocialPostPreview/SocialPostPreview.types.SocialPostPreviewProps, 'profileName' | 'profileImageSrc' | 'caption' | 'media'> */
trait PickSocialPostPreviewProp extends StObject {
  
  var caption: js.UndefOr[ReactNode] = js.undefined
  
  var media: js.UndefOr[ReactNode] = js.undefined
  
  var profileImageSrc: js.UndefOr[String] = js.undefined
  
  var profileName: js.UndefOr[ReactNode] = js.undefined
}
object PickSocialPostPreviewProp {
  
  inline def apply(): PickSocialPostPreviewProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickSocialPostPreviewProp]
  }
  
  extension [Self <: PickSocialPostPreviewProp](x: Self) {
    
    inline def setCaption(value: ReactNode): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setMedia(value: ReactNode): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setProfileImageSrc(value: String): Self = StObject.set(x, "profileImageSrc", value.asInstanceOf[js.Any])
    
    inline def setProfileImageSrcUndefined: Self = StObject.set(x, "profileImageSrc", js.undefined)
    
    inline def setProfileName(value: ReactNode): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
    
    inline def setProfileNameUndefined: Self = StObject.set(x, "profileName", js.undefined)
  }
}
