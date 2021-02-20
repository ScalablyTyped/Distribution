package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkedInSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/LinkedInSmall", JSImport.Default)
  @js.native
  val default: SFC[LinkedInSmallProps] = js.native
  
  @js.native
  trait LinkedInSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object LinkedInSmallProps {
    
    @scala.inline
    def apply(): LinkedInSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkedInSmallProps]
    }
    
    @scala.inline
    implicit class LinkedInSmallPropsMutableBuilder[Self <: LinkedInSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[LinkedInSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `linkedInSmallMod.foo` */
  override def _to: SFC[LinkedInSmallProps] = default
}
