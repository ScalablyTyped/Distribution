package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rectangleLargeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/RectangleLargeSmall", JSImport.Default)
  @js.native
  val default: SFC[RectangleLargeSmallProps] = js.native
  
  trait RectangleLargeSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object RectangleLargeSmallProps {
    
    inline def apply(): RectangleLargeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RectangleLargeSmallProps]
    }
    
    extension [Self <: RectangleLargeSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[RectangleLargeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `rectangleLargeSmallMod.foo` */
  override def _to: SFC[RectangleLargeSmallProps] = default
}
