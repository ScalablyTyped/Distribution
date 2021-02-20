package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mobileMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Mobile", JSImport.Default)
  @js.native
  val default: SFC[MobileProps] = js.native
  
  @js.native
  trait MobileProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object MobileProps {
    
    @scala.inline
    def apply(): MobileProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MobileProps]
    }
    
    @scala.inline
    implicit class MobilePropsMutableBuilder[Self <: MobileProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[MobileProps]
  
  /* This means you don't have to write `default`, but can instead just say `mobileMod.foo` */
  override def _to: SFC[MobileProps] = default
}
