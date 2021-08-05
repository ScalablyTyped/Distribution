package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortByArrowDownMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/SortByArrowDown", JSImport.Default)
  @js.native
  val default: SFC[SortByArrowDownProps] = js.native
  
  trait SortByArrowDownProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object SortByArrowDownProps {
    
    inline def apply(): SortByArrowDownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortByArrowDownProps]
    }
    
    extension [Self <: SortByArrowDownProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[SortByArrowDownProps]
  
  /* This means you don't have to write `default`, but can instead just say `sortByArrowDownMod.foo` */
  override def _to: SFC[SortByArrowDownProps] = default
}
