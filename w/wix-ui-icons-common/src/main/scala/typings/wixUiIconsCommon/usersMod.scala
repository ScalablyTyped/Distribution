package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usersMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Users", JSImport.Default)
  @js.native
  val default: SFC[UsersProps] = js.native
  
  trait UsersProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object UsersProps {
    
    inline def apply(): UsersProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsersProps]
    }
    
    extension [Self <: UsersProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[UsersProps]
  
  /* This means you don't have to write `default`, but can instead just say `usersMod.foo` */
  override def _to: SFC[UsersProps] = default
}
