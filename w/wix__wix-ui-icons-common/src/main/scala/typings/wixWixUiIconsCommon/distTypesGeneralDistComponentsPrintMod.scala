package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsPrintMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Print", JSImport.Default)
  @js.native
  val default: FC[PrintProps] = js.native
  
  trait PrintProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PrintProps {
    
    inline def apply(): PrintProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrintProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrintProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PrintProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsPrintMod.foo` */
  override def _to: FC[PrintProps] = default
}
