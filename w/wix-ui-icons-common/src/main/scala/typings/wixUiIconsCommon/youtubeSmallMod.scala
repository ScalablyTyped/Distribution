package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object youtubeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/YoutubeSmall", JSImport.Default)
  @js.native
  val default: FC[YoutubeSmallProps] = js.native
  
  trait YoutubeSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object YoutubeSmallProps {
    
    inline def apply(): YoutubeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[YoutubeSmallProps]
    }
    
    extension [Self <: YoutubeSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[YoutubeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `youtubeSmallMod.foo` */
  override def _to: FC[YoutubeSmallProps] = default
}
