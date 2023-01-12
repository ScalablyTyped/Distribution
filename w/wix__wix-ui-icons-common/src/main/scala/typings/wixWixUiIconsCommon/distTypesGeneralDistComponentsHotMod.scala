package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsHotMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Hot", JSImport.Default)
  @js.native
  val default: FC[HotProps] = js.native
  
  trait HotProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HotProps {
    
    inline def apply(): HotProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HotProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HotProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HotProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsHotMod.foo` */
  override def _to: FC[HotProps] = default
}
