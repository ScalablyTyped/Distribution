package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsForwardTopSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/ForwardTopSmall", JSImport.Default)
  @js.native
  val default: FC[ForwardTopSmallProps] = js.native
  
  trait ForwardTopSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ForwardTopSmallProps {
    
    inline def apply(): ForwardTopSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ForwardTopSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ForwardTopSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ForwardTopSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsForwardTopSmallMod.foo` */
  override def _to: FC[ForwardTopSmallProps] = default
}
