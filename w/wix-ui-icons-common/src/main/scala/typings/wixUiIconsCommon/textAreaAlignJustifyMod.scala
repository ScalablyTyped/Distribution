package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaAlignJustifyMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/TextAreaAlignJustify", JSImport.Default)
  @js.native
  val default: SFC[TextAreaAlignJustifyProps] = js.native
  
  @js.native
  trait TextAreaAlignJustifyProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TextAreaAlignJustifyProps {
    
    @scala.inline
    def apply(): TextAreaAlignJustifyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaAlignJustifyProps]
    }
    
    @scala.inline
    implicit class TextAreaAlignJustifyPropsMutableBuilder[Self <: TextAreaAlignJustifyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[TextAreaAlignJustifyProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAreaAlignJustifyMod.foo` */
  override def _to: SFC[TextAreaAlignJustifyProps] = default
}
