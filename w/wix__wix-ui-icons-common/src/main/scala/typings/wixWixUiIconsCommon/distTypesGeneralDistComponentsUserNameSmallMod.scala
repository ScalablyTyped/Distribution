package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsUserNameSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/UserNameSmall", JSImport.Default)
  @js.native
  val default: FC[UserNameSmallProps] = js.native
  
  trait UserNameSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UserNameSmallProps {
    
    inline def apply(): UserNameSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserNameSmallProps]
    }
    
    extension [Self <: UserNameSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UserNameSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsUserNameSmallMod.foo` */
  override def _to: FC[UserNameSmallProps] = default
}
