package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object easeInSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/EaseInSmall", JSImport.Default)
  @js.native
  val default: FC[EaseInSmallProps] = js.native
  
  trait EaseInSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object EaseInSmallProps {
    
    inline def apply(): EaseInSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EaseInSmallProps]
    }
    
    extension [Self <: EaseInSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[EaseInSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `easeInSmallMod.foo` */
  override def _to: FC[EaseInSmallProps] = default
}
