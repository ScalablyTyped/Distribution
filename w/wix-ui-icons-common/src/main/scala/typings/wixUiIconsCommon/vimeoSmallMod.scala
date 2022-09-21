package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vimeoSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/VimeoSmall", JSImport.Default)
  @js.native
  val default: FC[VimeoSmallProps] = js.native
  
  trait VimeoSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object VimeoSmallProps {
    
    inline def apply(): VimeoSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VimeoSmallProps]
    }
    
    extension [Self <: VimeoSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[VimeoSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `vimeoSmallMod.foo` */
  override def _to: FC[VimeoSmallProps] = default
}
