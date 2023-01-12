package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsColorDropDisabledMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/ColorDropDisabled", JSImport.Default)
  @js.native
  val default: FC[ColorDropDisabledProps] = js.native
  
  trait ColorDropDisabledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ColorDropDisabledProps {
    
    inline def apply(): ColorDropDisabledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorDropDisabledProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorDropDisabledProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ColorDropDisabledProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsColorDropDisabledMod.foo` */
  override def _to: FC[ColorDropDisabledProps] = default
}
