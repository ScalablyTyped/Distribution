package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shapeBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/ShapeBold", JSImport.Default)
  @js.native
  val default: FC[ShapeBoldProps] = js.native
  
  trait ShapeBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ShapeBoldProps {
    
    inline def apply(): ShapeBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShapeBoldProps]
    }
    
    extension [Self <: ShapeBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ShapeBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `shapeBoldMod.foo` */
  override def _to: FC[ShapeBoldProps] = default
}
