package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emailFilledSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/EmailFilledSmall", JSImport.Default)
  @js.native
  val default: SFC[EmailFilledSmallProps] = js.native
  
  @js.native
  trait EmailFilledSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object EmailFilledSmallProps {
    
    @scala.inline
    def apply(): EmailFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailFilledSmallProps]
    }
    
    @scala.inline
    implicit class EmailFilledSmallPropsMutableBuilder[Self <: EmailFilledSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[EmailFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `emailFilledSmallMod.foo` */
  override def _to: SFC[EmailFilledSmallProps] = default
}
