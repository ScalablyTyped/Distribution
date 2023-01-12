package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsSortAZMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/SortAZ", JSImport.Default)
  @js.native
  val default: FC[SortAZProps] = js.native
  
  trait SortAZProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SortAZProps {
    
    inline def apply(): SortAZProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortAZProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SortAZProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SortAZProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsSortAZMod.foo` */
  override def _to: FC[SortAZProps] = default
}
