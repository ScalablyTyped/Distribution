package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object facebookMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Facebook", JSImport.Default)
  @js.native
  val default: SFC[FacebookProps] = js.native
  
  @js.native
  trait FacebookProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FacebookProps {
    
    @scala.inline
    def apply(): FacebookProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FacebookProps]
    }
    
    @scala.inline
    implicit class FacebookPropsMutableBuilder[Self <: FacebookProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[FacebookProps]
  
  /* This means you don't have to write `default`, but can instead just say `facebookMod.foo` */
  override def _to: SFC[FacebookProps] = default
}
