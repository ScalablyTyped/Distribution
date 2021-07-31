package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object confirmMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Confirm", JSImport.Default)
  @js.native
  val default: SFC[ConfirmProps] = js.native
  
  trait ConfirmProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ConfirmProps {
    
    @scala.inline
    def apply(): ConfirmProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmProps]
    }
    
    @scala.inline
    implicit class ConfirmPropsMutableBuilder[Self <: ConfirmProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ConfirmProps]
  
  /* This means you don't have to write `default`, but can instead just say `confirmMod.foo` */
  override def _to: SFC[ConfirmProps] = default
}
