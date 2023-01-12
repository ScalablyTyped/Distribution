package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsArrowRightBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/ArrowRightBold", JSImport.Default)
  @js.native
  val default: FC[ArrowRightBoldProps] = js.native
  
  trait ArrowRightBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ArrowRightBoldProps {
    
    inline def apply(): ArrowRightBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowRightBoldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArrowRightBoldProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ArrowRightBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsArrowRightBoldMod.foo` */
  override def _to: FC[ArrowRightBoldProps] = default
}
