package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabletSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TabletSmall", JSImport.Default)
  @js.native
  val default: FC[TabletSmallProps] = js.native
  
  trait TabletSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TabletSmallProps {
    
    inline def apply(): TabletSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabletSmallProps]
    }
    
    extension [Self <: TabletSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TabletSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `tabletSmallMod.foo` */
  override def _to: FC[TabletSmallProps] = default
}
