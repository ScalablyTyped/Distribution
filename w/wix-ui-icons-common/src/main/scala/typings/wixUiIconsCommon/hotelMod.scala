package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hotelMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Hotel", JSImport.Default)
  @js.native
  val default: SFC[HotelProps] = js.native
  
  trait HotelProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object HotelProps {
    
    @scala.inline
    def apply(): HotelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HotelProps]
    }
    
    @scala.inline
    implicit class HotelPropsMutableBuilder[Self <: HotelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[HotelProps]
  
  /* This means you don't have to write `default`, but can instead just say `hotelMod.foo` */
  override def _to: SFC[HotelProps] = default
}
