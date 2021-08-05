package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object youtubeFilledSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/YoutubeFilledSmall", JSImport.Default)
  @js.native
  val default: SFC[YoutubeFilledSmallProps] = js.native
  
  trait YoutubeFilledSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object YoutubeFilledSmallProps {
    
    inline def apply(): YoutubeFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[YoutubeFilledSmallProps]
    }
    
    extension [Self <: YoutubeFilledSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[YoutubeFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `youtubeFilledSmallMod.foo` */
  override def _to: SFC[YoutubeFilledSmallProps] = default
}
