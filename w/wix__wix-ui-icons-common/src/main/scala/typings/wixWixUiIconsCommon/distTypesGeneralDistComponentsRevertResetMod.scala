package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsRevertResetMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/RevertReset", JSImport.Default)
  @js.native
  val default: FC[RevertResetProps] = js.native
  
  trait RevertResetProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object RevertResetProps {
    
    inline def apply(): RevertResetProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RevertResetProps]
    }
    
    extension [Self <: RevertResetProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[RevertResetProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsRevertResetMod.foo` */
  override def _to: FC[RevertResetProps] = default
}
