package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaTextColorMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/TextAreaTextColor", JSImport.Default)
  @js.native
  val default: SFC[TextAreaTextColorProps] = js.native
  
  trait TextAreaTextColorProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object TextAreaTextColorProps {
    
    @scala.inline
    def apply(): TextAreaTextColorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaTextColorProps]
    }
    
    @scala.inline
    implicit class TextAreaTextColorPropsMutableBuilder[Self <: TextAreaTextColorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[TextAreaTextColorProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAreaTextColorMod.foo` */
  override def _to: SFC[TextAreaTextColorProps] = default
}
