package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsGoogleMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Google", JSImport.Default)
  @js.native
  val default: FC[GoogleProps] = js.native
  
  trait GoogleProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object GoogleProps {
    
    inline def apply(): GoogleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GoogleProps]
    }
    
    extension [Self <: GoogleProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[GoogleProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsGoogleMod.foo` */
  override def _to: FC[GoogleProps] = default
}
