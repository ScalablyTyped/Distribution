package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emailFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/EmailFilled", JSImport.Default)
  @js.native
  val default: SFC[EmailFilledProps] = js.native
  
  trait EmailFilledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object EmailFilledProps {
    
    @scala.inline
    def apply(): EmailFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailFilledProps]
    }
    
    @scala.inline
    implicit class EmailFilledPropsMutableBuilder[Self <: EmailFilledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[EmailFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `emailFilledMod.foo` */
  override def _to: SFC[EmailFilledProps] = default
}
