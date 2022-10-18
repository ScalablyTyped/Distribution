package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsArrowUpSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/ArrowUpSmall", JSImport.Default)
  @js.native
  val default: FC[ArrowUpSmallProps] = js.native
  
  trait ArrowUpSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ArrowUpSmallProps {
    
    inline def apply(): ArrowUpSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowUpSmallProps]
    }
    
    extension [Self <: ArrowUpSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ArrowUpSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsArrowUpSmallMod.foo` */
  override def _to: FC[ArrowUpSmallProps] = default
}
