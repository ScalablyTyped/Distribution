package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object youtubeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/YoutubeSmall", JSImport.Default)
  @js.native
  val default: SFC[YoutubeSmallProps] = js.native
  
  trait YoutubeSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object YoutubeSmallProps {
    
    inline def apply(): YoutubeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[YoutubeSmallProps]
    }
    
    extension [Self <: YoutubeSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[YoutubeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `youtubeSmallMod.foo` */
  override def _to: SFC[YoutubeSmallProps] = default
}
