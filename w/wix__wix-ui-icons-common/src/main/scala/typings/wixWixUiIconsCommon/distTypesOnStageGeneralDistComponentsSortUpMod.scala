package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageGeneralDistComponentsSortUpMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/SortUp", JSImport.Default)
  @js.native
  val default: FC[SortUpProps] = js.native
  
  trait SortUpProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SortUpProps {
    
    inline def apply(): SortUpProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortUpProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SortUpProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SortUpProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageGeneralDistComponentsSortUpMod.foo` */
  override def _to: FC[SortUpProps] = default
}
