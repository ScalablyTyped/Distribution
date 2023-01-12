package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsUserAddMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/UserAdd", JSImport.Default)
  @js.native
  val default: FC[UserAddProps] = js.native
  
  trait UserAddProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UserAddProps {
    
    inline def apply(): UserAddProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserAddProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserAddProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UserAddProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsUserAddMod.foo` */
  override def _to: FC[UserAddProps] = default
}
