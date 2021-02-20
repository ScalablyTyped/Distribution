package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userLeaveSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/UserLeaveSmall", JSImport.Default)
  @js.native
  val default: SFC[UserLeaveSmallProps] = js.native
  
  @js.native
  trait UserLeaveSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object UserLeaveSmallProps {
    
    @scala.inline
    def apply(): UserLeaveSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserLeaveSmallProps]
    }
    
    @scala.inline
    implicit class UserLeaveSmallPropsMutableBuilder[Self <: UserLeaveSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[UserLeaveSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `userLeaveSmallMod.foo` */
  override def _to: SFC[UserLeaveSmallProps] = default
}
