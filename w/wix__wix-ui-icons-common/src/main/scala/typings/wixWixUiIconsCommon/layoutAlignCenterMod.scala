package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutAlignCenterMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/LayoutAlignCenter", JSImport.Default)
  @js.native
  val default: FC[LayoutAlignCenterProps] = js.native
  
  trait LayoutAlignCenterProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LayoutAlignCenterProps {
    
    inline def apply(): LayoutAlignCenterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutAlignCenterProps]
    }
    
    extension [Self <: LayoutAlignCenterProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LayoutAlignCenterProps]
  
  /* This means you don't have to write `default`, but can instead just say `layoutAlignCenterMod.foo` */
  override def _to: FC[LayoutAlignCenterProps] = default
}
