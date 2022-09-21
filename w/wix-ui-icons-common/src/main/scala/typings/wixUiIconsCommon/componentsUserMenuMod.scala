package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsUserMenuMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/UserMenu", JSImport.Default)
  @js.native
  val default: FC[UserMenuProps] = js.native
  
  trait UserMenuProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UserMenuProps {
    
    inline def apply(): UserMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserMenuProps]
    }
    
    extension [Self <: UserMenuProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UserMenuProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsUserMenuMod.foo` */
  override def _to: FC[UserMenuProps] = default
}
