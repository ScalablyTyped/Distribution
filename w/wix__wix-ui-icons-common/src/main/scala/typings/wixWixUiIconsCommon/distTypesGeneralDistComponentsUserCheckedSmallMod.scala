package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsUserCheckedSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/UserCheckedSmall", JSImport.Default)
  @js.native
  val default: FC[UserCheckedSmallProps] = js.native
  
  trait UserCheckedSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UserCheckedSmallProps {
    
    inline def apply(): UserCheckedSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserCheckedSmallProps]
    }
    
    extension [Self <: UserCheckedSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UserCheckedSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsUserCheckedSmallMod.foo` */
  override def _to: FC[UserCheckedSmallProps] = default
}
