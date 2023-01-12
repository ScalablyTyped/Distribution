package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsTypographyDisabledMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/TypographyDisabled", JSImport.Default)
  @js.native
  val default: FC[TypographyDisabledProps] = js.native
  
  trait TypographyDisabledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TypographyDisabledProps {
    
    inline def apply(): TypographyDisabledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypographyDisabledProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypographyDisabledProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TypographyDisabledProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsTypographyDisabledMod.foo` */
  override def _to: FC[TypographyDisabledProps] = default
}
