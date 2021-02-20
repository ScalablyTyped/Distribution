package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AddSmall", JSImport.Default)
  @js.native
  val default: SFC[AddSmallProps] = js.native
  
  @js.native
  trait AddSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AddSmallProps {
    
    @scala.inline
    def apply(): AddSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddSmallProps]
    }
    
    @scala.inline
    implicit class AddSmallPropsMutableBuilder[Self <: AddSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[AddSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `addSmallMod.foo` */
  override def _to: SFC[AddSmallProps] = default
}
