package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSystemDistComponentsSortByArrowDownMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/SortByArrowDown", JSImport.Default)
  @js.native
  val default: FC[SortByArrowDownProps] = js.native
  
  trait SortByArrowDownProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SortByArrowDownProps {
    
    inline def apply(): SortByArrowDownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortByArrowDownProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SortByArrowDownProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SortByArrowDownProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcSystemDistComponentsSortByArrowDownMod.foo` */
  override def _to: FC[SortByArrowDownProps] = default
}
