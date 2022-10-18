package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsStatusWarningSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/StatusWarningSmall", JSImport.Default)
  @js.native
  val default: FC[StatusWarningSmallProps] = js.native
  
  trait StatusWarningSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object StatusWarningSmallProps {
    
    inline def apply(): StatusWarningSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusWarningSmallProps]
    }
    
    extension [Self <: StatusWarningSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[StatusWarningSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsStatusWarningSmallMod.foo` */
  override def _to: FC[StatusWarningSmallProps] = default
}
