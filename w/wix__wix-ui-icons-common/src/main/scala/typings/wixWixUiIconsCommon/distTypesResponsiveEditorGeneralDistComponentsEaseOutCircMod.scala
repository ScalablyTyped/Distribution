package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsEaseOutCircMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/EaseOutCirc", JSImport.Default)
  @js.native
  val default: FC[EaseOutCircProps] = js.native
  
  trait EaseOutCircProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object EaseOutCircProps {
    
    inline def apply(): EaseOutCircProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EaseOutCircProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EaseOutCircProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[EaseOutCircProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsEaseOutCircMod.foo` */
  override def _to: FC[EaseOutCircProps] = default
}
