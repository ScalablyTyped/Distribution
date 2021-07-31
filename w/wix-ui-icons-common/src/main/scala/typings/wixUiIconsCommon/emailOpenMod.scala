package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emailOpenMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/EmailOpen", JSImport.Default)
  @js.native
  val default: SFC[EmailOpenProps] = js.native
  
  trait EmailOpenProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object EmailOpenProps {
    
    @scala.inline
    def apply(): EmailOpenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailOpenProps]
    }
    
    @scala.inline
    implicit class EmailOpenPropsMutableBuilder[Self <: EmailOpenProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[EmailOpenProps]
  
  /* This means you don't have to write `default`, but can instead just say `emailOpenMod.foo` */
  override def _to: SFC[EmailOpenProps] = default
}
