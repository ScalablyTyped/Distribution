package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/Scroll", JSImport.Default)
  @js.native
  val default: FC[ScrollProps] = js.native
  
  trait ScrollProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ScrollProps {
    
    inline def apply(): ScrollProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollProps]
    }
    
    extension [Self <: ScrollProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ScrollProps]
  
  /* This means you don't have to write `default`, but can instead just say `scrollMod.foo` */
  override def _to: FC[ScrollProps] = default
}
