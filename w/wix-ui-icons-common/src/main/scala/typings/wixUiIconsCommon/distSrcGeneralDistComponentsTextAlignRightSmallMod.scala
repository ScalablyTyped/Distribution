package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsTextAlignRightSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TextAlignRightSmall", JSImport.Default)
  @js.native
  val default: FC[TextAlignRightSmallProps] = js.native
  
  trait TextAlignRightSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TextAlignRightSmallProps {
    
    inline def apply(): TextAlignRightSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAlignRightSmallProps]
    }
    
    extension [Self <: TextAlignRightSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TextAlignRightSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsTextAlignRightSmallMod.foo` */
  override def _to: FC[TextAlignRightSmallProps] = default
}
