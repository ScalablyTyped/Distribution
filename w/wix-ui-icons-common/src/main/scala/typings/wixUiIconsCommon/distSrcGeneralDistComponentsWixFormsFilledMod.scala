package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsWixFormsFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/WixFormsFilled", JSImport.Default)
  @js.native
  val default: FC[WixFormsFilledProps] = js.native
  
  trait WixFormsFilledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object WixFormsFilledProps {
    
    inline def apply(): WixFormsFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixFormsFilledProps]
    }
    
    extension [Self <: WixFormsFilledProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[WixFormsFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsWixFormsFilledMod.foo` */
  override def _to: FC[WixFormsFilledProps] = default
}
