package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extraHotMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/ExtraHot", JSImport.Default)
  @js.native
  val default: FC[ExtraHotProps] = js.native
  
  trait ExtraHotProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ExtraHotProps {
    
    inline def apply(): ExtraHotProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtraHotProps]
    }
    
    extension [Self <: ExtraHotProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ExtraHotProps]
  
  /* This means you don't have to write `default`, but can instead just say `extraHotMod.foo` */
  override def _to: FC[ExtraHotProps] = default
}
