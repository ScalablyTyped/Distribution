package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsUserFormBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/UserFormBold", JSImport.Default)
  @js.native
  val default: FC[UserFormBoldProps] = js.native
  
  trait UserFormBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UserFormBoldProps {
    
    inline def apply(): UserFormBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserFormBoldProps]
    }
    
    extension [Self <: UserFormBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UserFormBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsUserFormBoldMod.foo` */
  override def _to: FC[UserFormBoldProps] = default
}
