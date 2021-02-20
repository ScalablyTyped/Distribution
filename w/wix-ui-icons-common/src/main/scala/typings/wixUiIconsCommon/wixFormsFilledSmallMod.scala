package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixFormsFilledSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/WixFormsFilledSmall", JSImport.Default)
  @js.native
  val default: SFC[WixFormsFilledSmallProps] = js.native
  
  @js.native
  trait WixFormsFilledSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object WixFormsFilledSmallProps {
    
    @scala.inline
    def apply(): WixFormsFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixFormsFilledSmallProps]
    }
    
    @scala.inline
    implicit class WixFormsFilledSmallPropsMutableBuilder[Self <: WixFormsFilledSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[WixFormsFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixFormsFilledSmallMod.foo` */
  override def _to: SFC[WixFormsFilledSmallProps] = default
}
