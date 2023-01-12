package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsStatusWarningFilledMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/StatusWarningFilled", JSImport.Default)
  @js.native
  val default: FC[StatusWarningFilledProps] = js.native
  
  trait StatusWarningFilledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object StatusWarningFilledProps {
    
    inline def apply(): StatusWarningFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusWarningFilledProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatusWarningFilledProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[StatusWarningFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsStatusWarningFilledMod.foo` */
  override def _to: FC[StatusWarningFilledProps] = default
}
