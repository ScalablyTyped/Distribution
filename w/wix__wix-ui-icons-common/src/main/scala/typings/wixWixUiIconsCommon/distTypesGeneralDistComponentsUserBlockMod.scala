package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsUserBlockMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/UserBlock", JSImport.Default)
  @js.native
  val default: FC[UserBlockProps] = js.native
  
  trait UserBlockProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UserBlockProps {
    
    inline def apply(): UserBlockProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserBlockProps]
    }
    
    extension [Self <: UserBlockProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UserBlockProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsUserBlockMod.foo` */
  override def _to: FC[UserBlockProps] = default
}
