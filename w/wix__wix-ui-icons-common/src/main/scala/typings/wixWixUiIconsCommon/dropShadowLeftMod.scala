package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropShadowLeftMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/DropShadowLeft", JSImport.Default)
  @js.native
  val default: FC[DropShadowLeftProps] = js.native
  
  trait DropShadowLeftProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DropShadowLeftProps {
    
    inline def apply(): DropShadowLeftProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropShadowLeftProps]
    }
    
    extension [Self <: DropShadowLeftProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DropShadowLeftProps]
  
  /* This means you don't have to write `default`, but can instead just say `dropShadowLeftMod.foo` */
  override def _to: FC[DropShadowLeftProps] = default
}
