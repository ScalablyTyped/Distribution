package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsLayoutSplitSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/LayoutSplitSmall", JSImport.Default)
  @js.native
  val default: FC[LayoutSplitSmallProps] = js.native
  
  trait LayoutSplitSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LayoutSplitSmallProps {
    
    inline def apply(): LayoutSplitSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutSplitSmallProps]
    }
    
    extension [Self <: LayoutSplitSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LayoutSplitSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsLayoutSplitSmallMod.foo` */
  override def _to: FC[LayoutSplitSmallProps] = default
}
