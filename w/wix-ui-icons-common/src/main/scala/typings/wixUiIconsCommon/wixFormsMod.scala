package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixFormsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/WixForms", JSImport.Default)
  @js.native
  val default: SFC[WixFormsProps] = js.native
  
  @js.native
  trait WixFormsProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object WixFormsProps {
    
    @scala.inline
    def apply(): WixFormsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixFormsProps]
    }
    
    @scala.inline
    implicit class WixFormsPropsMutableBuilder[Self <: WixFormsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[WixFormsProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixFormsMod.foo` */
  override def _to: SFC[WixFormsProps] = default
}
