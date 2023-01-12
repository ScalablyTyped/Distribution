package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsTikTokSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/TikTokSmall", JSImport.Default)
  @js.native
  val default: FC[TikTokSmallProps] = js.native
  
  trait TikTokSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TikTokSmallProps {
    
    inline def apply(): TikTokSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TikTokSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TikTokSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TikTokSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsTikTokSmallMod.foo` */
  override def _to: FC[TikTokSmallProps] = default
}
