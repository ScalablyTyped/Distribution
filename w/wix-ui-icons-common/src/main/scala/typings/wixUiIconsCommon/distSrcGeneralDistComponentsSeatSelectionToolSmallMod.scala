package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsSeatSelectionToolSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SeatSelectionToolSmall", JSImport.Default)
  @js.native
  val default: FC[SeatSelectionToolSmallProps] = js.native
  
  trait SeatSelectionToolSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SeatSelectionToolSmallProps {
    
    inline def apply(): SeatSelectionToolSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeatSelectionToolSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeatSelectionToolSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SeatSelectionToolSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsSeatSelectionToolSmallMod.foo` */
  override def _to: FC[SeatSelectionToolSmallProps] = default
}
