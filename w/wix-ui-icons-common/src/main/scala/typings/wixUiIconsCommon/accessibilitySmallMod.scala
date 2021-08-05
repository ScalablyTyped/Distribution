package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accessibilitySmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AccessibilitySmall", JSImport.Default)
  @js.native
  val default: SFC[AccessibilitySmallProps] = js.native
  
  trait AccessibilitySmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object AccessibilitySmallProps {
    
    inline def apply(): AccessibilitySmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccessibilitySmallProps]
    }
    
    extension [Self <: AccessibilitySmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[AccessibilitySmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `accessibilitySmallMod.foo` */
  override def _to: SFC[AccessibilitySmallProps] = default
}
