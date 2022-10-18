package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsArrowDownRightSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/ArrowDownRightSmall", JSImport.Default)
  @js.native
  val default: FC[ArrowDownRightSmallProps] = js.native
  
  trait ArrowDownRightSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ArrowDownRightSmallProps {
    
    inline def apply(): ArrowDownRightSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowDownRightSmallProps]
    }
    
    extension [Self <: ArrowDownRightSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ArrowDownRightSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsArrowDownRightSmallMod.foo` */
  override def _to: FC[ArrowDownRightSmallProps] = default
}
