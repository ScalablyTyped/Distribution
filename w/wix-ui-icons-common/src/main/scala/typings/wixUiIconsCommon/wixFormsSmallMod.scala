package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixFormsSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/WixFormsSmall", JSImport.Default)
  @js.native
  val default: FC[WixFormsSmallProps] = js.native
  
  trait WixFormsSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object WixFormsSmallProps {
    
    inline def apply(): WixFormsSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixFormsSmallProps]
    }
    
    extension [Self <: WixFormsSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[WixFormsSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixFormsSmallMod.foo` */
  override def _to: FC[WixFormsSmallProps] = default
}
