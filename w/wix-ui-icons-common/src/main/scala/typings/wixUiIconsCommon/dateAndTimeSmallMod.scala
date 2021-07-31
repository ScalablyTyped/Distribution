package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateAndTimeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DateAndTimeSmall", JSImport.Default)
  @js.native
  val default: SFC[DateAndTimeSmallProps] = js.native
  
  trait DateAndTimeSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object DateAndTimeSmallProps {
    
    @scala.inline
    def apply(): DateAndTimeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateAndTimeSmallProps]
    }
    
    @scala.inline
    implicit class DateAndTimeSmallPropsMutableBuilder[Self <: DateAndTimeSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[DateAndTimeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `dateAndTimeSmallMod.foo` */
  override def _to: SFC[DateAndTimeSmallProps] = default
}
