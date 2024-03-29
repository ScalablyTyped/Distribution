package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsArrowUpBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/ArrowUpBold", JSImport.Default)
  @js.native
  val default: FC[ArrowUpBoldProps] = js.native
  
  trait ArrowUpBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ArrowUpBoldProps {
    
    inline def apply(): ArrowUpBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowUpBoldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArrowUpBoldProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ArrowUpBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsArrowUpBoldMod.foo` */
  override def _to: FC[ArrowUpBoldProps] = default
}
