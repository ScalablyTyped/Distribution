package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/Popup", JSImport.Default)
  @js.native
  val default: FC[PopupProps] = js.native
  
  trait PopupProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PopupProps {
    
    inline def apply(): PopupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopupProps]
    }
    
    extension [Self <: PopupProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PopupProps]
  
  /* This means you don't have to write `default`, but can instead just say `popupMod.foo` */
  override def _to: FC[PopupProps] = default
}
