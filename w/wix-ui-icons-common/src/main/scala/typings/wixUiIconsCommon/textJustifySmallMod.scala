package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textJustifySmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TextJustifySmall", JSImport.Default)
  @js.native
  val default: SFC[TextJustifySmallProps] = js.native
  
  @js.native
  trait TextJustifySmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TextJustifySmallProps {
    
    @scala.inline
    def apply(): TextJustifySmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextJustifySmallProps]
    }
    
    @scala.inline
    implicit class TextJustifySmallPropsMutableBuilder[Self <: TextJustifySmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[TextJustifySmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `textJustifySmallMod.foo` */
  override def _to: SFC[TextJustifySmallProps] = default
}
