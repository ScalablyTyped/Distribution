package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DateSmall", JSImport.Default)
  @js.native
  val default: SFC[DateSmallProps] = js.native
  
  trait DateSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object DateSmallProps {
    
    @scala.inline
    def apply(): DateSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateSmallProps]
    }
    
    @scala.inline
    implicit class DateSmallPropsMutableBuilder[Self <: DateSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[DateSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `dateSmallMod.foo` */
  override def _to: SFC[DateSmallProps] = default
}
