package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adminAccessSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AdminAccessSmall", JSImport.Default)
  @js.native
  val default: SFC[AdminAccessSmallProps] = js.native
  
  @js.native
  trait AdminAccessSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AdminAccessSmallProps {
    
    @scala.inline
    def apply(): AdminAccessSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdminAccessSmallProps]
    }
    
    @scala.inline
    implicit class AdminAccessSmallPropsMutableBuilder[Self <: AdminAccessSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[AdminAccessSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `adminAccessSmallMod.foo` */
  override def _to: SFC[AdminAccessSmallProps] = default
}
