package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaNumberedListMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/TextAreaNumberedList", JSImport.Default)
  @js.native
  val default: SFC[TextAreaNumberedListProps] = js.native
  
  @js.native
  trait TextAreaNumberedListProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TextAreaNumberedListProps {
    
    @scala.inline
    def apply(): TextAreaNumberedListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaNumberedListProps]
    }
    
    @scala.inline
    implicit class TextAreaNumberedListPropsMutableBuilder[Self <: TextAreaNumberedListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[TextAreaNumberedListProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAreaNumberedListMod.foo` */
  override def _to: SFC[TextAreaNumberedListProps] = default
}
