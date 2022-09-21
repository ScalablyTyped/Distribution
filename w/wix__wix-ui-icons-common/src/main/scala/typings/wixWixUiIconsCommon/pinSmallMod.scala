package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/PinSmall", JSImport.Default)
  @js.native
  val default: FC[PinSmallProps] = js.native
  
  trait PinSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PinSmallProps {
    
    inline def apply(): PinSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PinSmallProps]
    }
    
    extension [Self <: PinSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PinSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `pinSmallMod.foo` */
  override def _to: FC[PinSmallProps] = default
}
