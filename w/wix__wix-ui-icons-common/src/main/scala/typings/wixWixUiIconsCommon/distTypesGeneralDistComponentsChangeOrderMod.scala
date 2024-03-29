package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsChangeOrderMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/ChangeOrder", JSImport.Default)
  @js.native
  val default: FC[ChangeOrderProps] = js.native
  
  trait ChangeOrderProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ChangeOrderProps {
    
    inline def apply(): ChangeOrderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeOrderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChangeOrderProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ChangeOrderProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsChangeOrderMod.foo` */
  override def _to: FC[ChangeOrderProps] = default
}
