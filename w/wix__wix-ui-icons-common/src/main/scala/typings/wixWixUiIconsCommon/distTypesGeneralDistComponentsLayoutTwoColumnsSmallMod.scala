package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsLayoutTwoColumnsSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/LayoutTwoColumnsSmall", JSImport.Default)
  @js.native
  val default: FC[LayoutTwoColumnsSmallProps] = js.native
  
  trait LayoutTwoColumnsSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LayoutTwoColumnsSmallProps {
    
    inline def apply(): LayoutTwoColumnsSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutTwoColumnsSmallProps]
    }
    
    extension [Self <: LayoutTwoColumnsSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LayoutTwoColumnsSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsLayoutTwoColumnsSmallMod.foo` */
  override def _to: FC[LayoutTwoColumnsSmallProps] = default
}
