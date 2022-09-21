package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortAZSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/SortAZSmall", JSImport.Default)
  @js.native
  val default: FC[SortAZSmallProps] = js.native
  
  trait SortAZSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SortAZSmallProps {
    
    inline def apply(): SortAZSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortAZSmallProps]
    }
    
    extension [Self <: SortAZSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SortAZSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `sortAZSmallMod.foo` */
  override def _to: FC[SortAZSmallProps] = default
}
