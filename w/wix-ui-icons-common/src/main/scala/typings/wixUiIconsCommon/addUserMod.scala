package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addUserMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/AddUser", JSImport.Default)
  @js.native
  val default: FC[AddUserProps] = js.native
  
  trait AddUserProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AddUserProps {
    
    inline def apply(): AddUserProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddUserProps]
    }
    
    extension [Self <: AddUserProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AddUserProps]
  
  /* This means you don't have to write `default`, but can instead just say `addUserMod.foo` */
  override def _to: FC[AddUserProps] = default
}
