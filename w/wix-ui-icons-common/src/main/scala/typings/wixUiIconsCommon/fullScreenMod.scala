package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fullScreenMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FullScreen", JSImport.Default)
  @js.native
  val default: FC[FullScreenProps] = js.native
  
  trait FullScreenProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FullScreenProps {
    
    inline def apply(): FullScreenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FullScreenProps]
    }
    
    extension [Self <: FullScreenProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FullScreenProps]
  
  /* This means you don't have to write `default`, but can instead just say `fullScreenMod.foo` */
  override def _to: FC[FullScreenProps] = default
}
