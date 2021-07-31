package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Date", JSImport.Default)
  @js.native
  val default: SFC[DateProps] = js.native
  
  trait DateProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object DateProps {
    
    @scala.inline
    def apply(): DateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateProps]
    }
    
    @scala.inline
    implicit class DatePropsMutableBuilder[Self <: DateProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[DateProps]
  
  /* This means you don't have to write `default`, but can instead just say `dateMod.foo` */
  override def _to: SFC[DateProps] = default
}
