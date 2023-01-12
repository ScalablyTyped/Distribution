package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsSortZAMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SortZA", JSImport.Default)
  @js.native
  val default: FC[SortZAProps] = js.native
  
  trait SortZAProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SortZAProps {
    
    inline def apply(): SortZAProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortZAProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SortZAProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SortZAProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsSortZAMod.foo` */
  override def _to: FC[SortZAProps] = default
}
