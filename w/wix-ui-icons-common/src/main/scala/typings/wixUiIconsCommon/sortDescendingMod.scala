package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortDescendingMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SortDescending", JSImport.Default)
  @js.native
  val default: FC[SortDescendingProps] = js.native
  
  trait SortDescendingProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SortDescendingProps {
    
    inline def apply(): SortDescendingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortDescendingProps]
    }
    
    extension [Self <: SortDescendingProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SortDescendingProps]
  
  /* This means you don't have to write `default`, but can instead just say `sortDescendingMod.foo` */
  override def _to: FC[SortDescendingProps] = default
}
