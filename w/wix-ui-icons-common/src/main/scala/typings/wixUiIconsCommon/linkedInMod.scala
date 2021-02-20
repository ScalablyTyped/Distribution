package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkedInMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/LinkedIn", JSImport.Default)
  @js.native
  val default: SFC[LinkedInProps] = js.native
  
  @js.native
  trait LinkedInProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object LinkedInProps {
    
    @scala.inline
    def apply(): LinkedInProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkedInProps]
    }
    
    @scala.inline
    implicit class LinkedInPropsMutableBuilder[Self <: LinkedInProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[LinkedInProps]
  
  /* This means you don't have to write `default`, but can instead just say `linkedInMod.foo` */
  override def _to: SFC[LinkedInProps] = default
}
