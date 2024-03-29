package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsHoverBoxBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/HoverBoxBold", JSImport.Default)
  @js.native
  val default: FC[HoverBoxBoldProps] = js.native
  
  trait HoverBoxBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HoverBoxBoldProps {
    
    inline def apply(): HoverBoxBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HoverBoxBoldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HoverBoxBoldProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HoverBoxBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsHoverBoxBoldMod.foo` */
  override def _to: FC[HoverBoxBoldProps] = default
}
