package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object automationsSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AutomationsSmall", JSImport.Default)
  @js.native
  val default: SFC[AutomationsSmallProps] = js.native
  
  trait AutomationsSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object AutomationsSmallProps {
    
    @scala.inline
    def apply(): AutomationsSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutomationsSmallProps]
    }
    
    @scala.inline
    implicit class AutomationsSmallPropsMutableBuilder[Self <: AutomationsSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[AutomationsSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `automationsSmallMod.foo` */
  override def _to: SFC[AutomationsSmallProps] = default
}
