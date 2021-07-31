package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpCircleMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/HelpCircle", JSImport.Default)
  @js.native
  val default: SFC[HelpCircleProps] = js.native
  
  trait HelpCircleProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object HelpCircleProps {
    
    @scala.inline
    def apply(): HelpCircleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelpCircleProps]
    }
    
    @scala.inline
    implicit class HelpCirclePropsMutableBuilder[Self <: HelpCircleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[HelpCircleProps]
  
  /* This means you don't have to write `default`, but can instead just say `helpCircleMod.foo` */
  override def _to: SFC[HelpCircleProps] = default
}
