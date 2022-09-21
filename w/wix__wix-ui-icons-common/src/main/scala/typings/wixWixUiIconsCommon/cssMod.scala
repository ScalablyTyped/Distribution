package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/CSS", JSImport.Default)
  @js.native
  val default: FC[CSSProps] = js.native
  
  trait CSSProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CSSProps {
    
    inline def apply(): CSSProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSSProps]
    }
    
    extension [Self <: CSSProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CSSProps]
  
  /* This means you don't have to write `default`, but can instead just say `cssMod.foo` */
  override def _to: FC[CSSProps] = default
}
