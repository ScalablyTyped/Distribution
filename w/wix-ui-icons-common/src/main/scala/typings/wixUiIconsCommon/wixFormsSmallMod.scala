package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixFormsSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/WixFormsSmall", JSImport.Default)
  @js.native
  val default: SFC[WixFormsSmallProps] = js.native
  
  trait WixFormsSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object WixFormsSmallProps {
    
    @scala.inline
    def apply(): WixFormsSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixFormsSmallProps]
    }
    
    @scala.inline
    implicit class WixFormsSmallPropsMutableBuilder[Self <: WixFormsSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[WixFormsSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixFormsSmallMod.foo` */
  override def _to: SFC[WixFormsSmallProps] = default
}
