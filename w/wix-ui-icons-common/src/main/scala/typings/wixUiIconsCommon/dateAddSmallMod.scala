package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateAddSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DateAddSmall", JSImport.Default)
  @js.native
  val default: SFC[DateAddSmallProps] = js.native
  
  @js.native
  trait DateAddSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DateAddSmallProps {
    
    @scala.inline
    def apply(): DateAddSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateAddSmallProps]
    }
    
    @scala.inline
    implicit class DateAddSmallPropsMutableBuilder[Self <: DateAddSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[DateAddSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `dateAddSmallMod.foo` */
  override def _to: SFC[DateAddSmallProps] = default
}
