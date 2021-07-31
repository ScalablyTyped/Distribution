package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaTableMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/TextAreaTable", JSImport.Default)
  @js.native
  val default: SFC[TextAreaTableProps] = js.native
  
  trait TextAreaTableProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object TextAreaTableProps {
    
    @scala.inline
    def apply(): TextAreaTableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaTableProps]
    }
    
    @scala.inline
    implicit class TextAreaTablePropsMutableBuilder[Self <: TextAreaTableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[TextAreaTableProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAreaTableMod.foo` */
  override def _to: SFC[TextAreaTableProps] = default
}
