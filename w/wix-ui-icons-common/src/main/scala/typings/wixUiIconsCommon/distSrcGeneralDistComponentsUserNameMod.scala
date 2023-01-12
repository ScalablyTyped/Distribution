package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsUserNameMod extends Shortcut {
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserNameProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UserNameProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsUserNameMod.foo` */
  override def _to: FC[UserNameProps] = default
}
