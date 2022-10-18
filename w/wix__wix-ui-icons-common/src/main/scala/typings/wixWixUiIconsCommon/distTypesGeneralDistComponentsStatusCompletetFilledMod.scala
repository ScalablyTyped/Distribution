package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsStatusCompletetFilledMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/StatusCompletetFilled", JSImport.Default)
  @js.native
  val default: FC[StatusCompletetFilledProps] = js.native
  
  trait StatusCompletetFilledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object StatusCompletetFilledProps {
    
    inline def apply(): StatusCompletetFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusCompletetFilledProps]
    }
    
    extension [Self <: StatusCompletetFilledProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[StatusCompletetFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsStatusCompletetFilledMod.foo` */
  override def _to: FC[StatusCompletetFilledProps] = default
}
