package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsQuickAccessMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/QuickAccess", JSImport.Default)
  @js.native
  val default: FC[QuickAccessProps] = js.native
  
  trait QuickAccessProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object QuickAccessProps {
    
    inline def apply(): QuickAccessProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuickAccessProps]
    }
    
    extension [Self <: QuickAccessProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[QuickAccessProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsQuickAccessMod.foo` */
  override def _to: FC[QuickAccessProps] = default
}
