package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object confirmMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Confirm", JSImport.Default)
  @js.native
  val default: FC[ConfirmProps] = js.native
  
  trait ConfirmProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ConfirmProps {
    
    inline def apply(): ConfirmProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmProps]
    }
    
    extension [Self <: ConfirmProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ConfirmProps]
  
  /* This means you don't have to write `default`, but can instead just say `confirmMod.foo` */
  override def _to: FC[ConfirmProps] = default
}
