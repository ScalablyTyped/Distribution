package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsRectangleLargeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/RectangleLargeSmall", JSImport.Default)
  @js.native
  val default: FC[RectangleLargeSmallProps] = js.native
  
  trait RectangleLargeSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object RectangleLargeSmallProps {
    
    inline def apply(): RectangleLargeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RectangleLargeSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RectangleLargeSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[RectangleLargeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsRectangleLargeSmallMod.foo` */
  override def _to: FC[RectangleLargeSmallProps] = default
}
