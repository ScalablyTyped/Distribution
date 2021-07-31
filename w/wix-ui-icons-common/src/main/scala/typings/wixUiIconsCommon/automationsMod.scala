package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object automationsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Automations", JSImport.Default)
  @js.native
  val default: SFC[AutomationsProps] = js.native
  
  trait AutomationsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object AutomationsProps {
    
    @scala.inline
    def apply(): AutomationsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutomationsProps]
    }
    
    @scala.inline
    implicit class AutomationsPropsMutableBuilder[Self <: AutomationsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[AutomationsProps]
  
  /* This means you don't have to write `default`, but can instead just say `automationsMod.foo` */
  override def _to: SFC[AutomationsProps] = default
}
