package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsHorizontalSectionMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/HorizontalSection", JSImport.Default)
  @js.native
  val default: FC[HorizontalSectionProps] = js.native
  
  trait HorizontalSectionProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HorizontalSectionProps {
    
    inline def apply(): HorizontalSectionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HorizontalSectionProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HorizontalSectionProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HorizontalSectionProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsHorizontalSectionMod.foo` */
  override def _to: FC[HorizontalSectionProps] = default
}
