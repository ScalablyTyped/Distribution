package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cahtFilledSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/CahtFilledSmall", JSImport.Default)
  @js.native
  val default: FC[CahtFilledSmallProps] = js.native
  
  trait CahtFilledSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CahtFilledSmallProps {
    
    inline def apply(): CahtFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CahtFilledSmallProps]
    }
    
    extension [Self <: CahtFilledSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CahtFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `cahtFilledSmallMod.foo` */
  override def _to: FC[CahtFilledSmallProps] = default
}
