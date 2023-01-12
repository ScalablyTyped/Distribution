package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsDropShadowRightMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/DropShadowRight", JSImport.Default)
  @js.native
  val default: FC[DropShadowRightProps] = js.native
  
  trait DropShadowRightProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DropShadowRightProps {
    
    inline def apply(): DropShadowRightProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropShadowRightProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropShadowRightProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DropShadowRightProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsDropShadowRightMod.foo` */
  override def _to: FC[DropShadowRightProps] = default
}
