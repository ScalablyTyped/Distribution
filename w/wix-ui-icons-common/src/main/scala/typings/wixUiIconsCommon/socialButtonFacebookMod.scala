package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socialButtonFacebookMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/SocialButtonFacebook", JSImport.Default)
  @js.native
  val default: SFC[SocialButtonFacebookProps] = js.native
  
  trait SocialButtonFacebookProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object SocialButtonFacebookProps {
    
    @scala.inline
    def apply(): SocialButtonFacebookProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocialButtonFacebookProps]
    }
    
    @scala.inline
    implicit class SocialButtonFacebookPropsMutableBuilder[Self <: SocialButtonFacebookProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[SocialButtonFacebookProps]
  
  /* This means you don't have to write `default`, but can instead just say `socialButtonFacebookMod.foo` */
  override def _to: SFC[SocialButtonFacebookProps] = default
}
