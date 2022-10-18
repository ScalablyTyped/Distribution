package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemDistComponentsTextAreaItalicMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/TextAreaItalic", JSImport.Default)
  @js.native
  val default: FC[TextAreaItalicProps] = js.native
  
  trait TextAreaItalicProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TextAreaItalicProps {
    
    inline def apply(): TextAreaItalicProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaItalicProps]
    }
    
    extension [Self <: TextAreaItalicProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TextAreaItalicProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemDistComponentsTextAreaItalicMod.foo` */
  override def _to: FC[TextAreaItalicProps] = default
}
