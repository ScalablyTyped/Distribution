package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsSocialBarMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/SocialBar", JSImport.Default)
  @js.native
  val default: FC[SocialBarProps] = js.native
  
  trait SocialBarProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SocialBarProps {
    
    inline def apply(): SocialBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocialBarProps]
    }
    
    extension [Self <: SocialBarProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SocialBarProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsSocialBarMod.foo` */
  override def _to: FC[SocialBarProps] = default
}
