package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textJustifyMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TextJustify", JSImport.Default)
  @js.native
  val default: SFC[TextJustifyProps] = js.native
  
  trait TextJustifyProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object TextJustifyProps {
    
    @scala.inline
    def apply(): TextJustifyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextJustifyProps]
    }
    
    @scala.inline
    implicit class TextJustifyPropsMutableBuilder[Self <: TextJustifyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[TextJustifyProps]
  
  /* This means you don't have to write `default`, but can instead just say `textJustifyMod.foo` */
  override def _to: SFC[TextJustifyProps] = default
}
