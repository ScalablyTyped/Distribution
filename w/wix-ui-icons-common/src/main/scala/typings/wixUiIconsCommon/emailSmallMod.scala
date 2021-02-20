package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emailSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/EmailSmall", JSImport.Default)
  @js.native
  val default: SFC[EmailSmallProps] = js.native
  
  @js.native
  trait EmailSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object EmailSmallProps {
    
    @scala.inline
    def apply(): EmailSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailSmallProps]
    }
    
    @scala.inline
    implicit class EmailSmallPropsMutableBuilder[Self <: EmailSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[EmailSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `emailSmallMod.foo` */
  override def _to: SFC[EmailSmallProps] = default
}
