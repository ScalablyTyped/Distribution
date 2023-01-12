package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsTableReservationSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TableReservationSmall", JSImport.Default)
  @js.native
  val default: FC[TableReservationSmallProps] = js.native
  
  trait TableReservationSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TableReservationSmallProps {
    
    inline def apply(): TableReservationSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableReservationSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableReservationSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TableReservationSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsTableReservationSmallMod.foo` */
  override def _to: FC[TableReservationSmallProps] = default
}
