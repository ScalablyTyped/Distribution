package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsAlignCenterVerticallyMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AlignCenterVertically", JSImport.Default)
  @js.native
  val default: FC[AlignCenterVerticallyProps] = js.native
  
  trait AlignCenterVerticallyProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AlignCenterVerticallyProps {
    
    inline def apply(): AlignCenterVerticallyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignCenterVerticallyProps]
    }
    
    extension [Self <: AlignCenterVerticallyProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AlignCenterVerticallyProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsAlignCenterVerticallyMod.foo` */
  override def _to: FC[AlignCenterVerticallyProps] = default
}
