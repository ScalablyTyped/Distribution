package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object confirmSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ConfirmSmall", JSImport.Default)
  @js.native
  val default: SFC[ConfirmSmallProps] = js.native
  
  @js.native
  trait ConfirmSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ConfirmSmallProps {
    
    @scala.inline
    def apply(): ConfirmSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmSmallProps]
    }
    
    @scala.inline
    implicit class ConfirmSmallPropsMutableBuilder[Self <: ConfirmSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ConfirmSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `confirmSmallMod.foo` */
  override def _to: SFC[ConfirmSmallProps] = default
}
