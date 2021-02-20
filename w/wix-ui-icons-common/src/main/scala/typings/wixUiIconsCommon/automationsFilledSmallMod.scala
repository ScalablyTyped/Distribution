package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object automationsFilledSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AutomationsFilledSmall", JSImport.Default)
  @js.native
  val default: SFC[AutomationsFilledSmallProps] = js.native
  
  @js.native
  trait AutomationsFilledSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AutomationsFilledSmallProps {
    
    @scala.inline
    def apply(): AutomationsFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutomationsFilledSmallProps]
    }
    
    @scala.inline
    implicit class AutomationsFilledSmallPropsMutableBuilder[Self <: AutomationsFilledSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[AutomationsFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `automationsFilledSmallMod.foo` */
  override def _to: SFC[AutomationsFilledSmallProps] = default
}
