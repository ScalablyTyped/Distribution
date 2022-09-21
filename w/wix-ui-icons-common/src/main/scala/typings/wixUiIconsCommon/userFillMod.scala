package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userFillMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/UserFill", JSImport.Default)
  @js.native
  val default: FC[UserFillProps] = js.native
  
  trait UserFillProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UserFillProps {
    
    inline def apply(): UserFillProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserFillProps]
    }
    
    extension [Self <: UserFillProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UserFillProps]
  
  /* This means you don't have to write `default`, but can instead just say `userFillMod.foo` */
  override def _to: FC[UserFillProps] = default
}
