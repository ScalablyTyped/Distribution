package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemDistComponentsSocialButtonFacebookMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/SocialButtonFacebook", JSImport.Default)
  @js.native
  val default: FC[SocialButtonFacebookProps] = js.native
  
  trait SocialButtonFacebookProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SocialButtonFacebookProps {
    
    inline def apply(): SocialButtonFacebookProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocialButtonFacebookProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SocialButtonFacebookProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SocialButtonFacebookProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemDistComponentsSocialButtonFacebookMod.foo` */
  override def _to: FC[SocialButtonFacebookProps] = default
}
