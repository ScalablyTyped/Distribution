package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slideShowBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/SlideShowBold", JSImport.Default)
  @js.native
  val default: FC[SlideShowBoldProps] = js.native
  
  trait SlideShowBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SlideShowBoldProps {
    
    inline def apply(): SlideShowBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlideShowBoldProps]
    }
    
    extension [Self <: SlideShowBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SlideShowBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `slideShowBoldMod.foo` */
  override def _to: FC[SlideShowBoldProps] = default
}
