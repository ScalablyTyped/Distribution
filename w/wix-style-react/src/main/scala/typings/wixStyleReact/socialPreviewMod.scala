package typings.wixStyleReact

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socialPreviewMod {
  
  @JSImport("wix-style-react/dist/es/src/SocialPreview", JSImport.Default)
  @js.native
  class default ()
    extends Component[SocialPreviewProps, js.Object, js.Any]
  
  type SocialPreview = Component[SocialPreviewProps, js.Object, js.Any]
  
  trait SocialPreviewProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var media: js.UndefOr[ReactNode] = js.undefined
    
    var previewUrl: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object SocialPreviewProps {
    
    @scala.inline
    def apply(): SocialPreviewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocialPreviewProps]
    }
    
    @scala.inline
    implicit class SocialPreviewPropsMutableBuilder[Self <: SocialPreviewProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setMedia(value: ReactNode): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      @scala.inline
      def setPreviewUrl(value: String): Self = StObject.set(x, "previewUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewUrlUndefined: Self = StObject.set(x, "previewUrl", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
