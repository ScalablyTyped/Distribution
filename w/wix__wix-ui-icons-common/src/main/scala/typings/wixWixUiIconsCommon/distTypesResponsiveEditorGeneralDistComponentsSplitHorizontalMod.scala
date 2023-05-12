package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsSplitHorizontalMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/SplitHorizontal", JSImport.Default)
  @js.native
  val default: FC[SplitHorizontalProps] = js.native
  
  trait SplitHorizontalProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SplitHorizontalProps {
    
    inline def apply(): SplitHorizontalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SplitHorizontalProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SplitHorizontalProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SplitHorizontalProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsSplitHorizontalMod.foo` */
  override def _to: FC[SplitHorizontalProps] = default
}
