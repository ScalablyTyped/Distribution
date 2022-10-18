package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsPromoteSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PromoteSmall", JSImport.Default)
  @js.native
  val default: FC[PromoteSmallProps] = js.native
  
  trait PromoteSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PromoteSmallProps {
    
    inline def apply(): PromoteSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PromoteSmallProps]
    }
    
    extension [Self <: PromoteSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PromoteSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsPromoteSmallMod.foo` */
  override def _to: FC[PromoteSmallProps] = default
}
