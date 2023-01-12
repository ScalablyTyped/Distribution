package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsAccessibilitySmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AccessibilitySmall", JSImport.Default)
  @js.native
  val default: FC[AccessibilitySmallProps] = js.native
  
  trait AccessibilitySmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AccessibilitySmallProps {
    
    inline def apply(): AccessibilitySmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccessibilitySmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccessibilitySmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AccessibilitySmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsAccessibilitySmallMod.foo` */
  override def _to: FC[AccessibilitySmallProps] = default
}
