package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.wixStyleReact.wixStyleReactStrings.light
import typings.wixStyleReact.wixStyleReactStrings.transparent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGooglePreviewMod {
  
  @JSImport("wix-style-react/dist/types/GooglePreview", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[GooglePreviewProps, js.Object, Any]
  
  type GooglePreview = PureComponent[GooglePreviewProps, js.Object, Any]
  
  trait GooglePreviewProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var descriptionMaxLines: js.UndefOr[Double] = js.undefined
    
    var previewUrl: js.UndefOr[String] = js.undefined
    
    var skin: js.UndefOr[light | transparent] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var titleMaxLines: js.UndefOr[Double] = js.undefined
  }
  object GooglePreviewProps {
    
    inline def apply(): GooglePreviewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GooglePreviewProps]
    }
    
    extension [Self <: GooglePreviewProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionMaxLines(value: Double): Self = StObject.set(x, "descriptionMaxLines", value.asInstanceOf[js.Any])
      
      inline def setDescriptionMaxLinesUndefined: Self = StObject.set(x, "descriptionMaxLines", js.undefined)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setPreviewUrl(value: String): Self = StObject.set(x, "previewUrl", value.asInstanceOf[js.Any])
      
      inline def setPreviewUrlUndefined: Self = StObject.set(x, "previewUrl", js.undefined)
      
      inline def setSkin(value: light | transparent): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleMaxLines(value: Double): Self = StObject.set(x, "titleMaxLines", value.asInstanceOf[js.Any])
      
      inline def setTitleMaxLinesUndefined: Self = StObject.set(x, "titleMaxLines", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
