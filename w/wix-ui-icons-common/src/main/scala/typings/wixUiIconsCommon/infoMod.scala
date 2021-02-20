package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infoMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Info", JSImport.Default)
  @js.native
  val default: SFC[InfoProps] = js.native
  
  @js.native
  trait InfoProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object InfoProps {
    
    @scala.inline
    def apply(): InfoProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InfoProps]
    }
    
    @scala.inline
    implicit class InfoPropsMutableBuilder[Self <: InfoProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[InfoProps]
  
  /* This means you don't have to write `default`, but can instead just say `infoMod.foo` */
  override def _to: SFC[InfoProps] = default
}
