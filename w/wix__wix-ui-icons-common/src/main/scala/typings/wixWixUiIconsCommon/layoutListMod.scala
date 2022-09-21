package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutListMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/LayoutList", JSImport.Default)
  @js.native
  val default: FC[LayoutListProps] = js.native
  
  trait LayoutListProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LayoutListProps {
    
    inline def apply(): LayoutListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutListProps]
    }
    
    extension [Self <: LayoutListProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LayoutListProps]
  
  /* This means you don't have to write `default`, but can instead just say `layoutListMod.foo` */
  override def _to: FC[LayoutListProps] = default
}
