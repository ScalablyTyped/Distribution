package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userSearchMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/UserSearch", JSImport.Default)
  @js.native
  val default: FC[UserSearchProps] = js.native
  
  trait UserSearchProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UserSearchProps {
    
    inline def apply(): UserSearchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserSearchProps]
    }
    
    extension [Self <: UserSearchProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UserSearchProps]
  
  /* This means you don't have to write `default`, but can instead just say `userSearchMod.foo` */
  override def _to: FC[UserSearchProps] = default
}
