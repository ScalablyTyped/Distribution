package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortByArrowUpMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/SortByArrowUp", JSImport.Default)
  @js.native
  val default: SFC[SortByArrowUpProps] = js.native
  
  trait SortByArrowUpProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object SortByArrowUpProps {
    
    inline def apply(): SortByArrowUpProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortByArrowUpProps]
    }
    
    extension [Self <: SortByArrowUpProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[SortByArrowUpProps]
  
  /* This means you don't have to write `default`, but can instead just say `sortByArrowUpMod.foo` */
  override def _to: SFC[SortByArrowUpProps] = default
}
