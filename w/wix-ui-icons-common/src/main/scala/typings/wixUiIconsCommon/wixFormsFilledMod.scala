package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixFormsFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/WixFormsFilled", JSImport.Default)
  @js.native
  val default: SFC[WixFormsFilledProps] = js.native
  
  trait WixFormsFilledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object WixFormsFilledProps {
    
    inline def apply(): WixFormsFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixFormsFilledProps]
    }
    
    extension [Self <: WixFormsFilledProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[WixFormsFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixFormsFilledMod.foo` */
  override def _to: SFC[WixFormsFilledProps] = default
}
