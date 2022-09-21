package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortDescendingSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SortDescendingSmall", JSImport.Default)
  @js.native
  val default: FC[SortDescendingSmallProps] = js.native
  
  trait SortDescendingSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SortDescendingSmallProps {
    
    inline def apply(): SortDescendingSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortDescendingSmallProps]
    }
    
    extension [Self <: SortDescendingSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SortDescendingSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `sortDescendingSmallMod.foo` */
  override def _to: FC[SortDescendingSmallProps] = default
}
