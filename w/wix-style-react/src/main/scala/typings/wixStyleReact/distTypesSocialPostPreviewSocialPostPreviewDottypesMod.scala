package typings.wixStyleReact

import typings.react.mod.ReactNode
import typings.wixStyleReact.wixStyleReactStrings.facebook
import typings.wixStyleReact.wixStyleReactStrings.instagram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSocialPostPreviewSocialPostPreviewDottypesMod {
  
  trait SocialPostPreviewProps extends StObject {
    
    /** Adds textual post content */
    var caption: js.UndefOr[ReactNode] = js.undefined
    
    /** Applies a CSS class to the component’s root element */
    var className: js.UndefOr[String] = js.undefined
    
    /** Applies a data-hook HTML attribute to be used in the tests */
    var dataHook: js.UndefOr[String] = js.undefined
    
    /** Adds visual post content (most commonly, <Image/> is added as a child item) */
    var media: js.UndefOr[ReactNode] = js.undefined
    
    /** Contains a URL link to the post’s profile picture */
    var profileImageSrc: js.UndefOr[String] = js.undefined
    
    /** Contains the post’s profile name (a username in Facebook or Instagram) */
    var profileName: js.UndefOr[ReactNode] = js.undefined
    
    /** Controls the appearance and layout of the component */
    var skin: js.UndefOr[facebook | instagram] = js.undefined
  }
  object SocialPostPreviewProps {
    
    inline def apply(): SocialPostPreviewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocialPostPreviewProps]
    }
    
    extension [Self <: SocialPostPreviewProps](x: Self) {
      
      inline def setCaption(value: ReactNode): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setMedia(value: ReactNode): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setProfileImageSrc(value: String): Self = StObject.set(x, "profileImageSrc", value.asInstanceOf[js.Any])
      
      inline def setProfileImageSrcUndefined: Self = StObject.set(x, "profileImageSrc", js.undefined)
      
      inline def setProfileName(value: ReactNode): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
      
      inline def setProfileNameUndefined: Self = StObject.set(x, "profileName", js.undefined)
      
      inline def setSkin(value: facebook | instagram): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    }
  }
}
