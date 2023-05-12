package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsBackwardBottomSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/BackwardBottomSmall", JSImport.Default)
  @js.native
  val default: FC[BackwardBottomSmallProps] = js.native
  
  trait BackwardBottomSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object BackwardBottomSmallProps {
    
    inline def apply(): BackwardBottomSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackwardBottomSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BackwardBottomSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[BackwardBottomSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsBackwardBottomSmallMod.foo` */
  override def _to: FC[BackwardBottomSmallProps] = default
}
