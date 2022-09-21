package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMenuMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/ListMenu", JSImport.Default)
  @js.native
  val default: FC[ListMenuProps] = js.native
  
  trait ListMenuProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ListMenuProps {
    
    inline def apply(): ListMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListMenuProps]
    }
    
    extension [Self <: ListMenuProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ListMenuProps]
  
  /* This means you don't have to write `default`, but can instead just say `listMenuMod.foo` */
  override def _to: FC[ListMenuProps] = default
}
