package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsAddMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Add", JSImport.Default)
  @js.native
  val default: FC[AddProps] = js.native
  
  trait AddProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AddProps {
    
    inline def apply(): AddProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddProps]
    }
    
    extension [Self <: AddProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AddProps]
  
  /* This means you don't have to write `default`, but can instead just say `distComponentsAddMod.foo` */
  override def _to: FC[AddProps] = default
}
