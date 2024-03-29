package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsTikTokMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TikTok", JSImport.Default)
  @js.native
  val default: FC[TikTokProps] = js.native
  
  trait TikTokProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TikTokProps {
    
    inline def apply(): TikTokProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TikTokProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TikTokProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TikTokProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsTikTokMod.foo` */
  override def _to: FC[TikTokProps] = default
}
