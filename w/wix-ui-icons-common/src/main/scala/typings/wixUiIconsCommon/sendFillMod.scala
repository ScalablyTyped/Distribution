package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sendFillMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/SendFill", JSImport.Default)
  @js.native
  val default: FC[SendFillProps] = js.native
  
  trait SendFillProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SendFillProps {
    
    inline def apply(): SendFillProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SendFillProps]
    }
    
    extension [Self <: SendFillProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SendFillProps]
  
  /* This means you don't have to write `default`, but can instead just say `sendFillMod.foo` */
  override def _to: FC[SendFillProps] = default
}
