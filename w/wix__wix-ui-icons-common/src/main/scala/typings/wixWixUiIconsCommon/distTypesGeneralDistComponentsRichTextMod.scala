package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsRichTextMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/RichText", JSImport.Default)
  @js.native
  val default: FC[RichTextProps] = js.native
  
  trait RichTextProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object RichTextProps {
    
    inline def apply(): RichTextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RichTextProps]
    }
    
    extension [Self <: RichTextProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[RichTextProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsRichTextMod.foo` */
  override def _to: FC[RichTextProps] = default
}
