package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsSeatRowSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/SeatRowSmall", JSImport.Default)
  @js.native
  val default: FC[SeatRowSmallProps] = js.native
  
  trait SeatRowSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SeatRowSmallProps {
    
    inline def apply(): SeatRowSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeatRowSmallProps]
    }
    
    extension [Self <: SeatRowSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SeatRowSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsSeatRowSmallMod.foo` */
  override def _to: FC[SeatRowSmallProps] = default
}
