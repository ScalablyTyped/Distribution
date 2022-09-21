package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsHoverBoxBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/HoverBoxBold", JSImport.Default)
  @js.native
  val default: FC[HoverBoxBoldProps] = js.native
  
  trait HoverBoxBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HoverBoxBoldProps {
    
    inline def apply(): HoverBoxBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HoverBoxBoldProps]
    }
    
    extension [Self <: HoverBoxBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HoverBoxBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsHoverBoxBoldMod.foo` */
  override def _to: FC[HoverBoxBoldProps] = default
}
