package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsArrowUpDownMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/ArrowUpDown", JSImport.Default)
  @js.native
  val default: FC[ArrowUpDownProps] = js.native
  
  trait ArrowUpDownProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ArrowUpDownProps {
    
    inline def apply(): ArrowUpDownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowUpDownProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArrowUpDownProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ArrowUpDownProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsArrowUpDownMod.foo` */
  override def _to: FC[ArrowUpDownProps] = default
}
