package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userLeaveMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/UserLeave", JSImport.Default)
  @js.native
  val default: SFC[UserLeaveProps] = js.native
  
  @js.native
  trait UserLeaveProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object UserLeaveProps {
    
    @scala.inline
    def apply(): UserLeaveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserLeaveProps]
    }
    
    @scala.inline
    implicit class UserLeavePropsMutableBuilder[Self <: UserLeaveProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[UserLeaveProps]
  
  /* This means you don't have to write `default`, but can instead just say `userLeaveMod.foo` */
  override def _to: SFC[UserLeaveProps] = default
}
