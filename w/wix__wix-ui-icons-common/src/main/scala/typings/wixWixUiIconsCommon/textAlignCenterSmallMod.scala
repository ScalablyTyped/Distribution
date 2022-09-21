package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAlignCenterSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/TextAlignCenterSmall", JSImport.Default)
  @js.native
  val default: FC[TextAlignCenterSmallProps] = js.native
  
  trait TextAlignCenterSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TextAlignCenterSmallProps {
    
    inline def apply(): TextAlignCenterSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAlignCenterSmallProps]
    }
    
    extension [Self <: TextAlignCenterSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TextAlignCenterSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAlignCenterSmallMod.foo` */
  override def _to: FC[TextAlignCenterSmallProps] = default
}
