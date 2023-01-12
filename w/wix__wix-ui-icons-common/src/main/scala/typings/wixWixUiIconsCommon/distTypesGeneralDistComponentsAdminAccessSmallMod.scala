package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsAdminAccessSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/AdminAccessSmall", JSImport.Default)
  @js.native
  val default: FC[AdminAccessSmallProps] = js.native
  
  trait AdminAccessSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AdminAccessSmallProps {
    
    inline def apply(): AdminAccessSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdminAccessSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AdminAccessSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AdminAccessSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsAdminAccessSmallMod.foo` */
  override def _to: FC[AdminAccessSmallProps] = default
}
