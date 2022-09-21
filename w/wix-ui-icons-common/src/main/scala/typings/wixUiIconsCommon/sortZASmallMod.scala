package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortZASmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SortZASmall", JSImport.Default)
  @js.native
  val default: FC[SortZASmallProps] = js.native
  
  trait SortZASmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SortZASmallProps {
    
    inline def apply(): SortZASmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortZASmallProps]
    }
    
    extension [Self <: SortZASmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SortZASmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `sortZASmallMod.foo` */
  override def _to: FC[SortZASmallProps] = default
}
