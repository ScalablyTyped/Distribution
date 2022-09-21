package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hotelsMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/Hotels", JSImport.Default)
  @js.native
  val default: FC[HotelsProps] = js.native
  
  trait HotelsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HotelsProps {
    
    inline def apply(): HotelsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HotelsProps]
    }
    
    extension [Self <: HotelsProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HotelsProps]
  
  /* This means you don't have to write `default`, but can instead just say `hotelsMod.foo` */
  override def _to: FC[HotelsProps] = default
}
