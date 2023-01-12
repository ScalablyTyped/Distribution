package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsShoppingCartBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/ShoppingCartBold", JSImport.Default)
  @js.native
  val default: FC[ShoppingCartBoldProps] = js.native
  
  trait ShoppingCartBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ShoppingCartBoldProps {
    
    inline def apply(): ShoppingCartBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShoppingCartBoldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShoppingCartBoldProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ShoppingCartBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsShoppingCartBoldMod.foo` */
  override def _to: FC[ShoppingCartBoldProps] = default
}
