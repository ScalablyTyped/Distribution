package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socialButtonPinterestMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/SocialButtonPinterest", JSImport.Default)
  @js.native
  val default: SFC[SocialButtonPinterestProps] = js.native
  
  @js.native
  trait SocialButtonPinterestProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SocialButtonPinterestProps {
    
    @scala.inline
    def apply(): SocialButtonPinterestProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocialButtonPinterestProps]
    }
    
    @scala.inline
    implicit class SocialButtonPinterestPropsMutableBuilder[Self <: SocialButtonPinterestProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[SocialButtonPinterestProps]
  
  /* This means you don't have to write `default`, but can instead just say `socialButtonPinterestMod.foo` */
  override def _to: SFC[SocialButtonPinterestProps] = default
}
