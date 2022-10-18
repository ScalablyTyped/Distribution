package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsChevronUpSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/ChevronUpSmall", JSImport.Default)
  @js.native
  val default: FC[ChevronUpSmallProps] = js.native
  
  trait ChevronUpSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ChevronUpSmallProps {
    
    inline def apply(): ChevronUpSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronUpSmallProps]
    }
    
    extension [Self <: ChevronUpSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ChevronUpSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsChevronUpSmallMod.foo` */
  override def _to: FC[ChevronUpSmallProps] = default
}
