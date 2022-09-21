package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socialButtonTwitterMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/SocialButtonTwitter", JSImport.Default)
  @js.native
  val default: FC[SocialButtonTwitterProps] = js.native
  
  trait SocialButtonTwitterProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SocialButtonTwitterProps {
    
    inline def apply(): SocialButtonTwitterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocialButtonTwitterProps]
    }
    
    extension [Self <: SocialButtonTwitterProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SocialButtonTwitterProps]
  
  /* This means you don't have to write `default`, but can instead just say `socialButtonTwitterMod.foo` */
  override def _to: FC[SocialButtonTwitterProps] = default
}
