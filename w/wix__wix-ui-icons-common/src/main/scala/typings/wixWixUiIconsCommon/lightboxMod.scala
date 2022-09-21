package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lightboxMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/Lightbox", JSImport.Default)
  @js.native
  val default: FC[LightboxProps] = js.native
  
  trait LightboxProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LightboxProps {
    
    inline def apply(): LightboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LightboxProps]
    }
    
    extension [Self <: LightboxProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LightboxProps]
  
  /* This means you don't have to write `default`, but can instead just say `lightboxMod.foo` */
  override def _to: FC[LightboxProps] = default
}
