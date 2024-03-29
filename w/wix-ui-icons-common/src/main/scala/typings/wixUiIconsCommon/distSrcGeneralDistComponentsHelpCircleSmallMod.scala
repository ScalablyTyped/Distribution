package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsHelpCircleSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/HelpCircleSmall", JSImport.Default)
  @js.native
  val default: FC[HelpCircleSmallProps] = js.native
  
  trait HelpCircleSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HelpCircleSmallProps {
    
    inline def apply(): HelpCircleSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelpCircleSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HelpCircleSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HelpCircleSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsHelpCircleSmallMod.foo` */
  override def _to: FC[HelpCircleSmallProps] = default
}
