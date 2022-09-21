package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exitFullScreenMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/ExitFullScreen", JSImport.Default)
  @js.native
  val default: FC[ExitFullScreenProps] = js.native
  
  trait ExitFullScreenProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ExitFullScreenProps {
    
    inline def apply(): ExitFullScreenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExitFullScreenProps]
    }
    
    extension [Self <: ExitFullScreenProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ExitFullScreenProps]
  
  /* This means you don't have to write `default`, but can instead just say `exitFullScreenMod.foo` */
  override def _to: FC[ExitFullScreenProps] = default
}
