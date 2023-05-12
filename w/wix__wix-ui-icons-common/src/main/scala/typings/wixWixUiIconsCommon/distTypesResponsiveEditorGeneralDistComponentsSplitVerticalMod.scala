package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsSplitVerticalMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/SplitVertical", JSImport.Default)
  @js.native
  val default: FC[SplitVerticalProps] = js.native
  
  trait SplitVerticalProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SplitVerticalProps {
    
    inline def apply(): SplitVerticalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SplitVerticalProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SplitVerticalProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SplitVerticalProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsSplitVerticalMod.foo` */
  override def _to: FC[SplitVerticalProps] = default
}
