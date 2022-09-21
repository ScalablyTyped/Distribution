package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userNameMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/UserName", JSImport.Default)
  @js.native
  val default: FC[UserNameProps] = js.native
  
  trait UserNameProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UserNameProps {
    
    inline def apply(): UserNameProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserNameProps]
    }
    
    extension [Self <: UserNameProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UserNameProps]
  
  /* This means you don't have to write `default`, but can instead just say `userNameMod.foo` */
  override def _to: FC[UserNameProps] = default
}
