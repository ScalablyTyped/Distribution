package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsQRMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/QR", JSImport.Default)
  @js.native
  val default: FC[QRProps] = js.native
  
  trait QRProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object QRProps {
    
    inline def apply(): QRProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QRProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QRProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[QRProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsQRMod.foo` */
  override def _to: FC[QRProps] = default
}
