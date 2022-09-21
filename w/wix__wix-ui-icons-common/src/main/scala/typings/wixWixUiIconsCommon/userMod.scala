package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/User", JSImport.Default)
  @js.native
  val default: FC[UserProps] = js.native
  
  trait UserProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UserProps {
    
    inline def apply(): UserProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserProps]
    }
    
    extension [Self <: UserProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UserProps]
  
  /* This means you don't have to write `default`, but can instead just say `userMod.foo` */
  override def _to: FC[UserProps] = default
}
