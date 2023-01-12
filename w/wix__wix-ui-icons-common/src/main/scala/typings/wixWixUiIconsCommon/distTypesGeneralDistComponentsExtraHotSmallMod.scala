package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsExtraHotSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/ExtraHotSmall", JSImport.Default)
  @js.native
  val default: FC[ExtraHotSmallProps] = js.native
  
  trait ExtraHotSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ExtraHotSmallProps {
    
    inline def apply(): ExtraHotSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtraHotSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtraHotSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ExtraHotSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsExtraHotSmallMod.foo` */
  override def _to: FC[ExtraHotSmallProps] = default
}
