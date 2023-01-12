package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsSeatRowSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SeatRowSmall", JSImport.Default)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeatRowSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SeatRowSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsSeatRowSmallMod.foo` */
  override def _to: FC[SeatRowSmallProps] = default
}
