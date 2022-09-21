package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bookMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/Book", JSImport.Default)
  @js.native
  val default: FC[BookProps] = js.native
  
  trait BookProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object BookProps {
    
    inline def apply(): BookProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BookProps]
    }
    
    extension [Self <: BookProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[BookProps]
  
  /* This means you don't have to write `default`, but can instead just say `bookMod.foo` */
  override def _to: FC[BookProps] = default
}
