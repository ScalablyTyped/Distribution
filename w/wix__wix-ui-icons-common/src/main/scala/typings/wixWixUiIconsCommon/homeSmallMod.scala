package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object homeSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/HomeSmall", JSImport.Default)
  @js.native
  val default: FC[HomeSmallProps] = js.native
  
  trait HomeSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HomeSmallProps {
    
    inline def apply(): HomeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HomeSmallProps]
    }
    
    extension [Self <: HomeSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HomeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `homeSmallMod.foo` */
  override def _to: FC[HomeSmallProps] = default
}
