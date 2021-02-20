package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/GoogleSmall", JSImport.Default)
  @js.native
  val default: SFC[GoogleSmallProps] = js.native
  
  @js.native
  trait GoogleSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object GoogleSmallProps {
    
    @scala.inline
    def apply(): GoogleSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GoogleSmallProps]
    }
    
    @scala.inline
    implicit class GoogleSmallPropsMutableBuilder[Self <: GoogleSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[GoogleSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `googleSmallMod.foo` */
  override def _to: SFC[GoogleSmallProps] = default
}
