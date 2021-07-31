package typings.wixStyleReact

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googlePreviewMod {
  
  @JSImport("wix-style-react/dist/es/src/GooglePreview", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[GooglePreviewProps, js.Object, js.Any]
  
  type GooglePreview = PureComponent[GooglePreviewProps, js.Object, js.Any]
  
  trait GooglePreviewProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var previewUrl: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object GooglePreviewProps {
    
    @scala.inline
    def apply(): GooglePreviewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GooglePreviewProps]
    }
    
    @scala.inline
    implicit class GooglePreviewPropsMutableBuilder[Self <: GooglePreviewProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
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
