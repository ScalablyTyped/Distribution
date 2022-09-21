package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemDistComponentsMinusMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/system/dist/components/Minus", JSImport.Default)
  @js.native
  val default: FC[MinusProps] = js.native
  
  trait MinusProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MinusProps {
    
    inline def apply(): MinusProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MinusProps]
    }
    
    extension [Self <: MinusProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MinusProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemDistComponentsMinusMod.foo` */
  override def _to: FC[MinusProps] = default
}
