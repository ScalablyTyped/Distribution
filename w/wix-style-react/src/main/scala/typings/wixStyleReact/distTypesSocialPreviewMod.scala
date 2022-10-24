package typings.wixStyleReact

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSocialPreviewMod {
  
  @JSImport("wix-style-react/dist/types/SocialPreview", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SocialPreviewProps, js.Object, Any]
  
  type SocialPreview = Component[SocialPreviewProps, js.Object, Any]
  
  trait SocialPreviewProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var media: js.UndefOr[ReactNode] = js.undefined
    
    var previewUrl: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[SocialPreviewSize] = js.undefined
    
    var skin: js.UndefOr[SocialPreviewSkin] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object SocialPreviewProps {
    
    inline def apply(): SocialPreviewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocialPreviewProps]
    }
    
    extension [Self <: SocialPreviewProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setMedia(value: ReactNode): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setPreviewUrl(value: String): Self = StObject.set(x, "previewUrl", value.asInstanceOf[js.Any])
      
      inline def setPreviewUrlUndefined: Self = StObject.set(x, "previewUrl", js.undefined)
      
      inline def setSize(value: SocialPreviewSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSkin(value: SocialPreviewSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.large
    - typings.wixStyleReact.wixStyleReactStrings.small
  */
  trait SocialPreviewSize extends StObject
  object SocialPreviewSize {
    
    inline def large: typings.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.large]
    
    inline def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.social
    - typings.wixStyleReact.wixStyleReactStrings.twitter
  */
  trait SocialPreviewSkin extends StObject
  object SocialPreviewSkin {
    
    inline def social: typings.wixStyleReact.wixStyleReactStrings.social = "social".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.social]
    
    inline def twitter: typings.wixStyleReact.wixStyleReactStrings.twitter = "twitter".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.twitter]
  }
}
