package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsUserCheckedMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/UserChecked", JSImport.Default)
  @js.native
  val default: FC[UserCheckedProps] = js.native
  
  trait UserCheckedProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UserCheckedProps {
    
    inline def apply(): UserCheckedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserCheckedProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserCheckedProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UserCheckedProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsUserCheckedMod.foo` */
  override def _to: FC[UserCheckedProps] = default
}
