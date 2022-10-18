package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsBlockQuoteMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/BlockQuote", JSImport.Default)
  @js.native
  val default: FC[BlockQuoteProps] = js.native
  
  trait BlockQuoteProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object BlockQuoteProps {
    
    inline def apply(): BlockQuoteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockQuoteProps]
    }
    
    extension [Self <: BlockQuoteProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[BlockQuoteProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsBlockQuoteMod.foo` */
  override def _to: FC[BlockQuoteProps] = default
}
