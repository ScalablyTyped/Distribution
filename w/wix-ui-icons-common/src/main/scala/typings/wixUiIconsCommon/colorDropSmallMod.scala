package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorDropSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ColorDropSmall", JSImport.Default)
  @js.native
  val default: FC[ColorDropSmallProps] = js.native
  
  trait ColorDropSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ColorDropSmallProps {
    
    inline def apply(): ColorDropSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorDropSmallProps]
    }
    
    extension [Self <: ColorDropSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ColorDropSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `colorDropSmallMod.foo` */
  override def _to: FC[ColorDropSmallProps] = default
}
