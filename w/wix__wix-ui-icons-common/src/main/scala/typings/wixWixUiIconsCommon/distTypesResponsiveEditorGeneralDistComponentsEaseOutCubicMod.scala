package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsEaseOutCubicMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/EaseOutCubic", JSImport.Default)
  @js.native
  val default: FC[EaseOutCubicProps] = js.native
  
  trait EaseOutCubicProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object EaseOutCubicProps {
    
    inline def apply(): EaseOutCubicProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EaseOutCubicProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EaseOutCubicProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[EaseOutCubicProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsEaseOutCubicMod.foo` */
  override def _to: FC[EaseOutCubicProps] = default
}
