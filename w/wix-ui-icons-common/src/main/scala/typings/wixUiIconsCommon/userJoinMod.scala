package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userJoinMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/UserJoin", JSImport.Default)
  @js.native
  val default: SFC[UserJoinProps] = js.native
  
  @js.native
  trait UserJoinProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object UserJoinProps {
    
    @scala.inline
    def apply(): UserJoinProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserJoinProps]
    }
    
    @scala.inline
    implicit class UserJoinPropsMutableBuilder[Self <: UserJoinProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[UserJoinProps]
  
  /* This means you don't have to write `default`, but can instead just say `userJoinMod.foo` */
  override def _to: SFC[UserJoinProps] = default
}
