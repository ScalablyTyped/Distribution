package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsPromoteFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PromoteFilled", JSImport.Default)
  @js.native
  val default: FC[PromoteFilledProps] = js.native
  
  trait PromoteFilledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PromoteFilledProps {
    
    inline def apply(): PromoteFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PromoteFilledProps]
    }
    
    extension [Self <: PromoteFilledProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PromoteFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsPromoteFilledMod.foo` */
  override def _to: FC[PromoteFilledProps] = default
}
