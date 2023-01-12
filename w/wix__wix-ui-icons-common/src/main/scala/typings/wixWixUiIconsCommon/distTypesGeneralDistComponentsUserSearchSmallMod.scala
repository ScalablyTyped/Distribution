package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsUserSearchSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/UserSearchSmall", JSImport.Default)
  @js.native
  val default: FC[UserSearchSmallProps] = js.native
  
  trait UserSearchSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UserSearchSmallProps {
    
    inline def apply(): UserSearchSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserSearchSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserSearchSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UserSearchSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsUserSearchSmallMod.foo` */
  override def _to: FC[UserSearchSmallProps] = default
}
