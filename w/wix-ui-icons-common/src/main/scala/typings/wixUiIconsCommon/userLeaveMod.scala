package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userLeaveMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/UserLeave", JSImport.Default)
  @js.native
  val default: FC[UserLeaveProps] = js.native
  
  trait UserLeaveProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UserLeaveProps {
    
    inline def apply(): UserLeaveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserLeaveProps]
    }
    
    extension [Self <: UserLeaveProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UserLeaveProps]
  
  /* This means you don't have to write `default`, but can instead just say `userLeaveMod.foo` */
  override def _to: FC[UserLeaveProps] = default
}
