package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accessibilityMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Accessibility", JSImport.Default)
  @js.native
  val default: SFC[AccessibilityProps] = js.native
  
  trait AccessibilityProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object AccessibilityProps {
    
    @scala.inline
    def apply(): AccessibilityProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccessibilityProps]
    }
    
    @scala.inline
    implicit class AccessibilityPropsMutableBuilder[Self <: AccessibilityProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[AccessibilityProps]
  
  /* This means you don't have to write `default`, but can instead just say `accessibilityMod.foo` */
  override def _to: SFC[AccessibilityProps] = default
}
