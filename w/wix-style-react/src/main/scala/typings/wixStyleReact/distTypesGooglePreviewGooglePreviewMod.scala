package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.DescriptionMaxLines
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGooglePreviewGooglePreviewMod {
  
  object default {
    
    /**
      *  A preview of a title, link and description of SEO result as it displayed in Google
      */
    inline def apply(param0: DescriptionMaxLines): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/GooglePreview/GooglePreview", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/GooglePreview/GooglePreview", "default.defaultProps.descriptionMaxLines_1")
      @js.native
      val descriptionMaxLines1: Double = js.native
      
      @JSImport("wix-style-react/dist/types/GooglePreview/GooglePreview", "default.defaultProps.skin_1")
      @js.native
      val skin1: String = js.native
      
      @JSImport("wix-style-react/dist/types/GooglePreview/GooglePreview", "default.defaultProps.titleMaxLines_1")
      @js.native
      val titleMaxLines1: Double = js.native
    }
    
    @JSImport("wix-style-react/dist/types/GooglePreview/GooglePreview", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/GooglePreview/GooglePreview", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/GooglePreview/GooglePreview", "default.propTypes.description")
      @js.native
      val description: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/GooglePreview/GooglePreview", "default.propTypes.descriptionMaxLines")
      @js.native
      val descriptionMaxLines: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/GooglePreview/GooglePreview", "default.propTypes.previewUrl")
      @js.native
      val previewUrl: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/GooglePreview/GooglePreview", "default.propTypes.skin")
      @js.native
      val skin: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/GooglePreview/GooglePreview", "default.propTypes.title")
      @js.native
      val title: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/GooglePreview/GooglePreview", "default.propTypes.titleMaxLines")
      @js.native
      val titleMaxLines: Requireable[Double] = js.native
    }
  }
}
