package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userAddMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/UserAdd", JSImport.Default)
  @js.native
  val default: SFC[UserAddProps] = js.native
  
  @js.native
  trait UserAddProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object UserAddProps {
    
    @scala.inline
    def apply(): UserAddProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserAddProps]
    }
    
    @scala.inline
    implicit class UserAddPropsMutableBuilder[Self <: UserAddProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[UserAddProps]
  
  /* This means you don't have to write `default`, but can instead just say `userAddMod.foo` */
  override def _to: SFC[UserAddProps] = default
}
