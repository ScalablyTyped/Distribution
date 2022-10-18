package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsCircleLargeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/CircleLargeSmall", JSImport.Default)
  @js.native
  val default: FC[CircleLargeSmallProps] = js.native
  
  trait CircleLargeSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CircleLargeSmallProps {
    
    inline def apply(): CircleLargeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircleLargeSmallProps]
    }
    
    extension [Self <: CircleLargeSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CircleLargeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsCircleLargeSmallMod.foo` */
  override def _to: FC[CircleLargeSmallProps] = default
}
